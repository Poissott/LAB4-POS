package ee.ut.math.tvt.salessystem.dataobjects;

import org.junit.Test;
import static org.junit.Assert.*;

public class StockItemv1 {

	@Test(timeout = 4000)
	public void testCreatesStockItemAndCallsSetQuantity() throws Throwable {
	    Long long0 = new Long(2468L);
	    StockItem stockItem0 = new StockItem(long0, "quo~XI'", "", 2468L, 2);
	    stockItem0.setQuantity(862);
	    assertEquals(862, stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetQuantityReturningPositive() throws Throwable {
	    Long long0 = new Long(2468L);
	    StockItem stockItem0 = new StockItem(long0, "quo~XI'", "", 2468L, 2);
	    int int0 = stockItem0.getQuantity();
	    assertEquals(2, int0);
	    assertEquals(2468.0, stockItem0.getPrice(), 0.01);
	    assertEquals("quo~XI'", stockItem0.getName());
	    assertEquals("", stockItem0.getDescription());
	}

	@Test(timeout = 4000)
	public void testGetQuantityReturningZero() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    int int0 = stockItem0.getQuantity();
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testGetPriceReturningPositive() throws Throwable {
	    Long long0 = new Long(1L);
	    StockItem stockItem0 = new StockItem(long0, (String) null, "", 1L, (-1));
	    double double0 = stockItem0.getPrice();
	    assertEquals(1.0, double0, 0.01);
	    assertEquals((-1), stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testCreatesStockItemAndCallsToString() throws Throwable {
	    Long long0 = new Long(2468L);
	    StockItem stockItem0 = new StockItem(long0, "quo~XI'", "", 2468L, 2);
	    String string0 = stockItem0.toString();
	    assertEquals("StockItem{id=2468, name='quo~XI''}", string0);
	    assertEquals(2, stockItem0.getQuantity());
	    assertEquals(2468.0, stockItem0.getPrice(), 0.01);
	    assertEquals("", stockItem0.getDescription());
	}

	@Test(timeout = 4000)
	public void testGetIdReturningZero() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    Long long0 = new Long(0L);
	    stockItem0.setId(long0);
	    Long long1 = stockItem0.getId();
	    assertEquals(0L, (long) long1);
	}

	@Test(timeout = 4000)
	public void testCreatesStockItemAndCallsSetDescription() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    stockItem0.setDescription("mjBel");
	    assertNull(stockItem0.getName());
	}

	@Test(timeout = 4000)
	public void testGetNameReturningNull() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    String string0 = stockItem0.getName();
	    assertNull(string0);
	}

	@Test(timeout = 4000)
	public void testGetDescriptionReturningEmptyString() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "kd/~", "", (-2460.5427), 2458);
	    String string0 = stockItem0.getDescription();
	    assertEquals("", string0);
	    assertEquals(2458, stockItem0.getQuantity());
	    assertEquals((-2460.5427), stockItem0.getPrice(), 0.01);
	    assertEquals("kd/~", stockItem0.getName());
	}

	@Test(timeout = 4000)
	public void testGetPriceReturningZero() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    double double0 = stockItem0.getPrice();
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetId() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "kd/~", "", (-2460.5427), 2458);
	    Long long0 = new Long(2458);
	    stockItem0.setId(long0);
	    stockItem0.getId();
	    assertEquals("kd/~", stockItem0.getName());
	    assertEquals((-2460.5427), stockItem0.getPrice(), 0.01);
	    assertEquals(2458, stockItem0.getQuantity());
	    assertEquals("", stockItem0.getDescription());
	}

	@Test(timeout = 4000)
	public void testGetName() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    stockItem0.setName("");
	    String string0 = stockItem0.getName();
	    assertEquals("", string0);
	}

	@Test(timeout = 4000)
	public void testGetPrice() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "", "StockItem{id=%d, name='%s'}", 0.0, (-1544));
	    stockItem0.setPrice((-1618.1661787196506));
	    double double0 = stockItem0.getPrice();
	    assertEquals((-1618.1661787196506), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testCreatesStockItemAndCallsGetDescription() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "", "StockItem{id=%d, name='%s'}", 0.0, (-1544));
	    String string0 = stockItem0.getDescription();
	    assertEquals("", stockItem0.getName());
	    assertEquals((-1544), stockItem0.getQuantity());
	    assertEquals(0.0, stockItem0.getPrice(), 0.01);
	    assertEquals("StockItem{id=%d, name='%s'}", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesStockItemAndCallsGetPrice() throws Throwable {
	    Long long0 = new Long(1L);
	    StockItem stockItem0 = new StockItem(long0, (String) null, "", 1L, (-1));
	    double double0 = stockItem0.getPrice();
	    assertEquals(1.0, double0, 0.01);
	    assertEquals((-1), stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testCreatesStockItemAndCallsGetName() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    String string0 = stockItem0.getName();
	    assertNull(string0);
	}

	@Test(timeout = 4000)
	public void testGetDescriptionReturningNonEmptyString() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "", "StockItem{id=%d, name='%s'}", 0.0, (-1544));
	    String string0 = stockItem0.getDescription();
	    assertEquals("", stockItem0.getName());
	    assertEquals((-1544), stockItem0.getQuantity());
	    assertEquals(0.0, stockItem0.getPrice(), 0.01);
	    assertEquals("StockItem{id=%d, name='%s'}", string0);
	}

	@Test(timeout = 4000)
	public void testSetDescription() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    stockItem0.setDescription("mjBel");
	    assertNull(stockItem0.getName());
	}

	@Test(timeout = 4000)
	public void testGetIdReturningPositive() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "kd/~", "", (-2460.5427), 2458);
	    Long long0 = new Long(2458);
	    stockItem0.setId(long0);
	    stockItem0.getId();
	    assertEquals("kd/~", stockItem0.getName());
	    assertEquals((-2460.5427), stockItem0.getPrice(), 0.01);
	    assertEquals(2458, stockItem0.getQuantity());
	    assertEquals("", stockItem0.getDescription());
	}

	@Test(timeout = 4000)
	public void testSetPrice() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "", "StockItem{id=%d, name='%s'}", 0.0, (-1544));
	    stockItem0.setPrice((-1618.1661787196506));
	    double double0 = stockItem0.getPrice();
	    assertEquals((-1618.1661787196506), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetQuantityReturningNegative() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "", "StockItem{id=%d, name='%s'}", 0.0, (-1544));
	    int int0 = stockItem0.getQuantity();
	    assertEquals("StockItem{id=%d, name='%s'}", stockItem0.getDescription());
	    assertEquals((-1544), int0);
	    assertEquals(0.0, stockItem0.getPrice(), 0.01);
	    assertEquals("", stockItem0.getName());
	}

	@Test(timeout = 4000)
	public void testCreatesStockItemAndCallsGetQuantity() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    int int0 = stockItem0.getQuantity();
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testGetNameReturningNonEmptyString() throws Throwable {
	    Long long0 = new Long(2468L);
	    StockItem stockItem0 = new StockItem(long0, "quo~XI'", "", 2468L, 2);
	    String string0 = stockItem0.getName();
	    assertEquals("quo~XI'", string0);
	    assertEquals(2, stockItem0.getQuantity());
	    assertEquals("", stockItem0.getDescription());
	    assertEquals(2468.0, stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testCreatesStockItemAndCallsGetId() throws Throwable {
	    Long long0 = new Long((-805L));
	    StockItem stockItem0 = new StockItem(long0, "", "(e*|.<?rh+-h", (-805L), (-1));
	    stockItem0.getId();
	    assertEquals("(e*|.<?rh+-h", stockItem0.getDescription());
	    assertEquals((-1), stockItem0.getQuantity());
	    assertEquals("", stockItem0.getName());
	    assertEquals((-805.0), stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testToString() throws Throwable {
	    Long long0 = new Long(2468L);
	    StockItem stockItem0 = new StockItem(long0, "quo~XI'", "", 2468L, 2);
	    String string0 = stockItem0.toString();
	    assertEquals("StockItem{id=2468, name='quo~XI''}", string0);
	    assertEquals(2, stockItem0.getQuantity());
	    assertEquals(2468.0, stockItem0.getPrice(), 0.01);
	    assertEquals("", stockItem0.getDescription());
	}

	@Test(timeout = 4000)
	public void testGetIdReturningNull() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    Long long0 = stockItem0.getId();
	    assertNull(long0);
	}

	@Test(timeout = 4000)
	public void testGetIdReturningNegative() throws Throwable {
	    Long long0 = new Long((-805L));
	    StockItem stockItem0 = new StockItem(long0, "", "(e*|.<?rh+-h", (-805L), (-1));
	    stockItem0.getId();
	    assertEquals("(e*|.<?rh+-h", stockItem0.getDescription());
	    assertEquals((-1), stockItem0.getQuantity());
	    assertEquals("", stockItem0.getName());
	    assertEquals((-805.0), stockItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testSetQuantity() throws Throwable {
	    Long long0 = new Long(2468L);
	    StockItem stockItem0 = new StockItem(long0, "quo~XI'", "", 2468L, 2);
	    stockItem0.setQuantity(862);
	    assertEquals(862, stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetDescriptionReturningNull() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    String string0 = stockItem0.getDescription();
	    assertNull(string0);
	}

	@Test(timeout = 4000)
	public void testSetName() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    stockItem0.setName("");
	    String string0 = stockItem0.getName();
	    assertEquals("", string0);
	}

}
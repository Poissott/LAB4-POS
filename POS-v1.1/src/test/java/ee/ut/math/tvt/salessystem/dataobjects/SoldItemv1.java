package ee.ut.math.tvt.salessystem.dataobjects;

import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;

public class SoldItemv1 {

	@Test(timeout = 4000)
	public void testGetQuantityReturningPositive() throws Throwable {
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "ee.ut.math.tvt.salessystem.dataobjects.SoldItem", "", 0.0, (-2973));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-351));
	    Integer integer0 = new Integer(3084);
	    soldItem0.setQuantity(integer0);
	    Integer integer1 = soldItem0.getQuantity();
	    assertEquals(3084, (int) integer1);
	}

	@Test(timeout = 4000)
	public void testGetQuantityReturningZero() throws Throwable {
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, (String) null, "StockItem{id=%d, name='%s'}", 0.0, 2);
	    SoldItem soldItem0 = new SoldItem(stockItem0, 2734);
	    Integer integer0 = new Integer(0);
	    soldItem0.setQuantity(integer0);
	    Integer integer1 = soldItem0.getQuantity();
	    assertEquals(0, (int) integer1);
	}

	@Test(timeout = 4000)
	public void testCreatesSoldItemAndCallsGetPrice() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    double double0 = soldItem0.getPrice();
	    assertEquals(0.0, double0, 0.01);
	    assertEquals(0, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetPriceReturningPositive() throws Throwable {
	    Long long0 = new Long((-1662L));
	    StockItem stockItem0 = new StockItem(long0, "ee.ut.math.tvt.salessystem.dataobjects.StockItem", "V", (-1662L), 1);
	    stockItem0.setPrice(940.734147);
	    SoldItem soldItem0 = new SoldItem(stockItem0, 1);
	    double double0 = soldItem0.getPrice();
	    assertEquals(940.734147, double0, 0.01);
	    assertEquals(1, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testCreatesSoldItemAndCallsGetId() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    soldItem0.getId();
	    assertEquals(0, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testFailsToCreateSoldItemThrowsNullPointerException() throws Throwable {
	    SoldItem soldItem0 = new SoldItem((StockItem) null, 0);
	}

	@Test(timeout = 4000)
	public void testGetIdReturningZero() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    Long long0 = new Long(0);
	    soldItem0.setId(long0);
	    soldItem0.getId();
	    assertEquals(0, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetNameReturningNull() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    soldItem0.getName();
	    assertEquals(0, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetPriceReturningZero() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    double double0 = soldItem0.getPrice();
	    assertEquals(0.0, double0, 0.01);
	    assertEquals(0, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningStockItemWhereGetPriceIsPositive() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long((-1203L));
	    StockItem stockItem0 = new StockItem(long0, "", "", 2359.933387262383, (-4200));
	    soldItem0.setStockItem(stockItem0);
	    StockItem stockItem1 = soldItem0.getStockItem();
	    assertEquals("", stockItem1.getName());
	}

	@Test(timeout = 4000)
	public void testCreatesSoldItemAndCallsToString() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    String string0 = soldItem0.toString();
	    assertEquals(0, (int) soldItem0.getQuantity());
	    assertEquals("SoldItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testGetId() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    Long long0 = new Long(0);
	    soldItem0.setId(long0);
	    soldItem0.getId();
	    assertEquals(0, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetName() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setName("");
	    String string0 = soldItem0.getName();
	    assertEquals("", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesSoldItemAndCallsGetSum() throws Throwable {
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "ee.ut.math.tvt.salessystem.dataobjects.SoldItem", "", 0.0, (-2973));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-351));
	    double double0 = soldItem0.getSum();
	    assertEquals(-0.0, double0, 0.01);
	    assertEquals((-351), (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testCreatesSoldItemAndCallsGetName() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "StockItem{id=%d, name='%s'}", "SoldItem{id=%d, name='%s'}", (-6597.3648972073), 556);
	    SoldItem soldItem0 = new SoldItem(stockItem0, 556);
	    soldItem0.getName();
	    assertEquals(556, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testCreatesSoldItemAndCallsGetStockItem() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = soldItem0.getStockItem();
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testGetPriceReturningNegative() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "StockItem{id=%d, name='%s'}", "StockItem{id=%d, name='%s'}", (-1086.073717674), 0);
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-504));
	    double double0 = soldItem0.getPrice();
	    assertEquals((-1086.073717674), double0, 0.01);
	    assertEquals(547381.153707696, soldItem0.getSum(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningStockItemWhereGetPriceIsNegative() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = new StockItem();
	    stockItem0.setPrice((-1.0));
	    soldItem0.setStockItem(stockItem0);
	    StockItem stockItem1 = soldItem0.getStockItem();
	    assertNull(stockItem1.getId());
	}

	@Test(timeout = 4000)
	public void testCreatesSoldItemAndCallsGetQuantity() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Integer integer0 = soldItem0.getQuantity();
	    assertNull(integer0);
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningNull() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = soldItem0.getStockItem();
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testGetIdReturningPositive() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long(110L);
	    soldItem0.setId(long0);
	    Long long1 = soldItem0.getId();
	    assertEquals(110L, (long) long1);
	}

	@Test(timeout = 4000)
	public void testSetPrice() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setPrice((-1.0));
	    Integer integer0 = new Integer((-1));
	    soldItem0.setQuantity(integer0);
	    double double0 = soldItem0.getSum();
	    assertEquals((-1.0), soldItem0.getPrice(), 0.01);
	    assertEquals(1.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetSumThrowsNullPointerException() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    // Undeclared exception!
	    soldItem0.getSum();
	}

	@Test(timeout = 4000)
	public void testGetSum() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setPrice((-1.0));
	    Integer integer0 = new Integer((-1));
	    soldItem0.setQuantity(integer0);
	    double double0 = soldItem0.getSum();
	    assertEquals((-1.0), soldItem0.getPrice(), 0.01);
	    assertEquals(1.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetQuantityReturningNegative() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "StockItem{id=%d, name='%s'}", "StockItem{id=%d, name='%s'}", (-1086.073717674), 0);
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-504));
	    Integer integer0 = soldItem0.getQuantity();
	    assertEquals((-504), (int) integer0);
	}

	@Test(timeout = 4000)
	public void testGetQuantityReturningNull() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Integer integer0 = soldItem0.getQuantity();
	    assertNull(integer0);
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningStockItemWhereGetPriceIsZero() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    stockItem0.setQuantity(1833);
	    soldItem0.getStockItem();
	    assertEquals(0, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetNameReturningNonEmptyString() throws Throwable {
	    StockItem stockItem0 = new StockItem((Long) null, "StockItem{id=%d, name='%s'}", "SoldItem{id=%d, name='%s'}", (-6597.3648972073), 556);
	    SoldItem soldItem0 = new SoldItem(stockItem0, 556);
	    soldItem0.getName();
	    assertEquals(556, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetIdReturningNull() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    soldItem0.getId();
	    assertEquals(0, (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testToString() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    String string0 = soldItem0.toString();
	    assertEquals(0, (int) soldItem0.getQuantity());
	    assertEquals("SoldItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testGetStockItem() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long((-1203L));
	    StockItem stockItem0 = new StockItem(long0, "", "", 2359.933387262383, (-4200));
	    soldItem0.setStockItem(stockItem0);
	    StockItem stockItem1 = soldItem0.getStockItem();
	    assertEquals("", stockItem1.getName());
	}

	@Test(timeout = 4000)
	public void testGetIdReturningNegative() throws Throwable {
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "ee.ut.math.tvt.salessystem.dataobjects.SoldItem", "", 0.0, (-2973));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-351));
	    Long long1 = new Long((-351));
	    soldItem0.setId(long1);
	    soldItem0.getId();
	    assertEquals((-351), (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetSumReturningZero() throws Throwable {
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "ee.ut.math.tvt.salessystem.dataobjects.SoldItem", "", 0.0, (-2973));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-351));
	    double double0 = soldItem0.getSum();
	    assertEquals(-0.0, double0, 0.01);
	    assertEquals((-351), (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testFailsToCreateSoldItemTaking2ArgumentsThrowsNullPointerException() throws Throwable {
	    SoldItem soldItem0 = new SoldItem((StockItem) null, 0);
	}

	@Test(timeout = 4000)
	public void testGetSumReturningNegative() throws Throwable {
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "ee.ut.math.tvt.salessystem.dataobjects.SoldItem", "", 0.0, (-2973));
	    stockItem0.setPrice((-351));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-351));
	    Integer integer0 = new Integer(3084);
	    soldItem0.setQuantity(integer0);
	    double double0 = soldItem0.getSum();
	    assertEquals((-1082484.0), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetQuantity() throws Throwable {
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, (String) null, "StockItem{id=%d, name='%s'}", 0.0, 2);
	    SoldItem soldItem0 = new SoldItem(stockItem0, 2734);
	    Integer integer0 = new Integer(0);
	    soldItem0.setQuantity(integer0);
	    Integer integer1 = soldItem0.getQuantity();
	    assertEquals(0, (int) integer1);
	}

	@Test(timeout = 4000)
	public void testSetName() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setName("");
	    String string0 = soldItem0.getName();
	    assertEquals("", string0);
	}

}
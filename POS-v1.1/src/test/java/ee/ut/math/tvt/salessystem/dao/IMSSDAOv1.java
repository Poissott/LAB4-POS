package ee.ut.math.tvt.salessystem.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;
import java.util.List;

public class IMSSDAOv1 {

	@Test(timeout = 4000)
	public void testFindStockItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = new StockItem();
	    Long long0 = new Long(3201L);
	    stockItem0.setQuantity((-1));
	    stockItem0.setId(long0);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem(3201L);
	    assertEquals((-1), stockItem1.getQuantity());
	    assertNotNull(stockItem1);
	}

	@Test(timeout = 4000)
	public void testRollbackTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.rollbackTransaction();
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningStockItemWhereGetPriceIsZero() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = new StockItem();
	    Long long0 = new Long(3201L);
	    stockItem0.setQuantity((-1));
	    stockItem0.setId(long0);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem(3201L);
	    assertEquals((-1), stockItem1.getQuantity());
	    assertNotNull(stockItem1);
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningStockItemWhereGetPriceIsPositive() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = new StockItem();
	    Long long0 = new Long(3201L);
	    stockItem0.setPrice(3201L);
	    stockItem0.setId(long0);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem(3201L);
	    assertNotNull(stockItem1);
	    assertEquals(3201.0, stockItem1.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningNull() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(1819L);
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testCreatesInMemorySalesSystemDAOAndCallsRollbackTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.rollbackTransaction();
	}

	@Test(timeout = 4000)
	public void testFindStockItemThrowsNullPointerException() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = new StockItem();
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    // Undeclared exception!
	    inMemorySalesSystemDAO0.findStockItem(0L);
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningStockItemWhereGetPriceIsNegative() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    Long long0 = new Long((-3208L));
	    StockItem stockItem0 = new StockItem(long0, "vjG-;88oc*HXlw6S", "Beer sauseges", (-3208L), 2290);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem((-3208L));
	    assertNotNull(stockItem1);
	    assertEquals((-3208.0), stockItem1.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testBeginTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.beginTransaction();
	}

	@Test(timeout = 4000)
	public void testCreatesInMemorySalesSystemDAOAndCallsFindStockItems() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    List<StockItem> list0 = inMemorySalesSystemDAO0.findStockItems();
	    assertFalse(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testCreatesInMemorySalesSystemDAOAndCallsFindStockItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(1819L);
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testCommitTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.commitTransaction();
	}

	@Test(timeout = 4000)
	public void testCreatesInMemorySalesSystemDAOAndCallsBeginTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.beginTransaction();
	}

	@Test(timeout = 4000)
	public void testCreatesInMemorySalesSystemDAOAndCallsCommitTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.commitTransaction();
	}

	@Test(timeout = 4000)
	public void testFindStockItems() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    List<StockItem> list0 = inMemorySalesSystemDAO0.findStockItems();
	    assertFalse(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testCreatesInMemorySalesSystemDAOAndCallsSaveSoldItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    SoldItem soldItem0 = new SoldItem();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    assertNull(soldItem0.getId());
	}

	@Test(timeout = 4000)
	public void testSaveSoldItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    SoldItem soldItem0 = new SoldItem();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    assertNull(soldItem0.getId());
	}

}
package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {
Item item1=new Item("apple",200);
Item item2=new Item("book",2000);
Item item =new Item(null,0);




	
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		ItemStock itemStock=new ItemStock();
		int result=itemStock.getNum(item);
		//System.out.println(result);
		assertEquals(0,result,"getNumが「0」ではありません。");
	}
	@Test
	void test2() {
		ItemStock itemStock=new ItemStock();
		itemStock.add(item);
		
		int result=itemStock.getNum(item);
		System.out.println(result);
		assertEquals(1,result,"getNumが「1」ではありません。");
	}
	@Test
	void test3() {
		ItemStock itemStock=new ItemStock();
		itemStock.add(item1);
		itemStock.add(item1);
		itemStock.getNum(item1);
		
		int result=itemStock.getNum(item1);
		System.out.println(result);
		assertEquals(2,result,"getNumが「2」ではありません。");
	}
	@Test
	void test4() {
		ItemStock itemStock=new ItemStock();
		itemStock.add(item);
		itemStock.add(item1);
		itemStock.getNum(item);
		
		int result=itemStock.getNum(item);
		System.out.println(result);
		assertEquals(2,result,"getNumが「2」ではありません。");
	}



}

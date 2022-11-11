package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

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
		Counter counter=new Counter();
		int result=counter.increment();
		assertEquals(1,result,"incrementが「1」ではありません。");
		//System.out.println(result);
	}
	
	@Test
	void test2() {
		Counter counter=new Counter();
		int result=counter.increment();
		while(result<=50)	{
			result++;
			result=counter.increment();
			assertEquals(51,result,"incrementが「51」ではありません。");
		System.out.println(result);
		}
	}

}

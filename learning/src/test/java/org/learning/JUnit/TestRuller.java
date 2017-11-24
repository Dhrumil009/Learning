package org.learning.JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

public class TestRuller {
	
	@Rule
	public final MyCustomRule cust=new MyCustomRule();
//	  @Rule
//	  public ExpectedException exception = ExpectedException.none();
//	
	@Test
    public void example() {
        assertTrue(true);
    }
	
//	@Test
//    public void example1() {
//		assertEquals(1, 1);
//        
//    }
	
	@Before
	public void getBMessage() {
		System.out.println("Hello Before");
	}

	@After
	public void getAMessage() {
		System.out.println("Hello After");
	}

	@BeforeClass
	public static void getABMessage() {
		System.out.println("Hello BeforeClass");
	}

	@AfterClass
	public static void getAAMessage() {
		System.out.println("Hello AfterClass");
	}

}


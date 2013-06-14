package br.com.wrn.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestObserver {
	
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	/* TESTS */

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}

package br.com.wrn.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestObserver {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}


	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}

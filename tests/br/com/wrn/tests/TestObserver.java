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
		System.out.println("Configure folder and observer");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Start observer");
		System.out.println("Init observing");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Stop observing");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("turn the folder to initial state");
	}

	@Test
	public void testAdd() {
		assertTrue("Add", true);
	}
	
	@Test
	public void testUpdate() {
		assertTrue("Update", true);
	}
	
	@Test
	public void testRemove() {
		assertTrue("Remove", true);
	}
}

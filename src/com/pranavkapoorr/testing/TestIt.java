package com.pranavkapoorr.testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestIt {
	@Test
	public void testAdd() {
		assertEquals("Addition Test!",2, new ToTest().add(1, 1));
	}
	
	@Test
	public void testRemoveDuplicates() {
		assertEquals("Remove Duplicates",Arrays.asList(1,2,3,4,5,6), new ToTest().removeDuplicates(Arrays.asList(1,2,3,4,5,2,1,6)));
	}
	@Test
	public void testRemoveDuplicatesWithEmpty() {
		assertEquals("Remove Duplicates empty",Arrays.asList(), new ToTest().removeDuplicates(Arrays.asList()));
	}
	@Test
	public void testRemoveDuplicatesWithNull() {
		assertEquals("Remove Duplicates null",null, new ToTest().removeDuplicates(null));
	}

}

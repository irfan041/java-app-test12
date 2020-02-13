package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	App app=new App();

	@Test
	public void testProcess() {
		assertEquals(app.process("hello"), "HELLO");
	}
	@Test
	public void test1() {
		assertEquals(app.process("hi"), "hi");
	}

}

package test;

import junit.framework.Assert;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testSayHello() throws Exception {
		Hello hello = new Hello();
		Assert.assertEquals("hel", hello.sayHello());
	}

}

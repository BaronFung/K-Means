package test.java.com.kmeans;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.com.kmeans.A;

public class ATest {

	@Test
	public void test() {
		A a = new A();
		assertEquals(4, a.add(1, 3));
	}

}

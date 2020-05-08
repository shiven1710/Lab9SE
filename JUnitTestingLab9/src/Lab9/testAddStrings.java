package Lab9;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		//Correct Parameters
		JUnitTesting jt=new JUnitTesting();
		String a="Bat";
		String b="man";
		String actual=jt.addStrings(a,b);
		String expected="Batman";
		assertEquals(expected,actual);
		//Incorrect Parameters
//		String x="Spider-";
//		String y="Man";
//		actual=jt.addStrings(x,y);
//		expected="Spider-man";
//		assertEquals(expected,actual);
	}

}

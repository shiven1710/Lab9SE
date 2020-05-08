package Lab9;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		//Correct Parameters
		JUnitTesting jt=new JUnitTesting();
		int a=3;
		int b=5;
		int actual=jt.addNumbers(a,b);
		int expected=8;
		assertEquals(expected,actual);
		//Incorrect Parameters
//		int x='1';
//		int y='2';
//		actual=jt.addNumbers(x,y);
//		expected=3;
//		assertEquals(expected,actual);
	}

}

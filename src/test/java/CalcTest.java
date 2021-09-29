import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalcTest {
	@Test
	public void addTest(){
		//given
		Calc calc = new Calc();
		int x = 100;
		int y = 60;
		int expected = 160;

		//when
		int actual = calc.add(x,y);

		//then
		assertEquals(expected, actual);
	}
	@Test
	public void subTest(){
		//given
		Calc calc = new Calc();
		int x = 100;
		int y = 60;
		int expected = 40;

		//when
		int actual = calc.add(x,y);

		//then
		assertEquals(expected, actual);
	}
	@Test
	public void multiTest(){
		//given
		Calc calc = new Calc();
		int x = 100;
		int y = 2;
		int expected = 200;

		//when
		int actual = calc.add(x,y);

		//then
		assertEquals(expected, actual);
	}
	@Test
	public void divTest(){
		//given
		Calc calc = new Calc();
		int x = 50;
		int y = 2;
		int expected = 25;

		//when
		int actual = calc.div(x,y);

		//then
		assertEquals(expected, actual);
	}
	@Test
	public void expoTest(){
		//given
		Calc calc = new Calc();
		double x = 50.0;
		double y = 2.0;
		double expected = 2500;

		//when
		double actual = calc.expo(x,y);

		//then
		assertEquals(expected, actual, 1);

	}

}
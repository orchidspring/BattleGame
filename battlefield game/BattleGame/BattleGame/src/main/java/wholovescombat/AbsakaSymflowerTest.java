package wholovescombat;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AbsakaSymflowerTest {
	@Test
	public void Absaka1() {
		int numberOfClaws = 0;
		int numberOfLives = 0;
		int speed = 0;
		Absaka expected = new Absaka(0, 0, 0);
		Absaka actual = new Absaka(numberOfClaws, numberOfLives, speed);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void Absaka2() {
		String string = null;
		Absaka expected = new Absaka(null);
		Absaka actual = new Absaka(string);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void attack3() {
		Absaka a = new Absaka(0, 0, 0);
		char[] actual = a.attack();

		assertNull(actual);
	}

	@Test
	public void getGetDamage4() {
		Absaka a = new Absaka(0, 0, 0);
		boolean actual = a.getGetDamage();

		assertFalse(actual);
	}

	@Test
	public void getLooseClaw5() {
		Absaka a = new Absaka(0, 0, 0);
		int expected = 0;
		int actual = a.getLooseClaw();

		assertEquals(expected, actual);
	}

	@Test
	public void getNumberOfClaws6() {
		Absaka a = new Absaka(0, 0, 0);
		int expected = 0;
		int actual = a.getNumberOfClaws();

		assertEquals(expected, actual);
	}

	@Test
	public void getNumberOfLives7() {
		Absaka a = new Absaka(0, 0, 0);
		int expected = 0;
		int actual = a.getNumberOfLives();

		assertEquals(expected, actual);
	}

	@Test
	public void getSpeed8() {
		Absaka a = new Absaka(0, 0, 0);
		int expected = 0;
		int actual = a.getSpeed();

		assertEquals(expected, actual);
	}

	@Test
	public void isGetDamage9() {
		Absaka a = new Absaka(0, 0, 0);
		boolean actual = a.isGetDamage();

		assertFalse(actual);
	}

	@Test
	public void setGetDamage10() {
		Absaka a = new Absaka(0, 0, 0);
		boolean getDamage = false;
		a.setGetDamage(getDamage);

		Absaka aExpected = new Absaka(0, 0, 0);

		assertTrue(EqualsBuilder.reflectionEquals(aExpected, a, false, null, true));
	}

	@Test
	public void setLooseClaw11() {
		Absaka a = new Absaka(0, 0, 0);
		int LooseClaw = 0;
		a.setLooseClaw(LooseClaw);

		Absaka aExpected = new Absaka(0, 0, 0);

		assertTrue(EqualsBuilder.reflectionEquals(aExpected, a, false, null, true));
	}

	@Test
	public void setNumberOfClaws12() {
		Absaka a = new Absaka(0, 0, 0);
		int numberOfClaws = 0;
		a.setNumberOfClaws(numberOfClaws);

		Absaka aExpected = new Absaka(0, 0, 0);

		assertTrue(EqualsBuilder.reflectionEquals(aExpected, a, false, null, true));
	}

	@Test
	public void setNumberOfLives13() {
		Absaka a = new Absaka(0, 0, 0);
		int numberOfLives = 0;
		a.setNumberOfLives(numberOfLives);
	}

	@Test
	public void setNumberOfLives14() {
		Absaka a = new Absaka(0, 0, 0);
		int numberOfLives = 1;
		a.setNumberOfLives(numberOfLives);
	}

	@Test
	public void setSpeed15() {
		Absaka a = new Absaka(0, 0, 0);
		int speed = 0;
		a.setSpeed(speed);

		Absaka aExpected = new Absaka(0, 0, 0);

		assertTrue(EqualsBuilder.reflectionEquals(aExpected, a, false, null, true));
	}

	@Test
	public void toString16() {
		Absaka a = new Absaka(0, 0, 0);
		String expected = "{ speed=\'0\', numberOfLives=\'0\', numberOfClaws=\'0\', LooseClaw=\'0\', getDamage=\'false\'}";
		String actual = a.toString();

		assertEquals(expected, actual);
	}
}

package evivetest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class MainTest2 {
	Main main;
	@Test
	public void testMakeBreakfastObj() {
		String items = "1,2,3,3";
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    main.makeBreakfastObj(items);
	    String expectedOutput  = "Eggs, Toast, Coffee(2)";
		assertTrue(outContent.toString().contains(expectedOutput));
		items = "1,2";
		outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		main.makeBreakfastObj(items);
		expectedOutput = "Eggs, Toast, Water";
		assertTrue(outContent.toString().contains(expectedOutput));
	}
	@Test
	public void testMakeLunchObj() {
		// print with 2 sides
		String items = "1,2,2,3";
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    main.makeLunchObj(items);
	    String expectedOutput  = "Sandwich, Chips(2), Soda";
		assertTrue(outContent.toString().contains(expectedOutput));
		// print with water
		items = "1,2";
		outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		main.makeLunchObj(items);
		expectedOutput = "Sandwich, Chips, Water";
		assertTrue(outContent.toString().contains(expectedOutput));
	}
	@Test
	public void testMakeDinnerObj() {
		// print with wine
		String items = "1,2,3,4";
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    main.makeDinnerObj(items);
	    String expectedOutput  = "Steak, Potatoes, Wine, Water, Cake";
		assertTrue(outContent.toString().contains(expectedOutput));
		// print without wine
		items = "1,2,4";
		outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
		main.makeDinnerObj(items);
		expectedOutput = "Steak, Potatoes, Water, Cake";
		assertTrue(outContent.toString().contains(expectedOutput));
	}
//	@Test
//	public void testMakeLunchObj() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMakeDinnerObj() {
//		fail("Not yet implemented");
//	}

}

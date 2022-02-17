package evivetest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	Main main;
	
	// Breakfast items missing
	@Test
	public void testIsMissingMain() {
		//main missing
		String result = "Unable to process: Main is missing";
		String items = "2,3";
		String mealType = "Breakfast";
		assertEquals(result, main.isMissing(items, mealType));
	}
	@Test
	public void testIsMissingSide() {
		//main missing
		String result = "Unable to process: Side is missing";
		String items = "1,3";
		String mealType = "Breakfast";
		assertEquals(result, main.isMissing(items, mealType));
	}
	@Test
	public void testIsMissingMainandSide() {
		//main missing
		String result = "Unable to process: Main is missing, Side is missing";
		String items = "";
		String mealType = "Breakfast";
		assertEquals(result, main.isMissing(items, mealType));
	}
	// Breakfast too many orders
	@Test
	public void testIsMissingManyMain() {
		//too many main
		String result = "Unable to process: Eggs cannot be ordered more than once";
		String items = "1,1,2,3";
		String mealType = "Breakfast";
		assertEquals(result, main.isMissing(items, mealType));
	}
	@Test
	public void testIsMissingManySides() {
		//too many sides
		String result = "Unable to process: Toast cannot be ordered more than once";
		String items = "1,2,2,3";
		String mealType = "Breakfast";
		assertEquals(result, main.isMissing(items, mealType));
	}
	@Test
	public void testIsMissingManyMainandSides() {
		//too many sides
		String result = "Unable to process: Eggs or Toast cannot be ordered more than once";
		String items = "1,1,2,2,3";
		String mealType = "Breakfast";
		assertEquals(result, main.isMissing(items, mealType));
	}
	//Lunch items is missing
	@Test
	public void testIsMissingMainLunch() {
		//main missing
		String result = "Unable to process: Main is missing";
		String items = "2,3";
		String mealType = "Lunch";
		assertEquals(result, main.isMissing(items, mealType));
	}
	@Test
	public void testIsMissingSideLunch() {
		//main missing
		String result = "Unable to process: Side is missing";
		String items = "1,3";
		String mealType = "Lunch";
		assertEquals(result, main.isMissing(items, mealType));
	}
	@Test
	public void testIsMissingMainandSideLunch() {
		//main missing
		String result = "Unable to process: Main is missing, Side is missing";
		String items = "";
		String mealType = "Lunch";
		assertEquals(result, main.isMissing(items, mealType));
	}
	@Test
	public void testIsMissingManyMainLunch() {
		//too many main
		String result = "Unable to process: Sandwich cannot be ordered more than once";
		String items = "1,1,2,3";
		String mealType = "Lunch";
		assertEquals(result, main.isMissing(items, mealType));
	}
	@Test
	public void testIsMissingManyDrinkLunch() {
		//too many drink
		String result = "Unable to process: Soda cannot be ordered more than once";
		String items = "1,2,3,3";
		String mealType = "Lunch";
		assertEquals(result, main.isMissing(items, mealType));
	}
	@Test
	public void testIsMissingManyMainandDrinkLunch() {
		//too many main and drink
		String result = "Unable to process: Sandwich or Soda cannot be ordered more than once";
		String items = "1,1,2,3,3";
		String mealType = "Lunch";
		assertEquals(result, main.isMissing(items, mealType));
	}
	// Dinner is missing
	@Test
	public void testIsMissingDinner() {
		//main missing
		String result = "Unable to process: Main is missing, ";
		String items = "2,3,4";
		String mealType = "Dinner";
		assertEquals(result, main.isMissing(items, mealType));
		// side missing
		result = "Unable to process: Side is missing, ";
		items = "1,3,4";
		assertEquals(result, main.isMissing(items, mealType));
		// dessert is missing
		result = "Unable to process: Dessert is missing";
		items = "1,2,3";
		assertEquals(result, main.isMissing(items, mealType));
		// main and side missing
		result = "Unable to process: Main is missing, Side is missing, ";
		items = "3,4";
		assertEquals(result, main.isMissing(items, mealType));
		// main and dessert missing
		result = "Unable to process: Main is missing, Dessert is missing";
		items = "2,3";
		assertEquals(result, main.isMissing(items, mealType));
		// side and dessert missing
		result = "Unable to process: Side is missing, Dessert is missing";
		items = "1,3";
		assertEquals(result, main.isMissing(items, mealType));
	}
	@Test
	public void testIsMissingManny() {
		// too many main
		String result = "Unable to process: Steak cannot be ordered more than once";
		String items = "1,1,2,3,4";
		String mealType = "Dinner";
		assertEquals(result, main.isMissing(items, mealType));
		// too many side
		result = "Unable to process: Potatoes cannot be ordered more than once";
		items = "1,2,2,3,4";
		assertEquals(result, main.isMissing(items, mealType));
		// too many drink
		result = "Unable to process: Wine cannot be ordered more than once";
		items = "1,2,3,3,4";
		assertEquals(result, main.isMissing(items, mealType));
		// too many dessert
		result = "Unable to process: Cake cannot be ordered more than once";
		items = "1,2,3,4,4";
		assertEquals(result, main.isMissing(items, mealType));
		// too many main, side, drink, dessert
		result = "Unable to process: Steak or Potatoes or Wine or Cake cannot be ordered more than once";
		items = "1,1,2,2,3,3,4,4";
		assertEquals(result, main.isMissing(items, mealType));
		// too many main, side, drink
		result = "Unable to process: Steak or Potatoes or Wine cannot be ordered more than once";
		items = "1,1,2,2,3,3,4";
		assertEquals(result, main.isMissing(items, mealType));
		//too many main side dessert
		result = "Unable to process: Steak or Potatoes or Cake cannot be ordered more than once";
		items = "1,1,2,2,3,4,4";
		assertEquals(result, main.isMissing(items, mealType));
		// too many main drink dessert
		result = "Unable to process: Steak or Wine or Cake cannot be ordered more than once";
		items = "1,1,2,3,3,4,4";
		assertEquals(result, main.isMissing(items, mealType));
		// too many main, side
		result = "Unable to process: Steak or Potatoes cannot be ordered more than once";
		items = "1,1,2,2,3,4";
		assertEquals(result, main.isMissing(items, mealType));
		// too many main, drink
		result = "Unable to process: Steak or Wine cannot be ordered more than once";
		items = "1,1,2,3,3,4";
		assertEquals(result, main.isMissing(items, mealType));
		// too many main, dessert
		result = "Unable to process: Steak or Cake cannot be ordered more than once";
		items = "1,1,2,3,4,4";
		assertEquals(result, main.isMissing(items, mealType));
		// too many side, drink , dessert
		result = "Unable to process: Potatoes or Wine or Cake cannot be ordered more than once";
		items = "1,2,2,3,3,4,4";
		assertEquals(result, main.isMissing(items, mealType));
		// too many side drink
		result = "Unable to process: Potatoes or Wine cannot be ordered more than once";
		items = "1,2,2,3,3,4";
		assertEquals(result, main.isMissing(items, mealType));
		// too many side dessert
		result = "Unable to process: Potatoes or Cake cannot be ordered more than once";
		items = "1,2,2,3,4,4";
		assertEquals(result, main.isMissing(items, mealType));
		// too many drink, dessert
		result = "Unable to process: Wine or Cake cannot be ordered more than once";
		items = "1,2,3,3,4,4";
		assertEquals(result, main.isMissing(items, mealType));
	}
	// testing main
	@Test
	public void testMain() {
		
	}

}

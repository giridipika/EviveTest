package evivetest;
import java.util.Scanner;
class Meal {
	String main;
	String side;
	String drink;
	String water = "Water";	
}
class Breakfast extends Meal{
	public Breakfast() {
		main = "Eggs";
		side = "Toast";
		drink = "Coffee";
	}
	public void printAll(int count) {
		if(count == 0) {
			System.out.println(main+", "+side+", "+ water);
		}else if(count == 1){
			System.out.println(main+", "+side+", "+ drink);
		} else {
			System.out.println(main+", "+side+", "+ drink+"("+count+")");
		}
	}
}
class Lunch extends Meal{
	public Lunch() {
		main = "Sandwich";
		side = "Chips";
		drink = "Soda";
	}
	public void printAll(int count, int idx3) {
		// if idx is -1
		if(count == 1){
			if(idx3==-1) {
				System.out.println(main+", "+side+", "+ water);
			} else {
				System.out.println(main+", "+side+", "+ drink);
			}
		} else {
			if(idx3==-1) {
				System.out.println(main+", "+side+"("+count+")"+", "+ water);
			} else {
				System.out.println(main+", "+side+"("+count+")"+", "+ drink);
			}
		}
	}
}
class Dinner extends Meal{
	String dessert = "Cake";
	public Dinner() {
		main = "Steak";
		side = "Potatoes";
		drink = "Wine";
	}
	public void printAll(int idx3) {
		if(idx3 == -1) {
			System.out.println(main+", "+side+", "+ water +", "+ dessert);
		} else {
			System.out.println(main+", "+side+", "+ drink+ ", "+ water+ ", " + dessert);
		}
	}
}
class Main {
	public static String isMissing(String items, String mealType) {
		String result = "Unable to process: ";
		String mainMiss = "Main is missing";
		String sideMiss = "Side is missing";
		String dessertMiss = "Dessert is missing";
		String moreOrder = "cannot be ordered more than once";
		int idx1 = items.indexOf("1");
		int idx2 = items.indexOf("2");
		int idx3 = items.indexOf("3");
		int idx4 = items.indexOf("4");
		if(mealType.equals("Breakfast") || mealType.equals("Lunch")) {
			if(idx1 <0 && idx2<0) {
				return result+mainMiss+", "+sideMiss;
			} else if(idx2<0) {
				return result+sideMiss;
			} else if(idx1<0) {
				return result+mainMiss;
			}
			if(mealType.equals("Breakfast")) {
				// check for another main and dish
				idx1 = items.indexOf("1", idx1+1);
				idx2 = items.indexOf("2", idx2+1);
				if(idx1!=-1 && idx2!=-1) {
					return result+"Eggs or Toast "+ moreOrder;
				} else if(idx1!= -1) {
					return result+"Eggs "+moreOrder;
				} else if(idx2!=-1) {
					return result+"Toast "+moreOrder;
				} else {
					return result;
				}
			} else {
				idx1 = items.indexOf("1", idx1+1);
				idx3 = items.indexOf("3", idx3+1);
				if(idx1!=-1 && idx3!=-1) {
					return result+ "Sandwich or Soda "+moreOrder;
				} else if(idx1!= -1) {
					return result+"Sandwich "+moreOrder;
				} else if(idx3!=-1) {
					return result+"Soda "+moreOrder;
				} else {
					return result;
				}
			}
		} else if(mealType.equals("Dinner")) {
			if(idx1<0) {
				result = result+mainMiss+", ";
			}
			if(idx2<0) {
				result = result+sideMiss+", ";
			}
			if(idx4<0) {
				result = result+dessertMiss;
			}
			idx1 = items.indexOf("1", idx1+1);
			idx2 = items.indexOf("2", idx2+1);
			idx3 = items.indexOf("3", idx3+1);
			idx4 = items.indexOf("4", idx4+1);
			System.out.println(idx2);
			int count = 0;
			if(idx1>=0) {
				count ++;
				result = result+"Steak ";
			}
			if(idx2>=0) {
				if(count == 0) {
					result = result+"Potatoes ";
				}else {
					result = result+"or Potatoes ";
				}
				count++;
			}
			if(idx3>=0) {
				if(count == 0) {
					result = result+"Wine ";
				}else {
					result = result+"or Wine ";
				}
				count++;
			}
			if(idx4>=0) {
				if(count == 0) {
					result = result+"Cake ";
				}else {
					result = result+"or Cake ";
				}
				count++;
			}
			if(count>0) {
				result = result+moreOrder;
			}
		}
		return result;		
	}
	public static void makeBreakfastObj(String items) {
		Breakfast b1 = new Breakfast();
		// count drink
		int count;
		int idx3= items.indexOf("3");
		if(idx3>=0) {
			count = 0;
			while(idx3!=-1) {
				idx3 = items.indexOf("3", idx3+1);
				count++;
			}
		} else {
			count = 0;
		}
		b1.printAll(count);
	}
	public static void makeLunchObj(String items) {
		Lunch l1 = new Lunch();
		int count;
		int idx2= items.indexOf("2");
		int idx3 = items.indexOf("3");
		if(idx2>=0) {
			count = 0;
			while(idx2!=-1) {
				idx2 = items.indexOf("2", idx2+1);
				count++;
			}
		} else {
			count = 0;
		}
		//System.out.println(count);
		l1.printAll(count, idx3);
	}
	public static void makeDinnerObj(String items) {
		Dinner d1 = new Dinner();
		int idx3 = items.indexOf("3");
		d1.printAll(idx3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner obj = new Scanner(System.in);
			// meal type
			String mealType = obj.next();
			// get orders
			String items = obj.nextLine();
			String result = isMissing(items, mealType);
			// if result is not "Unable to process: " items are missing
			if(!result.equals("Unable to process: ")) {
				System.out.println(result);
			} else {
				//if breakfast make breakfast obj
				//System.out.println("printing meals");
				if(mealType.equals("Breakfast")) {
					makeBreakfastObj(items);
//					Breakfast b1 = new Breakfast();
//					// count drink
//					int count;
//					int idx3= items.indexOf("3");
//					if(idx3>=0) {
//						count = 0;
//						while(idx3!=-1) {
//							idx3 = items.indexOf("3", idx3+1);
//							count++;
//						}
//					} else {
//						count = 0;
//					}
//					b1.printAll(count);
				}
				// if lunch check number of sides
				else if(mealType.equals("Lunch")) {
					makeLunchObj(items);
//					Lunch l1 = new Lunch();
//					int count;
//					int idx2= items.indexOf("2");
//					int idx3 = items.indexOf("3");
//					if(idx2>=0) {
//						count = 0;
//						while(idx2!=-1) {
//							idx2 = items.indexOf("2", idx2+1);
//							count++;
//						}
//					} else {
//						count = 0;
//					}
//					//System.out.println(count);
//					l1.printAll(count, idx3);
				} else {
					makeDinnerObj(items);
//					Dinner d1 = new Dinner();
//					int idx3 = items.indexOf("3");
//					d1.printAll(idx3);
				}
			}
		}
	}

}

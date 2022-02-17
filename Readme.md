# Evive Engineering Test
## Introduction
***
The system takes orders for Breakfast, Lunch, and Dinner. Considering menus:

### Breakfast
|Main|Side|Drink|    
|--------|--------|--------| 
|1: Eggs|2: Toast|3: Coffee|

### Lunch
|Main|Side|Drink|    
|--------|--------|--------| 
|1: Sandwitch|2: Chips|3: Soda|

### Dinner
|Main|Side|Drink|    
|--------|--------|--------| 
|1: Steak|2: Potatoes|3: Wine|

### Rules
1. An order consists of a meal and collection of comma separated item Ids.
2. The system should return the name of the items ordered
3. The system should always return items in the following order: meal, side, drink
4. If multiple items are ordered, the number of items should be indicated
5. Each order must contain a main and a side
6. If no drink is ordered, water should be returned
7. At breakfast, multiple cups of coffee can be ordered
8. At lunch, multiple sides can be ordered
9. At dinner, dessert must be ordered
10. At dinner, water is always provided 

### Sample Input/Output
#### **In:** Breakfast 1,2,3
**Out:** Eggs, Toast, Coffee
#### **In:** Breakfast 2,3,1
**Out:** Eggs, Toast, Coffee
#### **In:** Breakfast 1,2,3,3,3
**Out:** Eggs, Toast, Coffee(3)
#### **In:** Breakfast 1
**Out:** Unable to process: Side is missing,
#### **In:** Lunch 1,2,3
**Out:** Sandwich, Chips, Soda
#### **In:** Lunch 1,2
**Out:** Sandwich, Chips, Water
#### **In:** Lunch 1,1,2, 3
**Out:** Unable to process: Sandwich cannot be ordered more than once
#### **In:** Lunch 1,2,2
**Out:** Sandwich, Chips(2), Water
#### **In:** Lunch
**Out:** Unable to process: Main is missing, Side is missing,
#### **In:** Dinner 1,2,3,4
**Out:** Steak, Potatoes, Wine, Water, Cake
#### **In:** Dinner 1,2,3
**Out:** Unable to process: Dessert is missing

## Requirement
***
To compile the program, install the following programs:
#### JUNIT 4 or 5 
#### Java SE Development Kit 

## Running the program
***
#### To run the program, 
1. Save the folder "EviveTest" to desired location.
2. Open the folder on an IDE preferrably Eclipse.
3. Open the Main.java file and run the program.
4. On the console, enter desired meals such as "Breakfast 1,2,3".
5. To test the program, go to file MainTest.java or MainTest2.java and run the program. 

## Author
### Dipika Giri
### http://www.linkedin.com/in/dipika-giri-b5032b213/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class Main {
  
 
  
  //public static void main(String[] args) {
   // System.out.println("LunchOrder lab -  Intro to OOP");

public static void main(String[] args) throws IOException
{
	
	
	System.out.println(System.getProperty("user.dir")); 
File file = new File("items.txt");
// http://www.coderanch.com/t/439615/Streams/java/Eclipse-won-read-text-file


List<Food> menuitems = new ArrayList<Food>();
 
try {
	Scanner scanner = new Scanner(file);
	


	//while (scanner.hasNextDouble()) {

	// used hasNextLine because it manages all type of data
	// which includes numeric and string

while (scanner.hasNextLine()) {
	String line = scanner.nextLine();

	Scanner lineScanner = new Scanner(line);
	// second Scanner focuses on data and tokens
	lineScanner.useDelimiter(",");

	String item = lineScanner.next();
	double price = lineScanner.nextDouble();
	int fat = lineScanner.nextInt();
	int carbs = lineScanner.nextInt();
	int fiber = lineScanner.nextInt();

	Food dish = new Food(item, price, fat,carbs, fiber);

	menuitems.add(dish);
	System.out.println(item + " " + price + " " + fat);
	 
	
	System.out.println(item);
	System.out.println(price);
	System.out.println(menuitems.getDish());
	System.out.println(menuitems.getPrice());
	
	// uses methods from the Food class

	// mcd here a - original



}// end while




}// end try

 catch (FileNotFoundException e) {
e.printStackTrace();
}


// mcd here b

/*
int n = stats.size();
for(int i = 0; i < n ; i++)
  System.out.println( stats.get(i) );

// prints out contents of the arraylist
 
 */

System.out.println("Arraylist of Object - Processing data");
System.out.println("====================================");

for (Player p : stats){
	System.out.println(p.getname());
	double batave = p.gethits()/(double)p.getatbats();  //casting fixes batting average calc - Sept 11 2023
	System.out.println(batave);
  System.out.println(p);
}






    
    
     double total = 0;
    
    
    		
		Scanner input =  new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.00");
		
		
		
	Food burger = new Food(1.85, 9, 33, 1);	
	
	Food salad = new Food(2.00, 1, 11, 5);

	Food fries = new Food(1.90,10,36,3);

	Food tacos = new Food(1.20, 5, 16, 5);



	

	System.out.println("Enter number of burgers: ");
	int burgers = input.nextInt();
	System.out.println(burger.toString("burger"));
	total = total + (burger.getPrice() * burgers);
	
	
	
	System.out.println(salad.toString("salad"));

	System.out.println(fries.toString("fries"));

	System.out.println(tacos.toString("tacos"));


	

	System.out.println("Your total is: $ " + format.format(total));
	
	
	input.close();



	}// end main
    
    
  
}// end class



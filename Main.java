import java.text.DecimalFormat;
import java.util.Scanner;



class Main {
  
 
  
  public static void main(String[] args) {
    System.out.println("LunchOrder lab -  Intro to OOP");
    
    
     double total = 0;
    
    
    		
		Scanner input =  new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.00");
		
		
		
	Food burger = new Food(1.85, 9, 33, 1);	
	
	Food salad = new Food(2.00, 1, 11, 5);
	

	System.out.println("Enter number of burgers: ");
	int burgers = input.nextInt();
	System.out.println(burger.toString("burger"));
	total = total + (burger.getPrice() * burgers);
	
	
	
	System.out.println(salad.toString("salad"));

	

	System.out.println("Your total is: $ " + format.format(total));
	
	
	input.close();



	}// end main
    
    
  
}// end class



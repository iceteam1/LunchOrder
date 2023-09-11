import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


class Main {
  
 
  
  public static void main(String[] args) throws FileNotFoundException{
    System.out.println("LunchOrder lab -  Intro to OOP");
    
    
     double total = 0;
    
    
    		
		Scanner input =  new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.00");
		
    //taken from https://stackoverflow.com/questions/30564462/read-data-from-a-text-file-and-create-an-object
    Scanner fileInput = new Scanner(new File("items.txt"));
    fileInput.useDelimiter("-|\n");
    ArrayList<Food> menuList = new ArrayList<Food>();

    while(fileInput.hasNext()){
      String food = fileInput.next();
      double price =  Double.valueOf(fileInput.next().substring(1));;
      int fat = fileInput.nextInt();
      int Carbs = fileInput.nextInt();
      int Fiber = fileInput.nextInt();

      menuList.add(new Food(food, price, fat, Carbs, Fiber));
    }

    for(int i = 0; i < menuList.size(); i++){
      System.out.println(menuList.get(i));
    }

    

	System.out.println("Your total is: $ " + format.format(total));
	
	
	input.close();



	}// end main
    
    
  
}// end class



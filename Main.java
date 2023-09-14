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
    //reads all the information from the items.txt and creates an ArrayList full of food objects
    Scanner fileInput = new Scanner(new File("items.txt"));
    fileInput.useDelimiter(",|\n");
    ArrayList<Food> menuList = new ArrayList<Food>();

    while(fileInput.hasNext()){
      String food = fileInput.next();
      double price = fileInput.nextDouble();
      int fat = fileInput.nextInt();
      int Carbs = fileInput.nextInt();
      int Fiber = fileInput.nextInt();

      menuList.add(new Food(food, price, fat, Carbs, Fiber));
    }
    
    fileInput.close();
    menu Menu = new menu(menuList);
    Menu.printMenu("FoodZone");
    
    ArrayList<String>foodNames = new ArrayList<String>();
    for(int i = 0; i < menuList.size(); i++){
      foodNames.add(menuList.get(i).getName());
    }
    
    //System.out.println(foodNames.toString());

    //ordering code
    System.out.print("How many items do you want to order?");
    int listSize = input.nextInt();
    String[] orders = new String[listSize];
    int[] quantityList = new int[listSize];

    int f = 0;
    while (f<orders.length){
      System.out.print("Enter Item " + (f+1) + ":");
      orders[f] = input.next();
      System.out.println(orders[f]);
      System.out.print("Enter the quantity of that item: ");
      quantityList[f] = input.nextInt();
      boolean orderCheck = false;
      
    
      for(int i = 0; i < foodNames.size(); i++){
        if(foodNames.get(i).equals(orders[f])){
          orderCheck = true; //checks to make sure that the item the user ordered is actually on the list
          break;
        }
      }
      //will only move onto the next item if the previous item is on the menu
      if(orderCheck){
        f+=1;
      }else{
        System.out.println("Invalid Item");
      }
    }

    //creates a list of prices in the same order as the items in the menu (To simplify things)
    double[] priceList = new double[menuList.size()];
    for(int i = 0; i < menuList.size(); i++){
      priceList[i] = menuList.get(i).getPrice();
    }

    double tax = 0.13; //tax percentage value
	  //calculates the total price + a tax
    for(int i = 0; i < orders.length; i++){
      total+=(priceList[foodNames.indexOf(orders[i])] * quantityList[i]);
    }
    
    
    System.out.println("Your total is: $ " + format.format(total));
    double finalPrice = total + (total*tax);
    System.out.println("Tax: $" + format.format(total*tax));
    System.out.println("Final Price: $" + format.format(finalPrice));
	  input.close();


	}// end main
    
    
  
}// end class



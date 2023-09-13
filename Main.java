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
    
    System.out.println(foodNames.toString());

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
      if(orderCheck){
        f+=1;
      }else{
        System.out.println("Invalid Item");
      }
    }

    

	  System.out.println("Your total is: $ " + format.format(total));
	
	
	  input.close();


	}// end main
    
    
  
}// end class



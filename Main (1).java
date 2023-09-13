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
    Food pizza = new Food(2.75, 12, 36, 15);
    Food pasta = new Food(2.50, 8, 42, 7);
    Food chickenBreast = new Food(2.25, 0, 31, 3);
    Food iceCream = new Food(1.95, 5, 23, 12);
    Food sushi = new Food(3.25, 2, 15, 8);
    Food chocolateCake = new Food(2.85, 7, 30, 10);
    Food grilledVegetable = new Food(2.20, 3, 12, 4);
    Food steak = new Food(3.50, 0, 26, 8);
	

    System.out.println("Enter number of burgers: ");
    int burgers = input.nextInt();
    System.out.println(burger.toString("burger"));
    total = total + (burger.getPrice() * burgers);

    System.out.println("Enter number of salads: ");
    int salads = input.nextInt();
    System.out.println(salad.toString("salad"));
    total = total + (salad.getPrice() * salads);

    System.out.println("Enter number of pizzas: ");
    int pizzas = input.nextInt();
    System.out.println(pizza.toString("pizza"));
    total = total + (pizza.getPrice() * pizzas);

    System.out.println("Enter number of pastas: ");
    int pastas = input.nextInt();
    System.out.println(pasta.toString("pasta"));
    total = total + (pasta.getPrice() * pastas);

    System.out.println("Enter number of : iceCream: ");
    int iceCreams = input.nextInt();
    System.out.println(chickenBreast.toString("iceCream"));
    total = total + (chickenBreast.getPrice() * iceCreams);

    System.out.println("Enter number of chickenBreast: ");
    int chickenBreasts = input.nextInt();
    System.out.println(chickenBreast.toString("chickenBreast"));
    total = total + (chickenBreast.getPrice() * chickenBreasts);

    System.out.println("Enter number of sushi: ");
    int sushis = input.nextInt();
    System.out.println(sushi.toString("sushi"));
    total = total + (sushi.getPrice() * sushis);

    System.out.println("Enter number of chocolateCake: ");
    int chocolateCakes = input.nextInt();
    System.out.println(chocolateCake.toString("chocolateCake"));
    total = total + (chocolateCake.getPrice() * chocolateCakes);

    System.out.println("Enter number of steak: ");
    int steaks = input.nextInt();
    System.out.println(steak.toString("steak"));
    total = total + (steak.getPrice() * steaks);

    System.out.println("Enter number of grilledVegetable: ");
    int grilledVegetables = input.nextInt();
    System.out.println(grilledVegetable.toString("grilledVegetable"));
    total = total + (grilledVegetable.getPrice() * grilledVegetables);

	System.out.println("Your total is: $ " + format.format(total));
	
	
	input.close();



	}// end main
    
    
  
}// end class



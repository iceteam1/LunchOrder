import java.util.ArrayList;
public class menu {
  private ArrayList<Food> items;

  //constructor - sets arraylist in method to the one passed into it
  public menu(ArrayList<Food> items){
    this.items = items;
  }

  //Prints the menu with your choice of restaurant name
  public void printMenu(String name){
    System.out.println(name);
    System.out.println();
    for(int i = 0; i<items.size(); i++){
      System.out.print(items.get(i).getName() + "-----");
      System.out.printf("$%.2f%n", items.get(i).getPrice());
    }
  }

}

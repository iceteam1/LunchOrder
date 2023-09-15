public class Food {


	private String dish;
	private double price;
	private int fat;
	private int carb;
	private int fiber;
	
	
	
	public Food (String dish,double price,int fat,int carb,int fiber){
		this.dish = dish;
		this.price = price;
		this.fat = fat;
		this.fiber = fiber;
		this.carb = carb;               
		
	}
	
	
public void setDish(double dish){
		this.dish = dish;
		
	}

	public double getDish(){
		return dish;	
	}




	public void setPrice(double price){
		this.price = price;
		
	}

	public double getPrice(){
		return price;	
	}
	
	public void setFat(int fat){
		this.fat = fat;
		
	}

	public int getFat(){
		return fat;	
	}
	
	public void setCarb(int carbo){
		this.carb = carb;
		
	}

	public int getCarb(){
		return carb;	
	}
	public void setFiber(int fiber){
		this.fiber = fiber;
		
	}

	public int getFiber(){
		return fiber;	
	}
	
	public String toString(Object d){  // use toString to test object variable
		String FoodObject;
		FoodObject = "Each " + d + " has " + this.getFat()+"g of fat, "+this.getCarb()+"g of carbs, and "+this.getFiber()+ "g of fiber";
		return FoodObject;
		
	}
}

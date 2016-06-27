package factory;

public abstract class AudiType {
	private String model;
	private String engine;	
	private String color;
	
	public String getModel(){
		return model;
	}
	public void setModel(String newModel){
		model = newModel;
	}
	
	public String getEngine(){
		return engine;
	}
	public void setEngine(String newEngine){
		engine= newEngine;
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String newColor){
		color = newColor;
	}
	
	public void paintCar(){
		System.out.println(getColor()+ "is your new color on your audi");
	}
	public void showModel(){
		System.out.println("Your new audi is the model: " + getModel());
	}
	
	public void showEngine(){
		System.out.println("Your Audi " + getModel()+ "has a "+ getEngine() + "engine");
	}
	
}

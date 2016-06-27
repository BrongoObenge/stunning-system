package factory;

public abstract class AudiType implements Audi{
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
	
	public String paintCar(){
		return getColor()+ "is your new color on your audi";
	}
	public String showModel(){
		return "Your new audi is the model: " + getModel();
	}
	
	public String showEngine(){
		return "Your Audi " + getModel()+ "has a "+ getEngine() + "engine";
	}

	public String getDescription(){
		return "Your Audi "+getModel() + " is " + getColor() + " and has a " + getEngine() + " engine";
	}

}

package decorator;

public class SportPackage extends OptionsConfigurator{

	public SportPackage(NewCar newNewCar) {
		super(newNewCar);
		System.out.println("My Audi");
		
		System.out.println("Added with the sport package");
	}
	
	public String getOptions(){
		return temporaryCar.getOptions()+ "Front Diffusor, Rear diffusor, Double exhaust tips, Stiffer suspension,";
	}

	public double getPrice(){
		return temporaryCar.getPrice()+ 3600;
	}

}

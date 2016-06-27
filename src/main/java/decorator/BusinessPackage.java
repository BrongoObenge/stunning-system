package decorator;

public class BusinessPackage extends OptionsConfigurator{

	public BusinessPackage(NewCar newNewCar) {
		super(newNewCar);
		System.out.println("My Audi");
		System.out.println("Added with the business package");
	}
	
	public String getOptions(){
		return temporaryCar.getOptions()+ "Fullscreen navigation, Parking sensors, Heated seats, Automatic gearbox,";
	}

	public double getPrice(){
		return temporaryCar.getPrice()+ 5500;
	}

}

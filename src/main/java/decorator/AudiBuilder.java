package decorator;

public class AudiBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewCar newcar = new BusinessPackage(new PlainCar());
		System.out.println("My options: " + newcar.getOptions());
		System.out.println("My new car costs: " + newcar.getPrice());
	}

}

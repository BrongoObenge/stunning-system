package visitor;

import vehicles.Boat;
import vehicles.Car;
import vehicles.Plane;

public class VehicleVisitor implements Visitor {

	public String visit(Car car) {
		return "The car makes the sound:\n"+car.getSound();
	}

	public String visit(Boat boat) {
		return "A Boat makes the sound:\n"+boat.getSound();
	}

	public String visit(Plane plane) {
		System.out.println("A plane makes the sound:");
		return "A plane makes the sound:\n"+plane.getSound();
	}
}

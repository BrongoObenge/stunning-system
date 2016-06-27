package visitor;

import vehicles.Boat;
import vehicles.Car;
import vehicles.Plane;

public interface Visitor {
	public String visit(Car car);
	public String visit(Boat boat);
	public String visit(Plane plane);
}

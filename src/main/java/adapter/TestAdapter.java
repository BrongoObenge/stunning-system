package adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		JetFighter F16 = new JetFighter();
		Movable vehicleAdapter = new VehicleAdapter(F16);
		vehicleAdapter.moveForward();
		System.out.println(vehicleAdapter.moveForward());
	}

}

package adapter;


public class VehicleAdapter implements Movable{

	JetFighter jetFighter;
	
	public VehicleAdapter(JetFighter jetFighter){
		this.jetFighter = jetFighter;
	}
	@Override
	public String moveForward() {
		return jetFighter.Fly();
	}

}

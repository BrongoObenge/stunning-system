package vehicles;

import lombok.Data;
import visitor.Visitable;
import visitor.Visitor;

@Data
public class Boat implements Visitable {

	private String sound;

	public Boat(String sound){
		this.sound = sound;
	}
	public String getSound(){
		return sound;
	}
	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);	}

}

package vehicles;

import lombok.AllArgsConstructor;
import lombok.Data;
import visitor.Visitable;
import visitor.Visitor;

public class Plane implements Visitable {

	private String sound;

    public Plane(String sound){
        this.sound = sound;
    }

    public String getSound(){
		return sound;
	}

	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}

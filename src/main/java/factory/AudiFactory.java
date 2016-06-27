package factory;

/**
 * Created by j on 6/27/16.
 */
public class AudiFactory {
    public Audi getAudi(String type){

        if(type.equals("A5")){
            return new AudiA5();
        }

        if(type.equals("A3")){
            return new AudiA3();
        }
        return null;
    }
}

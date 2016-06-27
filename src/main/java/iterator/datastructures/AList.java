package iterator.datastructures;

import iterator.CoolAndHipIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by j on 6/27/16.
 */
public class AList<T> implements CoolAndHipIterator<T>{

    List<T> arr = new ArrayList<T>();
    private int current = 0;

    @Override
    public Optional<T> getCurrent() {
        if (current < arr.size()){
            T currentObj = arr.get(current);
            if(currentObj != null) {
                return Optional.of(arr.get(current));
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean hasNext() {
        if(current <= arr.size()-1){return true;}
        return false;
    }

    @Override
    public void moveNext() {
        current++;
    }

    @Override
    public CoolAndHipIterator<T> getIterator() {
        return this;
    }

    public void add(T value) {
        arr.add(value);
    }
}

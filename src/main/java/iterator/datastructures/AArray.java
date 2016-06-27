package iterator.datastructures;

import iterator.CoolAndHipIterator;
import iterator.NewerCoolAndHipIteratorAdapter;

import java.util.*;

/**
 * Created by j on 6/27/16.
 */
public class AArray<T> implements CoolAndHipIterator<T> {

    private T[] arr;
    int current = 0;

    @Override
    public Optional<T> getCurrent() {
        if(current < arr.length){
            if(arr[current] != null){
                return Optional.of(arr[current]);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean hasNext() {
        if(current <= arr.length-1){return true;}
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
        ArrayList<T> temp;
        if (arr == null) {
            temp = new ArrayList<T>();
        }else{
            temp = new ArrayList<T>(Arrays.asList(arr));
        }

        temp.add(value);
        T[] array = (T[]) new Object[temp.size()];

        arr = temp.toArray(array);
    }
}

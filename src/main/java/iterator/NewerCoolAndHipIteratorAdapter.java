package iterator;

import java.util.Optional;

/**
 * Created by j on 6/27/16.
 */
public interface NewerCoolAndHipIteratorAdapter<T> {
    Optional<T> getNext();
    NewerCoolAndHipIteratorAdapter<T> getNewerAndMuchMuchCoolerIterator();
}

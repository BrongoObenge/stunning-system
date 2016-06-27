package iterator;

import java.util.Optional;

/**
 * Created by j on 6/27/16.
 */
public interface CoolAndHipIterator<T> {
    Optional<T> getCurrent();
    boolean hasNext();
    void moveNext();
    CoolAndHipIterator<T> getIterator();
}

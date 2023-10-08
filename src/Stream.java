import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Stream<T> implements Iterable<T> {
    private List<T> elements;

    public Stream(List<T> elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }

    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return "Stream{" +
                "elements=" + elements +
                '}';
    }
}
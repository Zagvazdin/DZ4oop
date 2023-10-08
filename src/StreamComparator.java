import java.util.Comparator;
import java.util.List;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        return Integer.compare(stream1.size(), stream2.size());
    }

}

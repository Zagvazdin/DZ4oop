import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StudyGroup> groups1 = new ArrayList<>();
        groups1.add(new StudyGroup("Ivan"));
        groups1.add(new StudyGroup("Antonio"));
        groups1.add(new StudyGroup("Vic"));

        List<StudyGroup> groups2 = new ArrayList<>();
        groups2.add(new StudyGroup("BOOO"));
        groups2.add(new StudyGroup("Api"));
        groups2.add(new StudyGroup("Firs"));

        Stream stream1 = new Stream(groups1);
        Stream stream2 = new Stream(groups2);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);


        Controller controller = new Controller(new StreamService());
        controller.sortStreams(streams);
        System.out.println(stream1);
    }

    @Override
    public String toString() {
        return "Main{}";
    }
}


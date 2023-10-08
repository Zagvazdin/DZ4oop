import java.util.Comparator;
import java.util.List;

public class UchGroupComperator <T extends User> implements Comparator<T> {

        @Override
        public int compare(T o1, T o2) {
            int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            if (resultOfComparing == 0) {
                resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
                if (resultOfComparing == 0) {
                    return o1.getPatronymic().compareTo(o2.getPatronymic());
                } else {
                    return resultOfComparing;
                }
            } else {
                return resultOfComparing;
            }
        }
    }

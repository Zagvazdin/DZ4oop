import java.time.LocalDate;
import java.util.List;

public interface TeacherService<T> {
    List<T> getAll2();

    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
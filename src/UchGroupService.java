import java.util.List;
public class UchGroupService {

    public UchGroupService(Teacher teacher, List<Student> students) {
    }

    public UchGroupService uchebGroup(Teacher teacher, List<Student> students) {
            return new UchGroupService(teacher, students);
        }
}



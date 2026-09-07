import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentDao studentDao;

    public void addStudent(Student.Student student) {
        studentDao.addStudent(student);
    }

    public void updateStudent(Student.Student student) {
        studentDao.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    public Student.Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    public List<Student.Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
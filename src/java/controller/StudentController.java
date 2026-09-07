import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/students")//optional
public class StudentController {
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student.Student> addStudent(@RequestBody Student.Student student) {
        studentService.addStudent(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Student.Student> updateStudent(@RequestBody Student.Student student) {
        studentService.updateStudent(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student.Student> getStudent(@PathVariable("id") int id) {
        return new ResponseEntity<>(studentService.getStudent(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Student.Student>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }
}
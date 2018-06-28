#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service // this can mark as spring service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;
    
    public List<Student> getAllStudents() {
        // return students
        List<Student> students = new ArrayList<>();
        
        studentRepository.findAll()
                .forEach(students::add);
        
        return students;
    }
    
    public Student getStudent(String id) {
        return studentRepository.findById(id).get();
    }
    
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "student added";
    }
    
    public void upsertStudent(String id, Student student) {
        studentRepository.save(student);
    }
    
    public void deleteStudent(String id) {
        
        studentRepository.deleteById(id);
    }
    
}

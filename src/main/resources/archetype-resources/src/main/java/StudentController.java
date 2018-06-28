#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired	
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	
	@RequestMapping(method= RequestMethod.GET, value = "/student/{id}")
	public Student getStudent(@PathVariable String id) {
		return studentService.getStudent(id);
	}

	@RequestMapping(method= RequestMethod.POST, value = "/student/add")
	public String addStudent(@RequestBody Student student) {
		 studentService.addStudent(student);
		 return "student added successfully";
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/student/upsert/{id}")
	public String updateStudent(@PathVariable String id, @RequestBody Student student) {
		 studentService.upsertStudent(id, student);
		 return "student upserted successfully with id: "+id;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/student/delete/{id}")
	public String deleteStudent(@PathVariable String id) {
		studentService.deleteStudent(id);
		return "student deleted successfully";
	}
	
}

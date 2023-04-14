package io.school.springbootstarter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
	@Autowired
	private SchoolService schoolService;

	@RequestMapping("/hello")
	public String sayHi() {
		return " 1.Create a new Teacher.\\n 2.Remove a Teacher.\\n 3.Count the number of teachers.\\n4.Display name of all the teachers and their subject. \\n 5.Given specific Id, display detail of the specific teacher. \r\n"
				;
	}
	
	@RequestMapping("/TeacherList")
	public List<TeacherList>  getallTeachers(){
		return schoolService.getAllTeachers();		
	}
	
	@RequestMapping("/TeacherCount")
	public int  countTeacher(){
		return schoolService.countTeacher();
		
	}
	
	@RequestMapping("/TeacherList/{id}") 
public TeacherList getTeacher(@PathVariable String id) {
		
		return schoolService.getTeacher(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/TeacherList")
	public void addTeacher(@RequestBody TeacherList teacher) {
		schoolService.addTeacher(teacher);
		
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/TeacherList/{id}")
	public void UpdateTeacher(@RequestBody TeacherList teacher,@PathVariable String id) {
		schoolService.updateTeacher(id ,teacher);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/TeacherList/{id}")
	public void DeleteTeacher(@PathVariable String id) {
	   	schoolService.deleteTeacher(id);
	}
}

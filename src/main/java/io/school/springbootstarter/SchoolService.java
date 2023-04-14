package io.school.springbootstarter;

import java.util.ArrayList;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SchoolService {
	//------------1 render All Teachers--------------------------------------------
//	private List<TeacherList> teacherList = new ArrayList<>(Arrays.asList(
//	 
// 	new TeacherList("101","Neha","24","Hindi")
//				new TeacherList("102","Hema","27","English"),
//				new TeacherList("103","Ankit","30","Maths"),
//				new TeacherList("104","Aman","21","Science")
//				
//				));
	
	List<TeacherList> teacherList =  new ArrayList<TeacherList>();
	
	
	public List<TeacherList> getAllTeachers() {
		return teacherList;
		
	}
	
	//-----------------2. render teacher details with id--------------------------
	
	public TeacherList getTeacher(String id) {
	return	 (TeacherList) teacherList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		
	}
	//----------------3. Add Teacher----------------------------------------------

	public void addTeacher(TeacherList teacher) {
		// TODO Auto-generated method stub
		teacherList.add(teacher);
	   
	}

	
	
	
	//---------------4 Update Teacher------------------------------------------
	
	
	public void updateTeacher(String id, TeacherList teacher) {
		// TODO Auto-generated method stub
		for(int i =0; i<teacherList.size();i++) {
			TeacherList t= teacherList.get(i);
			if(t.getId().equals(id)) {
				teacherList.set(i, teacher);
				return;
			}
			
		}
		
	}

	
	
	//---------------5 Remove Teacher----------------------------------------------
	public void deleteTeacher(String id) {
		// TODO Auto-generated method stub
		
	 teacherList.removeIf(t -> t.getId().equals(id));
		
	}
//---------------------6 Count Teacher
	public int countTeacher() {
		 return teacherList.size();
		
		// TODO Auto-generated method stub
		
	}
	

}

package assignmentoncrud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import assignmentoncrud.model.Student;

@Component
public class StudentDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createStudent(Student student) {
		
		
		
		this.hibernateTemplate.saveOrUpdate(student);
	}
	
	public List<Student> getAllStudent(){
		List<Student> students =this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	@Transactional
	public void deleteStudent(int id) {
		Student s= this.hibernateTemplate.load(Student.class,id);
		this.hibernateTemplate.delete(s);
	}
	
	public Student getStudent(int id) {
		return this.hibernateTemplate.get(Student.class,id);
	}
}

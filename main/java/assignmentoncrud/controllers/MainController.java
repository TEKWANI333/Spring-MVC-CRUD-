package assignmentoncrud.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import assignmentoncrud.dao.StudentDao;
import assignmentoncrud.model.Student;

@Controller
public class MainController {
	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping("/")
	public String home(Model m) {
		
		List<Student> students= studentDao.getAllStudent();
		m.addAttribute("students", students);
		return "index";
	}
	@RequestMapping("/add-student")
	public String addStudent(Model m) {
		m.addAttribute("title", "Add-Student");
		return "add-student-form";
	}
	@RequestMapping(value ="/handle-student", method=RequestMethod.POST )
	public RedirectView handleStudent(@ModelAttribute Student student, HttpServletRequest request) {
		studentDao.createStudent(student);
		RedirectView redirectView = new RedirectView();
		 redirectView.setUrl(request.getContextPath()+"/");
		 return redirectView;
	}
	@RequestMapping(value ="/delete/{studentId}")
	public RedirectView deleteStudent(@PathVariable("studentId") int studentId ,HttpServletRequest request) {
		this.studentDao.deleteStudent(studentId);
		RedirectView redirectView = new RedirectView();
		 redirectView.setUrl(request.getContextPath()+"/");
		 return redirectView;
	}
	
	@RequestMapping(value ="/update/{studentId}")
	public String updateform(@PathVariable("studentId") int studentId , Model m) {
		Student student = this.studentDao.getStudent(studentId);
		m.addAttribute("student", student);
		return "update_form";
	}
}

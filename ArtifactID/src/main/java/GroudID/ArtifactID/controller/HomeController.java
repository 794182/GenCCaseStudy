package GroudID.ArtifactID.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import GroupID.ArtifactID.dto.Major;
import GroupID.ArtifactID.dto.Student;
import GroupID.ArtifactID.service.StudentService;

@Controller
public class HomeController {
	
	private StudentService service;
	@Inject
	public void setService(StudentService service) {
		this.service = service;
	}

	@RequestMapping(value="/hello")
	public ModelAndView hello(@RequestParam(required=false, defaultValue="World") String name) {
		ModelAndView ret = new ModelAndView("home");
		// Adds an object to be used in home.jsp
		ret.addObject("name", name);
		return ret;
	}
	
	@RequestMapping(value="/allMajors")
	public ModelAndView allMajors() {
		ModelAndView ret = new ModelAndView("allMajors");
		ret.addObject("allMajors", service.getAllMajors());
		return ret;
	}
	
	@RequestMapping(value="/allStudents")
	public ModelAndView allStudents() {
		ModelAndView ret = new ModelAndView("allStudents");
		ret.addObject("allStudents", service.getAllStudents());
		return ret;
	}
	
	@RequestMapping(value="/getMajorById")
	public ModelAndView getMajorById() {
		ModelAndView ret = new ModelAndView("getMajorById");
		return ret;
	}
	
	@RequestMapping(value="/getMajorByIdView")
	public ModelAndView getMajorByIdView(int MajorID, Model m) {
		ModelAndView ret = new ModelAndView("getMajorByIdView");
		Major gotMajor = service.getMajorById(MajorID);
		ret.addObject("getMajorByIdView", gotMajor);
		m.addAttribute("maj", gotMajor);
		return ret;
	}
	
	@RequestMapping(value="/getStudentById")
	public ModelAndView getStudentById() {
		ModelAndView ret = new ModelAndView("getStudentById");
		return ret;
	}
	
	@RequestMapping(value="/getStudentByIdView")
	public ModelAndView getStudentByIdView(int StudentID, Model m) {
		ModelAndView ret = new ModelAndView("getStudentByIdView");
		Student gotStudent = service.getStudentById(StudentID);
		ret.addObject("getStudentByIdView", gotStudent);
		m.addAttribute("student", gotStudent);
		return ret;
	}
	
	@RequestMapping(value="/getAllStudentsByMajorCost")
	public ModelAndView getAllStudentsByMajorCost() {
		ModelAndView ret = new ModelAndView("getAllStudentsByMajorCost");
		return ret;
	}
	
	@RequestMapping(value="/getAllStudentsByMajorCostView")
	public ModelAndView getAllStudentsByMajorCostView(double cost, Model m) {
		ModelAndView ret = new ModelAndView("getAllStudentsByMajorCostView");
		List<Student> studentList = new ArrayList<>(service.getAllStudentsByMajorCost(cost));
		ret.addObject("getAllStudentsByMajorCostView", studentList);
		m.addAttribute("students", studentList);
		return ret;
	}
}

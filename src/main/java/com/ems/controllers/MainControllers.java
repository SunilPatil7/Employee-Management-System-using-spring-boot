package com.ems.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ems.models.empDetail;
import com.ems.service.EmsService;

@Controller
public class MainControllers {
	
	
	@Autowired
	private EmsService emsService;
	
	@GetMapping("/findAllEmp")
	public String home(HttpServletRequest req) {
		req.setAttribute("Empdetails",emsService.findAllEmpDetails() );
		req.setAttribute("mode","EMP_VIEW" );
		return "index";
		
	}
	
	@GetMapping("/NewEmp")
	public String newCust(HttpServletRequest req) {
		req.setAttribute("mode","EMP_NEW");
		return "index";
	}
	
	@GetMapping("/UpdateEmp")
	public String home(@RequestParam long e_id,  HttpServletRequest req) {
		req.setAttribute("Empdetail",emsService.findOne(e_id) );
		req.setAttribute("mode","EMP_EDIT" );
		return "index";
		
	}
	
	@GetMapping("/deleteEmp")
	public void deleteCust(@RequestParam long e_id,HttpServletRequest req,HttpServletResponse resp) throws IOException {
		emsService.delete(e_id);
		req.setAttribute("Cdetails",emsService.findAllEmpDetails() );
		req.setAttribute("mode","EMP_NEW");
		resp.sendRedirect("/findAllEmp");
	}
	
	@PostMapping("/Save")
	public void save(@ModelAttribute empDetail Empdetail,BindingResult bindingResult,  HttpServletRequest req,HttpServletResponse resp) throws IOException {
		emsService.save(Empdetail);
		req.setAttribute("Empdetails",emsService.findAllEmpDetails() );
		req.setAttribute("mode","EMP_VIEW" );
		resp.sendRedirect("/findAllEmp");
		
	}

}

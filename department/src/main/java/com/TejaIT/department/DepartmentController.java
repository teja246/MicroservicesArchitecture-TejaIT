package com.TejaIT.department;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveDeptDtls(@RequestBody Department dept){
		departmentService.save(dept);
		return "Successfully saved ";	
	}
	
	@RequestMapping(value ="/get/{deptId}", method = RequestMethod.GET)
	public Department getDeptDtls(@PathVariable Integer deptId){
		Optional<Department> dept=departmentService.getById(deptId);
		return dept.get();	
	}
}

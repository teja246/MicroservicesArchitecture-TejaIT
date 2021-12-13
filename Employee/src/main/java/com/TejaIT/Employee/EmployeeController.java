package com.TejaIT.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		System.out.println("inside of save Employee controller method");
		return employeeService.saveEmployee(employee);	
	}
	
	@GetMapping("/{empId}")
	public ResponseTemplateDTO getEmployeeWithDepartment(@PathVariable Integer empId) {
		return employeeService.getEmployeeWithDepartment(empId);
	}
}

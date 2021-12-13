package com.TejaIT.Employee;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.TejaIT.department.Department;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRespository employeeRespository;

	@Autowired
	private RestTemplate restTemplate;
	
	public Employee saveEmployee(Employee employee) {
      System.out.println("employe service inside");
    
		return employeeRespository.save(employee);
	}

	public ResponseTemplateDTO getEmployeeWithDepartment(Integer empId) {
		System.out.println("entered into Response DTO service");
	ResponseTemplateDTO dto=new ResponseTemplateDTO();
	Optional<Employee> employee=employeeRespository.findById(empId);
	Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/dept/get/"+employee.get().getEmpId(), Department.class);
	dto.setEmployee(employee.get());
	dto.setDepartment(department);
		return dto;
	}
	
}

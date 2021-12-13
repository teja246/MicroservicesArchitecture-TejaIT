package com.TejaIT.department;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	@Autowired
DepartmentRepository departmentRepository;
	
	public void save(Department dept) {
	
		departmentRepository.save(dept);
	}

	public Optional<Department> getById(Integer deptId) {
		return departmentRepository.findById(deptId);	
	}

}

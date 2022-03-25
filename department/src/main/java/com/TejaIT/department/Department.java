package com.TejaIT.department;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept_micrp_tbl")
public class Department {
	@Id
	@GeneratedValue(strategy  =GenerationType.AUTO)
private Integer dept_id;
private String  dept_name;
private String location;
public Integer getDept_id() {
	return dept_id;
}
public void setDept_id(Integer dept_id) {
	this.dept_id = dept_id;
}
public String getDept_name() {
	return dept_name;
}
public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}

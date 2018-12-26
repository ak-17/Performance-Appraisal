package com.akshay.performance.appraisal.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.performance.appraisal.model.Employee;
import com.akshay.performance.appraisal.service.EmployeeDetailService;

/**
 * @author akshay
 *
 */
@RestController
public class PerformanceAppraisalController {
	
	@Autowired
	EmployeeDetailService employeeDetailService;
	
	@GetMapping(value="/getAllEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> allEmployees = employeeDetailService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(allEmployees,HttpStatus.OK);
	}
}

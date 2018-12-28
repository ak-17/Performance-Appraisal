package com.akshay.performance.appraisal.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.performance.appraisal.model.Employee;
import com.akshay.performance.appraisal.model.LeaveSummary;
import com.akshay.performance.appraisal.service.PerformanceAppraisalService;

/**
 * @author akshay
 *
 */
@RestController
public class PerformanceAppraisalController {
	
	@Autowired
	PerformanceAppraisalService performanceAppraisalService;
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> allEmployees = performanceAppraisalService.getAllEmployees();
		return new ResponseEntity<List<Employee>>(allEmployees,HttpStatus.OK);
	}
	
	@GetMapping("/getEmployeeById/{id}")
	public ResponseEntity<Employee> getEmployeeBYId(@PathVariable Integer id) {
		Employee employee = performanceAppraisalService.getEmployeeById(id);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	@GetMapping("getLeaveSummaryById/{id}")
	public ResponseEntity<LeaveSummary> getLeaveSummaryById(@PathVariable Integer id) {
		LeaveSummary leaveSummary = performanceAppraisalService.getLeaveSummaryByEmployeeId(id);
		return new ResponseEntity<LeaveSummary>(leaveSummary,HttpStatus.OK);
	}
}

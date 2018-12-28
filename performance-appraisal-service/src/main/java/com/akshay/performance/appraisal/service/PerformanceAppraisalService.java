/**
 * 
 */
package com.akshay.performance.appraisal.service;


import java.util.List;

import org.springframework.stereotype.Component;

import com.akshay.performance.appraisal.model.Employee;
import com.akshay.performance.appraisal.model.LeaveSummary;

/**
 * @author akshay
 *
 */

@Component
public interface PerformanceAppraisalService {
	
	List<Employee> getAllEmployees();
	Employee getEmployeeById(Integer id);
	LeaveSummary getLeaveSummaryByEmployeeId(Integer id)
;}

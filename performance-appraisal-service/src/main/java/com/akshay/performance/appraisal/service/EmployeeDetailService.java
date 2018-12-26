/**
 * 
 */
package com.akshay.performance.appraisal.service;


import java.util.List;

import org.springframework.stereotype.Component;

import com.akshay.performance.appraisal.model.Employee;

/**
 * @author akshay
 *
 */

@Component
public interface EmployeeDetailService {
	
	List<Employee> getAllEmployees();
}

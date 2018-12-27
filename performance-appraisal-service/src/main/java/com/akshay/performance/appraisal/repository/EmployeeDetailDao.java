/**
 * 
 */
package com.akshay.performance.appraisal.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.akshay.performance.appraisal.model.Employee;

/**
 * @author akshay
 *
 */
@Repository
public interface EmployeeDetailDao {

	List<Employee> getAllEmployees();
	Employee getEmployeeById(Integer id);
}

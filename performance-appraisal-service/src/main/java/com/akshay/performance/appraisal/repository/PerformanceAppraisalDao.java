/**
 * 
 */
package com.akshay.performance.appraisal.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.akshay.performance.appraisal.model.Employee;
import com.akshay.performance.appraisal.model.LeaveSummary;

/**
 * @author akshay
 *
 */
@Repository
public interface PerformanceAppraisalDao {

	List<Employee> getAllEmployees();
	Employee getEmployeeById(Integer id);
	LeaveSummary getLeaveSummaryByEmployeeId(Integer id);
}

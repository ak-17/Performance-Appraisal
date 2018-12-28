/**
 * 
 */
package com.akshay.performance.appraisal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshay.performance.appraisal.model.Employee;
import com.akshay.performance.appraisal.model.LeaveSummary;
import com.akshay.performance.appraisal.repository.PerformanceAppraisalDao;
import com.akshay.performance.appraisal.service.PerformanceAppraisalService;

/**
 * @author akshay
 *
 */
@Service
public class PerformanceAppraisalServiceImpl implements PerformanceAppraisalService{
	
	@Autowired
	PerformanceAppraisalDao performanceAppraisalDao;
	
	@Override
	public List<Employee> getAllEmployees() {
		return performanceAppraisalDao.getAllEmployees();
	}


	@Override
	public Employee getEmployeeById(Integer id) {
		return performanceAppraisalDao.getEmployeeById(id);
	}

	@Override
	public LeaveSummary getLeaveSummaryByEmployeeId(Integer id) {
		return performanceAppraisalDao.getLeaveSummaryByEmployeeId(id);
	}

}

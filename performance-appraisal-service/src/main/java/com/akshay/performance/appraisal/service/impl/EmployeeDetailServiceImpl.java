/**
 * 
 */
package com.akshay.performance.appraisal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshay.performance.appraisal.dao.EmployeeDetailDao;
import com.akshay.performance.appraisal.model.Employee;
import com.akshay.performance.appraisal.service.EmployeeDetailService;

/**
 * @author akshay
 *
 */
@Service
public class EmployeeDetailServiceImpl implements EmployeeDetailService{
	
	@Autowired
	EmployeeDetailDao employeeDetailDao;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDetailDao.getAllEmployees();
	}

}

/**
 * 
 */
package com.akshay.performance.appraisal.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.akshay.performance.appraisal.model.Employee;

/**
 * @author akshay
 *
 */
@Repository
public class EmployeeDetailDao {
	
	@Autowired
    JdbcTemplate jdbcTemplate;

    public List<Employee> getAllEmployees() {
    	String sqlQuery = "SELECT * FROM PA_EMPLOYEE";
    	List<Employee> allEmployees = new ArrayList<>();
    	allEmployees = jdbcTemplate.query(sqlQuery,new Object[]{},new BeanPropertyRowMapper<>(Employee.class) );
    	return allEmployees;
    }

}

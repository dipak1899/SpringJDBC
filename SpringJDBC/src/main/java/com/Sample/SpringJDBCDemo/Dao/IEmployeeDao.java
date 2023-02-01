package com.Sample.SpringJDBCDemo.Dao;

import java.util.List;

import com.Sample.SpringJDBCDemo.model.Employee;

public interface IEmployeeDao {

	public List<Employee> getAll();
	public Employee getById(int id);
	
	//create
	public int save(Employee employee);
	
	//update
	public int update(Employee employee);
	
	//delete
	public int deleteById(int id);
}

package com.main.dao;

import java.util.List;

import com.main.model.Employee;

public interface EmpDaoInt {

	void save(Employee emp);

	List<Employee> findAll();

	Employee findOne(int id);

	void delete(int id);

}

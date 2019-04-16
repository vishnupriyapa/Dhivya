package com.main.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.Employee;
import com.main.repository.EmployeeRepository;

@Repository
public class EmpDaoImpl implements EmpDaoInt{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void save(Employee emp) {
		employeeRepository.save(emp);	
	}

	@Override
	public List<Employee> findAll() {
		   List<Employee> ls=(List)employeeRepository.findAll();
		return ls;
	}

	@Override
	public Employee findOne(int id) {
		
		return employeeRepository.findOne(id);
	}

	@Override
	public void delete(int id) {
		
		employeeRepository.delete(id);
	}
	
/*@PersistenceContext
EntityManager entityManager;
	public void saveEmp(Employee emp) {
		entityManager.persist(emp);
	}
	
	public List<Employee> ListEmployee() {
		return entityManager.createQuery("from Employee").getResultList();
	}

	public Employee editEmployee(int id) {
		
		Query sql= entityManager.createQuery("from Employee where empId=?");
		sql.setParameter(1, id);
		List<Employee> ls=sql.getResultList();
		Employee e=null;
		Iterator itr=ls.iterator();
		while (itr.hasNext()) {
			e=(Employee) itr.next();
		}
		return e;
		
	}

	@Override
	public void updateEmpl(Employee emp) {
		Query sql= entityManager.createNativeQuery("update emp set emp_name=?,city=?,phone_num=? where emp_id=?");
		sql.setParameter(1, emp.getEmpName());
		sql.setParameter(2, emp.getCity());
		sql.setParameter(3, emp.getPhoneNum());
		sql.setParameter(4, emp.getEmpId());
		sql.executeUpdate();
		
	}

	@Override
	public void deleteEmpl(int id) {
		Query sql=entityManager.createNativeQuery("delete from emp where emp_id=?");
		sql.setParameter(1, id);
		sql.executeUpdate();
		
	}*/

}

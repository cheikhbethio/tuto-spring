package moussa.tuto.spring.boot.service;

import java.util.List;

import moussa.tuto.spring.boot.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAll();
	public Employee getById(int Id);
	public void save(Employee empl);
	public void deleteById(int id);	

}

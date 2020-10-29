package moussa.tuto.spring.boot.DAO;

import java.util.List;

import moussa.tuto.spring.boot.entity.Employee;

public interface EmployeeDAO {
	public List<Employee>  getAll();
	public Employee getById(int employeeId);
	public void save(Employee empl);
	public void deleteById(int employeeId);
}

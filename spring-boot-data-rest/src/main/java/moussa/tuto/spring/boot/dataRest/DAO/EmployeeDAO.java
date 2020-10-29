package moussa.tuto.spring.boot.dataRest.DAO;

import java.util.List;

import moussa.tuto.spring.boot.dataRest.entity.Employee;

public interface EmployeeDAO {
	public List<Employee>  getAll();
	public Employee getById(int employeeId);
	public void save(Employee empl);
	public void deleteById(int employeeId);
}

package moussa.tuto.spring.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moussa.tuto.spring.boot.DAO.EmployeeRepoSpringDataJpa;
import moussa.tuto.spring.boot.entity.Employee;

@Service
public class EmployeeServiceSpringDataJpa implements EmployeeService {
	
	private EmployeeRepoSpringDataJpa employeeRepoSpringDataJpa;

	@Autowired
	public EmployeeServiceSpringDataJpa(EmployeeRepoSpringDataJpa employeeRepoSpringDataJpa) {
		this.employeeRepoSpringDataJpa = employeeRepoSpringDataJpa;
	}

	@Override
	public List<Employee> getAll() {
		return employeeRepoSpringDataJpa.findAll();
	}

	@Override
	public Employee getById(int id) {
		Optional<Employee> result =  employeeRepoSpringDataJpa.findById(id);
		Employee theEmp = null;
		if(result.isPresent()) {
			theEmp = result.get();
		}else {
			throw new RuntimeException("not found employee");
		}

		return theEmp; 	
}

	@Override
	public void save(Employee empl) {
		employeeRepoSpringDataJpa.save(empl);
	}

	@Override
	public void deleteById(int id) {
		employeeRepoSpringDataJpa.deleteById(id);
	}
}

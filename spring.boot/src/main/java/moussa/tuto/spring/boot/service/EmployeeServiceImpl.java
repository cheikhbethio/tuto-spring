package moussa.tuto.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import moussa.tuto.spring.boot.DAO.EmployeeDAO;
import moussa.tuto.spring.boot.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDao;

	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDaoJPAImpl") EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	@Transactional
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

	@Override
	@Transactional
	public Employee getById(int id) {
		return employeeDao.getById(id);
	}

	@Override
	@Transactional
	public void save(Employee empl) {
		employeeDao.save(empl);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		employeeDao.deleteById(id);
	}

}

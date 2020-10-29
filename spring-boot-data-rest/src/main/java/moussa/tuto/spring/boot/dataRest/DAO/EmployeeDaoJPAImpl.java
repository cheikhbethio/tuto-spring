package moussa.tuto.spring.boot.dataRest.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import moussa.tuto.spring.boot.dataRest.entity.Employee;

@Repository
public class EmployeeDaoJPAImpl implements EmployeeDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDaoJPAImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	public List<Employee> getAll() {
		Query theQuery = entityManager.createQuery("from Employee");
		// execute query
		List<Employee> employees = theQuery.getResultList();
		return employees;
	}

	@Override
	public Employee getById(int employeeId) {
		return entityManager.find(Employee.class, employeeId);
	}

	@Override
	public void save(Employee empl) {
		Employee dbEmp = entityManager.merge(empl);
		empl.setId(dbEmp.getId());
	}

	@Override
	public void deleteById(int employeeId) {
		entityManager.createQuery("delete form Employee where id=:employeeId")
				.setParameter("employeeId", employeeId).executeUpdate();
	}

}

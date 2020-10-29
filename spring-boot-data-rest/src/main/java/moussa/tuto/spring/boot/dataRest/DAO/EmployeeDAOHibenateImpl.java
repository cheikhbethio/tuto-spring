package moussa.tuto.spring.boot.dataRest.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import moussa.tuto.spring.boot.dataRest.entity.Employee;

@Repository
public class EmployeeDAOHibenateImpl implements EmployeeDAO{
	
	@Autowired
	private EntityManager entityManager;
	

	public EmployeeDAOHibenateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	public List<Employee>  getAll(){
		
		// open session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create query
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
		
		
		// execute query
		List<Employee> employees = theQuery.getResultList();
		
		return employees;
	}

	@Override
	public Employee getById(int employeeId) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		return currentSession.get(Employee.class, employeeId);
	}

	@Override
	public void save(Employee empl) {
		Session currSess = entityManager.unwrap(Session.class);
		currSess.saveOrUpdate(empl);		
	}

	@Override
	public void deleteById(int employeeId) {
		Session curSession = entityManager.unwrap(Session.class);
		
		curSession.createQuery("delete from Employee where id=:employeeId").setParameter("employeeId", employeeId).executeUpdate();
	}

}

package moussa.tuto.spring.boot.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import moussa.tuto.spring.boot.entity.Employee;

public interface EmployeeRepoSpringDataJpa extends JpaRepository<Employee, Integer> {
 // no needed code
}

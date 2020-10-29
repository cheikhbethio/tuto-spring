package moussa.tuto.spring.boot.dataRest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import moussa.tuto.spring.boot.dataRest.entity.Employee;

public interface EmployeeRepoSpringDataJpa extends JpaRepository<Employee, Integer> {
 // no needed code
}

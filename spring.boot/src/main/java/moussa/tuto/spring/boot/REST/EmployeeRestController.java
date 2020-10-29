package moussa.tuto.spring.boot.REST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import moussa.tuto.spring.boot.entity.Employee;
import moussa.tuto.spring.boot.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {


	private EmployeeService employeeService;
	
//	public EmployeeRestController(EmployeeService employeeService) {
//		this.employeeService = employeeService;
//	}
	@Autowired
	public EmployeeRestController(@Qualifier("employeeServiceSpringDataJpa") EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getById(@PathVariable int employeeId ) {
		return employeeService.getById(employeeId);
	}
	
	@PostMapping("/employees")
	public Employee create(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;		
	}
	
	@PutMapping("/employees")
	public void update(@RequestBody Employee empl) {
		employeeService.save(empl);
	}
	
	@DeleteMapping("/employees/{employeeId}")
	private void deleteById(@PathVariable int employeeId) {
		employeeService.deleteById(employeeId);
	}
	
}

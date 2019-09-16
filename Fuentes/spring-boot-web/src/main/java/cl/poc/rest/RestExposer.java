package cl.poc.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.poc.testing.bean.Employee;

/**
 * RestExposer
 * 
 * @author ccontrerasc
 *
 */
@RestController
public class RestExposer {

	/**
	 * getService
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee getService(@RequestParam int id) {

		System.out.println("Se inicia una solicitud al endpoint [GET]");
		System.out.println("REQUEST: ID = " + id);

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId(id);
		emp.setSalary(3000);

		System.out.println("Se finaliza una solicitud al endpoint [GET]");
		System.out.println("RESPONSE: " + emp);

		return emp;
	}

	/**
	 * postService
	 * 
	 * @param employee
	 * @return
	 */
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public Employee postService(@RequestBody Employee employee) {

		System.out.println("Se inicia una solicitud al endpoint [POST]");
		System.out.println("Request: " + employee);

		Employee emp = new Employee();
		emp.setName(employee.getName());
		emp.setDesignation(employee.getDesignation());
		emp.setEmpId(employee.getEmpId());
		emp.setSalary(employee.getSalary());

		System.out.println("Se finaliza una solicitud al endpoint [POST]");
		System.out.println("RESPONSE: " + emp);

		return emp;
	}

}

package com.ashok.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashok.it.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		//employeeService.saveeMultipalData();
		//employeeService.getDetail();
		//employeeService.findByGender("Fe-Male");
		//employeeService.getEmployeeDet();
		//employeeService.getEmpBySalary(90000.00);
		employeeService.deleteEmp(2);
	}

}

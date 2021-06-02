package hoa.t1908e.practice62;

import hoa.t1908e.practice62.enitity.Employees;
import hoa.t1908e.practice62.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practice62Application implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(Practice62Application.class, args);
    }

    @Override
    public void run (String... args) throws Exception{

        Employees employees = new Employees();
        employees.setName("hoa");
        employees.setWage(199999999);
        employeeService.create(employees);
        Employees employees1 = new Employees();
        employees1.setName("hoa1");
        employees1.setWage(199999999);
        employeeService.create(employees1);
        Employees employees2 = new Employees();
        employees2.setName("hoa2");
        employees2.setWage(199999999);
        employeeService.create(employees2);

    }

}

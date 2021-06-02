package hoa.t1908e.practice62.controller;

import hoa.t1908e.practice62.enitity.Employees;
import hoa.t1908e.practice62.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public Iterable<Employees> findAllEmployees(){

        return employeeService.getList();
    }
    @PostMapping
    public Employees createEmployee(@RequestBody Employees employee){
        return employeeService.create(employee);

    }

}

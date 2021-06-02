package hoa.t1908e.practice62.service;

import hoa.t1908e.practice62.enitity.Employees;
import hoa.t1908e.practice62.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    public Employees create(Employees employee){
         return employeeRepository.save(employee);

    }
    public Iterable<Employees> getList(){
        return employeeRepository.findAll();
    }
}

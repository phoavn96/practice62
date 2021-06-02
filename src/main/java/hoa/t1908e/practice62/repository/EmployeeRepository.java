package hoa.t1908e.practice62.repository;

import hoa.t1908e.practice62.enitity.Employees;
import hoa.t1908e.practice62.service.EmployeeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees,Integer> {
}

package com.dbf.dbf.repostory;

import com.dbf.dbf.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}

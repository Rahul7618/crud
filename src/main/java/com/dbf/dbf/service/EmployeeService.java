package com.dbf.dbf.service;

import com.dbf.dbf.entity.Employee;
import com.dbf.dbf.repostory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Integer id, Employee employee) {
        Employee existingEmployee = employeeRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setFirstName(employee.getFirstName());
            existingEmployee.setLastName(employee.getLastName());
            existingEmployee.setEmail(employee.getEmail());
            return employeeRepository.save(existingEmployee);
        } else {
            return null;
        }
    }

    public boolean deleteEmployee(Integer id) {
        Employee existingEmployee = employeeRepository.findById(id).orElse(null);
        if(existingEmployee !=null) {
            employeeRepository.delete(existingEmployee);
            return true;
        }else {
            return false;
        }
    }
}

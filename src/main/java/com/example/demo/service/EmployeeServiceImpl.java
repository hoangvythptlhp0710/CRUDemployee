package com.example.demo.service;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        if (employee != null){
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        if (employee != null){
            Employee employee1 = employeeRepository.getById(id);
            if (employee1 != null){
                employee1.setName(employee.getName());
                employee1.setAddress(employee.getAddress());

                return employeeRepository.save(employee1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(long id) {
        if (id >= 1){
            Employee employee = employeeRepository.getById(id);
            if (employee != null){
                employeeRepository.delete(employee);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.getById(id);
    }


    public List<Employee> sortEmployee() {
        List<Employee> allEmployee = getAllEmployee().stream().sorted(Comparator.comparing(Employee::getName)).toList();
        return allEmployee;
    }

    public List<Employee> sortEmployeeByAddress() {
        List<Employee> allEmployee = getAllEmployee().stream().sorted(Comparator.comparing(Employee::getAddress)).toList();
        return allEmployee;
    }

}





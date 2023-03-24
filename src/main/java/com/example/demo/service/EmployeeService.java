package com.example.demo.service;

import com.example.demo.models.Employee;

import java.util.List;

public interface EmployeeService {

    //ham them nhan vien
    public Employee addEmployee(Employee employee);

    //ham chinh sua thong tin nhan vien
    public Employee updateEmployee(long id, Employee employee);

    //ham xoa nhan vien
    public boolean  deleteEmployee(long id);

    //ham lay ra danh sach nhan vien
    public List<Employee> getAllEmployee();

    public Employee getEmployeeById(long id);

}

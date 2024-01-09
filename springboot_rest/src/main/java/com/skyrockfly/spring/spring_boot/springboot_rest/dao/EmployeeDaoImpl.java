package com.skyrockfly.spring.spring_boot.springboot_rest.dao;

import com.skyrockfly.spring.spring_boot.springboot_rest.entity.Employee;
import jakarta.persistence.EntityManager;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO{

    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Employee> getAllEmployees() {

        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {

        entityManager.merge(employee);
        }

    @Override
    public Employee getEmployee(int id) {

        Employee employee = entityManager.find(Employee.class,id);
                return employee;
    }

    @Override
    public void deleteEmployee(int id) {

        Query query = entityManager.createQuery(
                "delete from Employee " + "where id =:employeeId"
        );
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}

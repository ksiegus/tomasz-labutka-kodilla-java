package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeDaoTestSuite {

    @Autowired
    private EmployeeDao employeeDao;


    @Test
    void testRetriveEmployeeByLastName() {
        //Given
        Employee employee1 = new Employee("Frank", "Black");
        Employee employee2 = new Employee("Johny", "Deep");
        Employee employee3 = new Employee("Sylvester", "Stalone");
        Employee employee4 = new Employee("Andrew", "Black");


        employeeDao.save(employee1);
        int employeeId1 = employee1.getId();
        employeeDao.save(employee2);
        int employeeId2 = employee2.getId();
        employeeDao.save(employee3);
        int employeeId3 = employee3.getId();
        employeeDao.save(employee4);
        int employeeId4 = employee4.getId();

        List<Employee> employees = employeeDao.retrieveEmployeeByLastName("Black");

        assertEquals(2, employees.size());

        try {
            employeeDao.deleteById(employeeId1);
            employeeDao.deleteById(employeeId2);
            employeeDao.deleteById(employeeId3);
            employeeDao.deleteById(employeeId4);
        } catch (Exception e) {
            //do nothing
        }

    }

}

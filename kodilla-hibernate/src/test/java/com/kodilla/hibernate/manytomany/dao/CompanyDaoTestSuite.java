package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;


    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        //try {
        //    companyDao.deleteById(softwareMachineId);
        //    companyDao.deleteById(dataMaestersId);
        //    companyDao.deleteById(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }

    @Test
    void testRetriveCompanyByPhrase() {

        Company company1 = new Company("Software Machine");
        Company company2 = new Company("Software House");
        Company company3 = new Company("Kodilla");
        Company company4 = new Company("Hardware");
        Company company5 = new Company("Sofix");

        companyDao.save(company1);
        int companyId1 = company1.getId();
        companyDao.save(company2);
        int companyId2 = company2.getId();
        companyDao.save(company3);
        int companyId3 = company3.getId();
        companyDao.save(company4);
        int companyId4 = company4.getId();
        companyDao.save(company5);
        int companyId5 = company5.getId();

        List<Company> companies = companyDao.retrieveCompanyByPhrase("Sof");

        for(Company company : companies) {
            System.out.println(company);
        }



        assertEquals(3, companies.size());

        try {
            companyDao.deleteById(companyId1);
            companyDao.deleteById(companyId2);
            companyDao.deleteById(companyId3);
            companyDao.deleteById(companyId4);
            companyDao.deleteById(companyId5);
        } catch (Exception e) {
            //do nothing
        }



    }

}
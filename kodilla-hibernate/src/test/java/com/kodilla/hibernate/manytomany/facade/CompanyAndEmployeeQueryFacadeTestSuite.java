package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyAndEmployeeQueryFacadeTestSuite {
    @Autowired
    private CompanyAndEmployeeQueryFacade companyAndEmployeeQueryFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testRetrieveCompanyName() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company softDataMasters = new Company("Soft Data Masters");
        Company greyMatter = new Company("Grey Matter");
        companyDao.save(softwareMachine);
        companyDao.save(softDataMasters);
        companyDao.save(greyMatter);

        //When
        List<Company> result = companyAndEmployeeQueryFacade.retrieveCompanyName("soft");

        //Then
        Assert.assertEquals(2, result.size());

        //Cleanup
        companyDao.deleteAll();
    }

    @Test
    public void testRetrieveEmployeeName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee lindaSmith = new Employee("Linda", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        employeeDao.save(johnSmith);
        employeeDao.save(lindaSmith);
        employeeDao.save(stephanieClarkson);

        //When
        List<Employee> result = companyAndEmployeeQueryFacade.retrieveEmployeeName("smith");

        //Then
        Assert.assertEquals(2, result.size());

        //Cleanup
        employeeDao.deleteAll();
    }
}
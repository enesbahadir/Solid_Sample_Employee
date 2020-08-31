package com.company;
import java.util.ArrayList;
import java.util.List;

/**
 *  Sistemin çalışmasını kontrol eden sınıf
 */
public class Main {

    public static void main(String[] args) {

        int annualLeaveSample1 = 5, annualLeaveSample2 = 80;

        Employee developer = new Employee(15,"Bahadır",1000,false);
        System.out.println(developer.toString());

        Employee manager = new Employee(15,"Enes",1500,true);
        System.out.println(manager.toString());

        /*List<Employee> employees = new ArrayList<Employee>();
        Company company = new Company(employees, "Aurora", 1);

        CompanyController companyController = new CompanyController();
        companyController.addEmployeeToCompany(developer,company);
        companyController.addEmployeeToCompany(manager,company);
        companyController.addEmployeeToCompany(developer,company); */

        SalaryController salaryController;
        if(manager.getIsManager())
            salaryController = new SalaryController(new ManagerSalaryManagement());

        else
            salaryController = new SalaryController(new DeveloperSalaryManagement());

        salaryController.executeCalculateIncreasedSalary(developer);
        System.out.println(developer.toString());

        if(manager.getIsManager())
            salaryController = new SalaryController(new ManagerSalaryManagement());
        else
            salaryController = new SalaryController(new DeveloperSalaryManagement());

        salaryController.executeCalculateIncreasedSalary(manager);
        System.out.println(manager.toString());

       /* AnnualVacationManagement takeAnnualLeaveSample1 = new AnnualVacationManagement();
        takeAnnualLeaveSample1.takeAnnualVacation(developer, annualLeaveSample1);

        AnnualVacationManagement takeAnnualLeaveSample2 = new AnnualVacationManagement();
        takeAnnualLeaveSample2.takeAnnualVacation(manager, annualLeaveSample2); */

    }
}
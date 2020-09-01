package com.company;
import java.util.ArrayList;
import java.util.List;

/**
 *  Sistemin çalışmasını kontrol eden sınıf
 */
public class Main {

    public static void main(String[] args) {

        int annualLeaveSample1 = 5, annualLeaveSample2 = 80;

        Employee developer = new Developer(15,"Bahadır",1000, EmployeePositions.DEVELOPER);
        System.out.println(developer.toString());

        Employee manager = new Manager(15,"Enes",1500, EmployeePositions.MANAGER);
        System.out.println(manager.toString());

        SalaryController salaryController = null;
        salaryController = getSalaryController(developer, salaryController);
        salaryController = getSalaryController(manager, salaryController);

        List<Employee> aTypeCompanyEmployees = new ArrayList<Employee>();
        Company aTypeCompany = new ATypeCompany(aTypeCompanyEmployees, "Aurora",1, CompanyType.ATYPECOMPANY);

        List<Employee> bTypeCompanyEmployees = new ArrayList<Employee>();
        Company bTypeCompany = new BTypeCompany(bTypeCompanyEmployees, "Arora",2, CompanyType.BTYPECOMPANY);

        CompanyController companyController = null;
        companyController = new CompanyController(new ATypeCompanyManagement());
        companyController.executeAddEmployee(aTypeCompany,developer);

        companyController.executeDeleteEmployee(aTypeCompany,manager);
        companyController.executeDeleteEmployee(aTypeCompany,developer);

        companyController = new CompanyController(new BTypeCompanyManagement());
        companyController.executeAddEmployee(bTypeCompany,manager);
        companyController.executeAddEmployee(bTypeCompany,manager);
        companyController.executeAddEmployee(bTypeCompany,developer);

    }

    private static SalaryController getSalaryController(Employee employee, SalaryController salaryController) {
        switch (employee.getPosition()) {
            case DEVELOPER:
                salaryController = new SalaryController(new DeveloperISalaryManagement());
            case MANAGER:
                salaryController = new SalaryController(new ManagerISalaryManagement());
        }

        salaryController.executeCalculateIncreasedSalary(employee);
        System.out.println(employee.toString());
        return salaryController;
    }
}

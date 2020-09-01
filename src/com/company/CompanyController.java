package com.company;

/**
 *
 */
public class CompanyController {
    private ICompanyManagement iCompanyManagement;

    /**
     *
     * @param iCompanyManagement
     */
    public CompanyController(ICompanyManagement iCompanyManagement) {
        this.iCompanyManagement = iCompanyManagement;
    }

    /**
     *
     * @param company
     * @param employee
     */
    public void executeAddEmployee (Company company, Employee employee) {
        iCompanyManagement.addEmployeeToCompany(employee,company);
    }

    /**
     *
     * @param company
     * @param employee
     */
    public void executeDeleteEmployee (Company company, Employee employee) {
        iCompanyManagement.removeEmployeeFromCompany(employee,company);
    }

}


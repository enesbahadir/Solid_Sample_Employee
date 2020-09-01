package com.company;

/**
 * Şirketler ile ilgili yapılacak işlemleri -ekleme, çıkarma- gibi yapacak olan işlemi ilgili şirket türündeki
 * metoda yönlendirilmesini sağlayan sınıf
 */
public class CompanyController {
    private ICompanyManagement iCompanyManagement;

    /**
     * @param iCompanyManagement şirketin işlemlerinin tanımlandığı interface
     */
    public CompanyController(ICompanyManagement iCompanyManagement) {
        this.iCompanyManagement = iCompanyManagement;
    }

    /**
     * @param company ilgili şirket
     * @param employee ilgili işçi
     */
    public void executeAddEmployee (Company company, Employee employee) {
        iCompanyManagement.addEmployeeToCompany(employee,company);
    }

    /**
     *
     * @param company ilgili şirket
     * @param employee ilgili işçi
     */
    public void executeDeleteEmployee (Company company, Employee employee) {
        iCompanyManagement.removeEmployeeFromCompany(employee,company);
    }

}


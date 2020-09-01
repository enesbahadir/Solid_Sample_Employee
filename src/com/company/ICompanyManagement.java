package com.company;

public interface ICompanyManagement {
    /**
     * ilgili işçiyi ilgili şirkette ekleyen metod
     * @param employee ilgili işçi
     * @param company ilgili şirket
     */
    void addEmployeeToCompany(Employee employee, Company company);

    /**
     * ilgili işçiyi ilgili şirketten çıkaran metod
     * @param employee ilgili işçi
     * @param company ilgili şirket
     */
    void removeEmployeeFromCompany(Employee employee, Company company);

    /**
     * ilgili işçinin ilgili şirkette olup olmadığını kontrol eden metod
     * @param employee ilgili işçi
     * @param company ilgili şirket
     * @return ilgili işçi ilgili şirkette bulunuyorsa true, bulunmuyorsa false döner
     */
    boolean isCompanyContainEmployee(Employee employee, Company company);
}

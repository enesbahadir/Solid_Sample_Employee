package com.company;

public class BTypeCompanyManagement implements ICompanyManagement {
    /**
     * ilgili işçiyi ilgili şirkette ekleyen metod
     * @param employee ilgili işçi
     * @param company ilgili şirket
     */
    @Override
    public void addEmployeeToCompany(Employee employee, Company company) {
        if (!isCompanyContainEmployee(employee,company)) {
            System.out.println(employee.getName() + " isimli işçi "+ company.getName()+ " isimli şirkete eklenmiştir.");
            company.getEmployees().add(employee);
        }
        else System.out.println(employee.getName() + " isimli işçi "+ company.getName()+" isimli şirkette bulunmaktadır");
    }

    /**
     * ilgili işçiyi ilgili şirketten çıkaran metod
     * @param employee ilgili işçi
     * @param company ilgili şirket
     */
    @Override
    public void removeEmployeeFromCompany(Employee employee, Company company) {
        if (isCompanyContainEmployee(employee,company)) {
            company.getEmployees().remove(employee);
            System.out.println(employee.getName() + " isimli işçi " + company.getName() + " isimli şirketten çıkarılmıştır.");
        }
        else System.out.println(employee.getName() + " isimli işçi "+ company.getName()+" isimli şirkette bulunmamaktadır");
    }

    /**
     *  ilgili işçinin ilgili şirkette olup olmadığını kontrol eden metod
     * @param employee ilgili işçi
     * @param company ilgili şirket
     * @return ilgili işçi ilgili şirkette bulunuyorsa true, bulunmuyorsa false döner
     */
    @Override
    public boolean isCompanyContainEmployee(Employee employee, Company company) {
        return company.getEmployees().contains(employee);
    }
}

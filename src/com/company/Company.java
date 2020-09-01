package com.company;
import java.util.List;

/**
 * Şirketin özelliklerinin bulunduğu sınıf
 */
public abstract class Company {
    private List <Employee> employees;
    private String name;
    private int id;
    private CompanyType companyType;

    /**
     *
     * @param employees şirkette çalışan işçilerin listesi
     * @param name şirketin ismi
     * @param id şirkete özel üretin numara
     */
    public Company(List<Employee> employees, String name, int id, CompanyType companyType) {
        this.employees = employees;
        this.name = name;
        this.id = id;
        this.companyType = companyType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public List<Employee> getEmployees() {

        return employees;
    }

    public void setEmployees(List<Employee> employees) {

        this.employees = employees;
    }

    public String getName() {

        return name;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }

    public void setCompanyType(CompanyType companyType) {
        this.companyType = companyType;
    }
}

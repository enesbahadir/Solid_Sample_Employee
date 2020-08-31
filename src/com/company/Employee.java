package com.company;

/**
 * Sistemde bulunan işçilerin bilgilerinin tanımlandığı sınıf
 */
public class Employee {
    private Integer annualVacation;
    private String name;
    private Double salary;
    private boolean isManager;

    /**
     * constructor metodu
     *
     * @param annualVacation işçinin kullanabileceği izin miktarı
     * @param name           işçinin ismi
     * @param salary         işçinin maaşı
     * @param isManager      işçinin manager türünde olup, olmaması
     */
    public Employee(Integer annualVacation, String name, double salary, boolean isManager) {
        this.annualVacation = annualVacation;
        this.name = name;
        this.salary = salary;
        this.isManager = isManager;
    }

    /**
     * annualVacation değerine erişmek için yazılan get() metodu
     * @return annualVacation işçinin kalan izin günü
     */
    public Integer getAnnualVacation() {
        return annualVacation;
    }

    /**
     * annualVacation değerini değiştirmek için yazılan set() metodu
     * @param annualVacation işçinin kalan izin günü
     */
    public void setAnnualVacation(Integer annualVacation) {
        this.annualVacation = annualVacation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public boolean getIsManager() {
        return isManager;
    }

    public void setIsManager(boolean isManager) {
        this.isManager = isManager;
    }

    @Override
    public String toString() {
        return "Çalışan Bilgisi; İsim : " + name + "; Kalan izin süresi :" + annualVacation + "; Maaş :" + salary;

    }
}

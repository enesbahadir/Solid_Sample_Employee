package com.company;

/**
 * Strategy Design Pattern'a uygun olarak SalaryManagenet sınıfını kontrol eder,
 * SalaryManagement sıınıfının objesini parametre olarak alarak uygun tipteki işçi class'ındaki
 * calculateIncreasedSalary metodunu çalıştırır
 */
public class SalaryController {
    private final ISalaryManagement ISalaryManagement;

    /**
     * constructor metodu
     * @param ISalaryManagement SalaryManagement objesi
     */
    public SalaryController(ISalaryManagement ISalaryManagement) {
        this.ISalaryManagement = ISalaryManagement;

    }

    /**
     *ilgili işçinin maaşının arttırılmış halini hesaplaycak olan metodu ISalaryManagement interface'i üzerinden çağıran metod
     * @param employee ilgili işçi
     */
    public void executeCalculateIncreasedSalary(Employee employee) {
        ISalaryManagement.calculateIncreasedSalary(employee);
    }

    /**
     *ilgili işçinin maaşının azaltılmış halini hesaplaycak olan metodu ISalaryManagement interface'i üzerinden çağıran metod
     * @param employee
     */
    public void executeCalculateDecreasedSalary(Employee employee) {
        ISalaryManagement.calculateDecreasedSalary(employee);
    }
}

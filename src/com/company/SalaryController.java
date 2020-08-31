package com.company;

/**
 * Strategy Design Pattern'a uygun olarak SalaryManagenet sınıfını kontrol eder,
 * SalaryManagement sıınıfının objesini parametre olarak alarak uygun tipteki işçi class'ındaki
 * calculateIncreasedSalary metodunu çalıştırır
 */
public class SalaryController {
    private final SalaryManagement salaryManagement;

    /**
     * constructor metodu
     * @param salaryManagement SalaryManagement objesi
     */
    public SalaryController(SalaryManagement salaryManagement) {
        this.salaryManagement = salaryManagement;

    }

    /**
     *
     * @param employee ilgili işçi
     */
    public void executeCalculateIncreasedSalary(Employee employee) {
        salaryManagement.calculateIncreasedSalary(employee);
    }

    /**
     *
     * @param employee
     */
    public void executeCalculateDecreasedSalary(Employee employee) {
        salaryManagement.calculateDecreasedSalary(employee);
    }
}

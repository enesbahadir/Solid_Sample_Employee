package com.company;
/**
 *  Manager olarak tanımlanan işçinin maaş işlemlerinin gerçekleştirildiği sınıf
 */
public class ManagerSalaryManagement implements SalaryManagement{
    static double MANAGER_ANNUAL_RAISE_SALARY =  1.3;
    /**
     *  Manager olaralk tanımlanan işçinin yıllık maaş artışını hesaplayan metod
     * @param employee ilgili işçi
     * @return maaşın yeni-artmış hali
     */
    @Override
    public double calculateIncreasedSalary(Employee employee){
        employee.setSalary(employee.getSalary()* MANAGER_ANNUAL_RAISE_SALARY);
        return employee.getSalary();
    }

    /**
     * Manager olaralk tanımlanan işçinin azalmış maaşını hesaplayan metod
     * @param employee ilgili işçi
     * @return maaşı yeni azalmış hali
     */
    @Override
    public double calculateDecreasedSalary(Employee employee){
        employee.setSalary(employee.getSalary()/MANAGER_ANNUAL_RAISE_SALARY);
        return employee.getSalary();
    }

}

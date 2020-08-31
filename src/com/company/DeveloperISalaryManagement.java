package com.company;

/**
 *  Developer olarak tanımlanan işçinin maaş işlemlerinin gerçekleştirildiği sınıf
 */
public class DeveloperISalaryManagement implements ISalaryManagement {
    /**
     *  Developer olaralk tanımlanan işçinin yıllık maaş artışını hesaplayan metod
     * @param employee ilgili işçi
     * @return maaşın yeni-artmış hali
     */
    @Override
    public double calculateIncreasedSalary(Employee employee){
        employee.setSalary(employee.getSalary()*1.2);
        return employee.getSalary();
    }

    /**
     * Developer olaralk tanımlanan işçinin azalmış maaşını hesaplayan metod
     * @param employee ilgili işçi
     * @return maaşı yeni azalmış hali
     */
    @Override
    public double calculateDecreasedSalary(Employee employee){
        employee.setSalary(employee.getSalary()/1.2);
        return employee.getSalary();
    }

}
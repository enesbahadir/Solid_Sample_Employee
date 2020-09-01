package com.company;

public class Manager extends Employee {
    /**
     * constructor metodu
     *
     * @param annualVacation işçinin kullanabileceği izin miktarı
     * @param name           işçinin ismi
     * @param salary         işçinin maaşı
     * @param position       işçinin pozisyonu
     */
    public Manager(Integer annualVacation, String name, double salary, EmployeePositions position) {
        super(annualVacation, name, salary, position);
    }
}

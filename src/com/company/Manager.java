package com.company;

public class Manager extends Employee {
    /**
     * constructor metodu
     *
     * @param annualVacation işçinin kullanabileceği izin miktarı
     * @param name           işçinin ismi
     * @param salary         işçinin maaşı
     */
    public Manager(Integer annualVacation, String name, double salary, Positions position) {
        super(annualVacation, name, salary, position);
    }
}

package com.company;

public class Developer extends Employee{
    /**
     * constructor metodu
     *
     * @param annualVacation işçinin kullanabileceği izin miktarı
     * @param name           işçinin ismi
     * @param salary         işçinin maaşı
     */
    public Developer(Integer annualVacation, String name, double salary, Positions position) {
        super(annualVacation, name, salary, position);
    }
}

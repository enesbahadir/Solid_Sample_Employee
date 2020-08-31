package com.company;

/**
 * Sistemde bulunan işçilerin bilgilerinin tanımlandığı sınıf
 */
abstract class Employee {
    private Integer annualVacation;
    private String name;
    private Double salary;
    private Positions position;

    /**
     * constructor metodu
     *  @param annualVacation işçinin kullanabileceği izin miktarı
     * @param name           işçinin ismi
     * @param salary         işçinin maaşı
     * @param position işçinin pozisyonu
     */
    public Employee(Integer annualVacation, String name, double salary, Positions position) {
        this.annualVacation = annualVacation;
        this.name = name;
        this.salary = salary;
        this.position = position;
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

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Çalışan Bilgisi; İsim : " + name + "; Kalan izin süresi :" + annualVacation + "; Maaş :" + salary;

    }
}

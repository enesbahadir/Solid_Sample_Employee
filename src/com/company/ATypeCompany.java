package com.company;

import java.util.List;

/**
 * Sistemde tanımlanan herhangi "a" türünde şirket
 */
public class ATypeCompany extends Company {
    /**
     *
     * @param employees şirkette çalışan işçi listesi
     * @param name şirketin ismi
     * @param id şirketin uniqe numarası
     * @param companyType şiketin türü
     */
    public ATypeCompany(List<Employee> employees, String name, int id, CompanyType companyType) {
        super(employees, name, id,companyType);
    }


}

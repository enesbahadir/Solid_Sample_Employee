package com.company;

import java.util.List;

/**
 * sistemde tanımlanan herhangi "b" türünde şirket
 */
public class BTypeCompany extends Company {
    /**
     *
     * @param employees şirkette çalışan işçi listesi
     * @param name şirketin ismi
     * @param id şirketin uniqe numarası
     * @param companyType şiketin türü
     */
    public BTypeCompany(List<Employee> employees, String name, int id,CompanyType companyType) {
        super(employees, name, id,companyType);
    }
}

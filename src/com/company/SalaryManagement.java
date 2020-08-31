package com.company;

/**
 *  İşçilerin maaş düzenleme sayfalarında kullanılacak olan metodların bulunduğu interface.
 *  Her bir işçi sınıfı için ayrı ayrı çağrılmıştır.
 */
public interface SalaryManagement {
    /**
     * İlgili işçinin maaşının artmış halini hesaplayan metod
     * @param employee ilgili işçi
     * @return işçinin yıllık artmış olan yeni maaşını döner
     */
     double calculateIncreasedSalary(Employee employee);

    /**
     * İlgili işçinin maaşının azalmış halini hesaplayan metod
     * @param employee ilgili işçi
     * @return işçinin yıllık azalmış olan yeni maaşını döner
     */
     double calculateDecreasedSalary(Employee employee);


}

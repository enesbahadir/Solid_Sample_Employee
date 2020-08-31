package com.company;
/**
*  işçilerin yıllık izin işlemlerinin sağlandığı sınıf
* */
public class AnnualVacationManagement {
    /**
     * işçinin yıllık izin kullanmasını sağlayan metod
     * @param employee ilgili işçi
     * @param annualVacation kullanılacak izin günü
     */
    public void takeAnnualVacation(Employee employee, int annualVacation) {
        if(isEnoughAnnualVacationDays(employee, annualVacation))
        {
            employee.setAnnualVacation(employee.getAnnualVacation()-annualVacation);
            System.out.println(employee.getName()+ " adına "+ annualVacation + " gün izin kullanılmıştır. Kalan izin süreniz "
                    + employee.getAnnualVacation()+" gündür.");

        }
        else
            System.out.println("Girdiğiniz miktar kalan izin sürenizden fazladır.");
    }

    /**
     * işçinin yıllık iznine gün eklemeyi sağlayan metod
     * @param employee ilgili işçi
     * @param additiveAnnualVacationDays işçinin yıllık iznine eklencek gün
     */
    public void addAnnulaVacation(Employee employee, int additiveAnnualVacationDays) {
        employee.setAnnualVacation(employee.getAnnualVacation() + additiveAnnualVacationDays);
    }

    /**
     * İşçinin kalan izin günü, kullanmak istediği izin gününe eşit veya büyük olup olmadığını kontrol eden metod
     * @param employee ilgili işçi
     * @param annualVacation kullanılmak istenen izin günü
     * @return istenen izin günü uygunsa doğru(true), değilse yanlış(false) döner
     */
    public boolean isEnoughAnnualVacationDays(Employee employee, int annualVacation)
    {
        return employee.getAnnualVacation() >= annualVacation;
    }

}
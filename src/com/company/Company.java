package com.company;
import java.util.List;

/**
 *
 */
public abstract class Company {
    private List <Employee> employees;
    private String name;
    private int id;

    /**
     *
     * @param employees
     * @param name
     * @param id
     */
    public Company(List<Employee> employees, String name, int id) {
        this.employees = employees;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public List<Employee> getEmployees() {

        return employees;
    }

    public void setEmployees(List<Employee> employees) {

        this.employees = employees;
    }

    public String getName() {

        return name;
    }
}

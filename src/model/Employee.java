package model;

public class Employee {
    private int id;
    private String name = "";
    private String designation = "";
    private String depeartment = "";
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepeartment() {
        return depeartment;
    }

    public void setDepeartment(String depeartment) {
        this.depeartment = depeartment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
   
   
}

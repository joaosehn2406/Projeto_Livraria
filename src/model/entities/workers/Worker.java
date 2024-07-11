package model.entities.workers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Worker {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private double valuePerHour;
    private int workHours;
    private String name;
    private String cpf;
    private Date birthDate;
    private int id;


    public Worker() {

    }

    public Worker(double valuePerHour, int workHours, String name, String cpf, Date birthDate, int id) {
        this.valuePerHour = valuePerHour;
        this.workHours = workHours;
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.id = id;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double totalSalary() {
        return valuePerHour * workHours;
    }

    @Override
    public String toString() {
        return "Worker: " +
                "{ valuePerHour=" + valuePerHour +
                ", workHours=" + workHours +
                ", total salary= " + String.format("%.2f", totalSalary()) +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", birthDate=" + birthDate +
                ", id=" + id +
                " }";
    }
}

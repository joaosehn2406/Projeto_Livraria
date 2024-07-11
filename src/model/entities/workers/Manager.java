package model.entities.workers;

import java.util.Date;

public class Manager extends Worker{

    private double bonus;

    public Manager(double valuePerHour, int workHours, String name, String cpf, Date birthDate, int id, double bonus) {
        super(valuePerHour, workHours, name, cpf, birthDate, id);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double totalSalary() {
        return super.totalSalary() + bonus;
    }
}

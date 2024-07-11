package model.entities.workers;

import java.util.Date;

public class SaleHelper extends Worker{

    private int salesQuantity;

    public SaleHelper(double valuePerHour, int workHours, String name, String cpf, Date birthDate, int id, int salesQuantity) {
        super(valuePerHour, workHours, name, cpf, birthDate, id);
        this.salesQuantity = salesQuantity;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(int salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", salesQuantity=" + salesQuantity +
                '}';
    }

    @Override
    public double totalSalary() {
        return super.totalSalary() + salesQuantity * 0.05f;
    }
}

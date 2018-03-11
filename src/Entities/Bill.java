package Entities;

import java.util.Objects;

public class Bill {
    private long code;
    private float price;

    public Bill(long code, float price) {
        this.code = code;
        this.price = price;
    }

    public Bill() {
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bill)) return false;
        Bill bill = (Bill) o;
        return getCode() == bill.getCode() &&
                Float.compare(bill.getPrice(), getPrice()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCode(), getPrice());
    }

    @Override
    public String toString() {
        return "Bill{" +
                "code=" + code +
                ", price=" + price +
                '}';
    }
}

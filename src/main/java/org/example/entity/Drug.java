package org.example.entity;

import java.util.Objects;

public class Drug {
    private String name;
    private int quantity;
    private long price;
    private boolean isExist;
    private boolean isConfirm;
    private boolean isPay;
    private long totalPrice;
    private String patientNationalCode;
    public Drug(String name, double price, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Drug(String name, int quantity) {
    }

    public boolean isPay() {
        return isPay;
    }

    public void setPay(boolean pay) {
        isPay = pay;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        this.isExist = exist;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice() {
        totalPrice = price*quantity;
    }

    public String getPatientNationalCode() {
        return patientNationalCode;
    }

    public void setPatientNationalCode(String patientNationalCode) {
        this.patientNationalCode = patientNationalCode;
    }

    public boolean isConfirm() {
        return isConfirm;
    }

    public void setConfirm(boolean confirm) {
        isConfirm = confirm;
    }



    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", doesExist=" + isExist +
                ", isConfirmed=" + isConfirm+
                ", totalPrice=" + totalPrice +
                ", patient's national code=" + patientNationalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drug that = (Drug) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

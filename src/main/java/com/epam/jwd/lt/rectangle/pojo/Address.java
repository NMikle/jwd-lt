package com.epam.jwd.lt.rectangle.pojo;

import java.util.Objects;

public class Address {

    private String street;
    private int building;
    private Integer flat;

    public Address() {
    }

    public Address(String street, int building, Integer flat) {
        this.street = street;
        this.building = building;
        this.flat = flat;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public Integer getFlat() {
        return flat;
    }

    public void setFlat(Integer flat) {
        this.flat = flat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (building != address.building) return false;
        if (!Objects.equals(street, address.street)) return false;
        return Objects.equals(flat, address.flat);
    }

    @Override
    public int hashCode() {
        int result = street != null ? street.hashCode() : 0;
        result = 31 * result + building;
        result = 31 * result + (flat != null ? flat.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", building=" + building +
                ", flat=" + flat +
                '}';
    }
}

package org.acme;

public class Address {
    private int id;
    private String city;
    private String avenue;
    private int number;

    public Address(int id, String city, String avenue, int number) {
        this.id = id;
        this.city = city;
        this.avenue = avenue;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

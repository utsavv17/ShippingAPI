/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 91789
 */
public class ShippingDetails {
    private int shippingId;
    private String address;
    private String city;
    private String pincode;
    private int poId;
    private int customerId;

    public ShippingDetails() {
        // Default constructor
    }

    public ShippingDetails(int shippingId, String address, String city, String pincode, int poId, int customerId) {
        this.shippingId = shippingId;
        this.address = address;
        this.city = city;
        this.pincode = pincode;
        this.poId = poId;
        this.customerId = customerId;
    }

    // Getters and setters

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public int getPoId() {
        return poId;
    }

    public void setPoId(int poId) {
        this.poId = poId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}


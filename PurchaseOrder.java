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
public class PurchaseOrder {
    private int poId;
    // Other purchase order details

    public PurchaseOrder() {
        // Default constructor
    }

    public PurchaseOrder(int poId) {
        this.poId = poId;
        // Initialize other purchase order details as needed
    }

    // Getters and setters

    public int getPoId() {
        return poId;
    }

    public void setPoId(int poId) {
        this.poId = poId;
    }
}

package model;

public class CustomerDetails {
    private int customerId;
    // Other customer details

    public CustomerDetails() {
        // Default constructor
    }

    public CustomerDetails(int customerId) {
        this.customerId = customerId;
        // Initialize other customer details as needed
    }

    // Getters and setters

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}

package com.firstapi.restdemo.model;

public class CloudVendors {
    private String vendorId;
    private String vendorNmae;
    private String vendorAddress;
    private String vendorPhoneNumber;

    public CloudVendors() {
    }

    public CloudVendors(String vendorId, String vendorNmae, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorNmae = vendorNmae;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorNmae() {
        return vendorNmae;
    }

    public void setVendorNmae(String vendorNmae) {
        this.vendorNmae = vendorNmae;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}

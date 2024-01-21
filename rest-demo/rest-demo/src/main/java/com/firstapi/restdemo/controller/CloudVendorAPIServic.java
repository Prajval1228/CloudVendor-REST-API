package com.firstapi.restdemo.controller;

import com.firstapi.restdemo.model.CloudVendors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIServic {

    CloudVendors cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendors getCloudVendorDetails(String vendorId){

        return cloudVendor;
       // return new CloudVendors("C1","Vendor 1","Address 1","4544121");

    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendors cloudVendor){

        this.cloudVendor = cloudVendor;

        return "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendors cloudVendor) {

        this.cloudVendor = cloudVendor;

        return "Cloud Vendor Update Successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId) {

        this.cloudVendor = null;

        return "Cloud Vendor Deleted Successfully";
    }
}

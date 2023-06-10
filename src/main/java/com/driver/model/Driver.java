package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;

    private String password;

    private String mobileNo;

    @OneToOne(mappedBy = "driver",cascade = CascadeType.ALL)
    public Cab cab;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    public List<TripBooking> tripBookingList = new ArrayList<>();

    public Driver() {
    }

    public Driver(String password, String mobileNo, Cab cab, List<TripBooking> tripBookingList) {
        this.password = password;
        this.mobileNo = mobileNo;
        this.cab = cab;
        this.tripBookingList = tripBookingList;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}
package org.scaler.bookmyshow_sept23_evening.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    // Booking 1 : 1 User
    // Booking M  : 1 User
    @ManyToOne
    private User bookedBy;
    private Date bookedAt;
    @ManyToMany
    private List<ShowSeat> seats;
    @OneToMany(mappedBy = "booking")
    private List<Payment> payments;
    private int amount;
    private BookingStatus bookingStatus;

}

// 1 Booking can have multiple showSeats : at max 10
// 1 showSeat can also present in multiple bookings : cancelled bookings


// HW : You'll have to figure out these cardinalities for each and every relation


// Next week : No class on wednesday and Friday
// we will be able to complete the module in the same week

// Mock Backend LLD 2 : HIGH PRIORITY
// SOLVE PROBLEMS


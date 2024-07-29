package org.scaler.bookmyshow_sept23_evening.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel {
    @ManyToOne
    private Show show;
    @ManyToOne
    private SeatType seatType;
    private int price;
}

// ShowSeatType : Show
// 1 : 1 : One object of ShowSeatType will contain one Show
// M : 1 : One show can be present in multiple showSeatType objects

// Show1 Gold 100
// Show1 Silver 50
// Show1 Platinum 200
// Show2 Gold
// Show2 Silver
// Show2 Platinum


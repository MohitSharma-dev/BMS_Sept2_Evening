package org.scaler.bookmyshow_sept23_evening.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeatType extends BaseModel {
    private Show show;
    private SeatType seatType;
    private int price;
}

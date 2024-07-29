package org.scaler.bookmyshow_sept23_evening.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Show extends BaseModel {
    private Movie movie;
    private Screen screen;
    private Date startTime;
    private Date endTime;
    // status
    private List<ShowSeat> seats;
    // price
    private List<ShowSeatType> showSeatTypes;
}

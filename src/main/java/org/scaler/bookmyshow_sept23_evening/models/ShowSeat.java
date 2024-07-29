package org.scaler.bookmyshow_sept23_evening.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(value = EnumType.ORDINAL)
    private SeatStatus status;
}


// ShowSeat : Show
// Show1 SeatA1 BOOKED
// Show1 SeatA2

// Show2 SeatA1 0
// Show2 SeatA2 1

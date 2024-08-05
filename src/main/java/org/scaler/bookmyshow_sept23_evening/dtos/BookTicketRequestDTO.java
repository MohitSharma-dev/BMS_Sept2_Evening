package org.scaler.bookmyshow_sept23_evening.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookTicketRequestDTO {
    private List<Integer> showSeatIds;
    private Integer showId;
    private Integer userId;
}

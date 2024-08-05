package org.scaler.bookmyshow_sept23_evening.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDTO {
    private Integer bookingId;
    private Integer amount;
    private ResponseStatus responseStatus;
    private String message;
}

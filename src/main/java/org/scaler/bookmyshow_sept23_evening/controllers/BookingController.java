package org.scaler.bookmyshow_sept23_evening.controllers;

import org.scaler.bookmyshow_sept23_evening.dtos.BookTicketRequestDTO;
import org.scaler.bookmyshow_sept23_evening.dtos.BookTicketResponseDTO;
import org.scaler.bookmyshow_sept23_evening.dtos.ResponseStatus;
import org.scaler.bookmyshow_sept23_evening.models.Booking;
import org.scaler.bookmyshow_sept23_evening.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    @Autowired
    private BookingService bookingService;

    public BookTicketResponseDTO bookTicket(BookTicketRequestDTO request){
        BookTicketResponseDTO response = new BookTicketResponseDTO();
        try {
            Booking booking = bookingService.bookTicket(
                    request.getShowSeatIds(),
                    request.getShowId(),
                    request.getUserId()
            );
            response.setBookingId(booking.getId());
            response.setAmount(booking.getAmount());
            response.setMessage("Booking is Initiated");
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch(Exception ex){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage(ex.getMessage());
        }
        return response;
    }
}

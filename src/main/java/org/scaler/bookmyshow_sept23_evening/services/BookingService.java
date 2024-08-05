package org.scaler.bookmyshow_sept23_evening.services;

import org.scaler.bookmyshow_sept23_evening.models.*;
import org.scaler.bookmyshow_sept23_evening.repositories.BookingRepository;
import org.scaler.bookmyshow_sept23_evening.repositories.ShowRepository;
import org.scaler.bookmyshow_sept23_evening.repositories.ShowSeatRepository;
import org.scaler.bookmyshow_sept23_evening.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    UserRepository userRepository;
    ShowRepository showRepository;
    ShowSeatRepository showSeatRepository;
    BookingRepository bookingRepository;

    @Autowired
    BookingService(
            UserRepository userRepository,
            ShowRepository showRepository,
            ShowSeatRepository showSeatRepository,
            BookingRepository bookingRepository
    ){
        this.userRepository = userRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.bookingRepository = bookingRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookTicket(
            List<Integer> showSeatIds,
            Integer showId,
            Integer userId
    ){
        // 1. Get the User with userId
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()){
            throw new RuntimeException("User not found");
        }
        User user = userOptional.get();
        // 2. Get the Show using showId
        Optional<Show> showOptional = showRepository.findById(showId);
        if(showOptional.isEmpty()){
            throw new RuntimeException("Show not found!");
        }
        // ------  START TRANSACTION ------
        // 3. Get the ShowSeats using Ids
        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);
        // 4. check if all the showSeats are available or not
        for(ShowSeat showSeat : showSeats){
            if(!showSeat.getStatus().equals(SeatStatus.AVAILABLE)){
                // 5. If not, return and no booking happens
                throw new RuntimeException("Seats are not available");
            }
        }
        // 6. If yes, mark all the seats as blocked
        for(ShowSeat showSeat : showSeats){
            showSeat.setStatus(SeatStatus.BLOCKED);
        }
        showSeats = showSeatRepository.saveAll(showSeats);
        // -----  END TRANSACTION -------
        // 7. Create the booking object and set the properties
        Booking booking = new Booking();
        booking.setBookedAt(new Date());
        booking.setBookedBy(user);
        booking.setBookingStatus(BookingStatus.PENDING);
        booking.setSeats(showSeats);

        // find the total price of the tickets
        // showSeatTypeRepo.findByShow(Show)
        // HOMEWORK
        // PriceCalculatorService
        booking.setAmount(100);
        booking.setPayments(new ArrayList<>());
        // 8. Return the booking object
        return bookingRepository.save(booking);
    }
}

// Break : 10 : 28 pm

// /region
// /getMovies
// /shows
// /bookTicket/showSeatIds

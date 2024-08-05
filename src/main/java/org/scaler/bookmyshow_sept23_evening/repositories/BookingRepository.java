package org.scaler.bookmyshow_sept23_evening.repositories;

import org.scaler.bookmyshow_sept23_evening.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
}

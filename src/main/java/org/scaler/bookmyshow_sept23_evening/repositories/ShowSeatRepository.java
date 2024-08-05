package org.scaler.bookmyshow_sept23_evening.repositories;

import org.scaler.bookmyshow_sept23_evening.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {

    @Override
    List<ShowSeat> findAllById(Iterable<Integer> integers);
}

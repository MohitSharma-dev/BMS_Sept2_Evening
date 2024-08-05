package org.scaler.bookmyshow_sept23_evening.repositories;

import org.scaler.bookmyshow_sept23_evening.models.Show;
import org.scaler.bookmyshow_sept23_evening.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {
//    List<ShowSeatType> findAllByShow(Iterable<Integer> longs);
    List<ShowSeatType> findByShow(Show show );
}

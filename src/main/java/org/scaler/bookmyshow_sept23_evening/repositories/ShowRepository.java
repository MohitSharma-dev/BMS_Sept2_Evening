package org.scaler.bookmyshow_sept23_evening.repositories;

import org.scaler.bookmyshow_sept23_evening.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {
}

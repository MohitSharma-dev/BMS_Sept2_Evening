package org.scaler.bookmyshow_sept23_evening.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SeatType extends BaseModel {
    private String name;
}

// 5pm Gold 500
// 11pm Gold 600

// Student : batch_id ,  batch : batch_id
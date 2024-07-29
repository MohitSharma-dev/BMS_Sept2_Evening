package org.scaler.bookmyshow_sept23_evening.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;
    @Enumerated(value = EnumType.ORDINAL)
    @ElementCollection
    private List<Features> features;
    @ManyToOne
    private Theatre theatre;
    @OneToMany
    private List<Seat> seats;
}

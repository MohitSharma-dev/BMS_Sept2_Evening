package org.scaler.bookmyshow_sept23_evening.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "users")
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
    @OneToMany
    private List<Booking> bookings;
}

// User 1 : M Booking
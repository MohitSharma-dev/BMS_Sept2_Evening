package org.scaler.bookmyshow_sept23_evening.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel {
    private String name;
    @ManyToOne
    private Region region;
    private String address;
//    private List<Show> shows;
//    private List<Screen> screens;
//    private List<Movie> movies;
}
// Show : Screen
// Theatre : Region
// 1 : 1
// M  : 1
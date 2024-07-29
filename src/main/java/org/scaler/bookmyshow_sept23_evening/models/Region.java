package org.scaler.bookmyshow_sept23_evening.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Region extends BaseModel {
    private String name;
//    private List<Theatre> theatreList;
//    private List<Movie> movieList;
}

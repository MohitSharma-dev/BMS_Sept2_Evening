package org.scaler.bookmyshow_sept23_evening.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

// These annotations supported by lombok
@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {
    @Id
    private int id;
    private Date createdAt;
    private Date lastModifiedAt;
}


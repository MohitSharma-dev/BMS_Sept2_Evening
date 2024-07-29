package org.scaler.bookmyshow_sept23_evening.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private int amount;
    private Date paymentDate;
    private String refNumber;
    // M : 1
    @ManyToOne
    private Booking booking;
    @Enumerated(value = EnumType.ORDINAL)
    private PaymentMode paymentMode;
    @Enumerated(value = EnumType.ORDINAL)
    private PaymentGateway paymentGateway;
    @Enumerated(value = EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
}

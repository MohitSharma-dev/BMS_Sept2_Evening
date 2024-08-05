package org.scaler.bookmyshow_sept23_evening.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseDTO {
    private int userId;
    private ResponseStatus responseStatus;
    private String message;
}

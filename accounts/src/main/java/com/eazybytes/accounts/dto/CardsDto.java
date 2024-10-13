package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;


@Data
public class CardsDto {

    @NotEmpty(message = "Mobile number cannot be null.")
    @Pattern(regexp ="(^$|[0-9]{10})",message = "Mobile number should be 10 digits")
    //    @Schema(
//            description = "Mobile Number of the customer", example = "9345432123"
//    )
    private String mobileNumber;
    @NotEmpty(message = "card cannot be null.")
    @Pattern(regexp ="(^$|[0-9]{12})",message = "Mobile number should be 12 digits")
//    @Schema(
//            description = "Card Number of the customer", example = "100646930341"
//    )
    private String cardNumber;
    @NotEmpty(message = "Cardtype cannot be null")
//    @Schema(
//            description = "Type of the card", example = "Credit Card"
//    )
    private String cardType;
    @PositiveOrZero(message = "Total card limit should be greater than zero")
//    @Schema(
//            description = "Total amount limit available against a card", example = "100000"
//    )
    private int totalLimit;
    @PositiveOrZero(message = "Total amount used should be greater or equal than zero but less than total limit")
//    @Schema(
//            description = "Total amount used by a Customer", example = "1000"
//    )
    private int amountUsed;
    @PositiveOrZero(message = "Total available amount should be equal or greater than zero")
//    @Schema(
//            description = "Total available amount against a card", example = "90000"
//    )
    private int availableAmount;
}

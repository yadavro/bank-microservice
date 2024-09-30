package com.eazybytes.accounts.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
//@Schema(
//        name = "Accounts",
//        description = "Schema to hold Account information"
//)
public class AccountsDto {

    @NotEmpty(message = "Account number cannot be null")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Account number should be 10 digits")
//    @Schema(
//            description = "Account Number of Eazy Bank account", example = "3454433243"
//    )
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be null")
//    @Schema(
//            description = "Account type of Eazy Bank account", example = "Savings"
//    )
    private String accountType;

    @NotEmpty(message = "Branch Address cannot be null or empty")
//    @Schema(
//            description = "Eazy Bank branch address", example = "123 NewYork"
//    )
    private String branchAddress;
}

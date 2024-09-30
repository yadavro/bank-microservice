package com.eazybytes.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
//@Schema(
//        name = "ErrorResponse",
//        description = "Schema to hold error response information"
//)
public class ErrorResponseDto {

//    @Schema(
//            description = "API path invoked by client"
//    )
    private String apiPath;

//    @Schema(
//            description = "Error code representing the error happened"
//    )
    private HttpStatus errorCode;

//    @Schema(
//            description = "Time representing when the error happened"
//    )
    private String errorMessage;

//    @Schema(
//            description = "Time representing when the error happened"
//    )
    private LocalDateTime errorTime;
}

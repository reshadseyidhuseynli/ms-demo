package com.company.dto.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CardResponse {

    private String cardNumber;
    private BigDecimal balance;

}

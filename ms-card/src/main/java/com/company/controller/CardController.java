package com.company.controller;

import com.company.dto.response.CardResponse;
import com.company.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cards")
public class CardController {

    private final CardService service;

    @GetMapping
    public List<CardResponse> getAllCards(String customerId) {
        return service.findAllByOwner(customerId);
    }

}

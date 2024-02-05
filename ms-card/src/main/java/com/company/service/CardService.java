package com.company.service;

import com.company.dto.response.CardResponse;
import com.company.entity.User;
import com.company.mapper.CardMapper;
import com.company.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository repository;
    private final CardMapper mapper;

    private final UserService userService;

    public List<CardResponse> findAllByOwner(String customerId) {
        User user = userService.findByCustomerId(customerId);
        return repository.findAllByOwner(user).stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }
}
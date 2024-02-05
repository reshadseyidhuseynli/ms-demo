package com.company.service;

import com.company.dto.request.UserRequest;
import com.company.entity.User;
import com.company.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public void signUp(UserRequest request) {
        User user = new User();
        user.setCustomerId(request.getCustomerId());
        user.setPassword(request.getPassword());
        repository.save(user);
    }

    //temporary
    public User findByCustomerId(String customerId) {
        return repository.findByCustomerId(customerId)
                .orElseThrow(() -> new RuntimeException("User not found by given customer id: " + customerId));
    }
}

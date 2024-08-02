package org.example.individualproject.make.user.service;

import lombok.RequiredArgsConstructor;
import org.example.individualproject.make.user.entity.User;
import org.example.individualproject.make.user.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;


    @Transactional(readOnly = false)
    @Override
    public boolean join(User user) {

        Optional<User> existingUser = userRepository.findByUserId(user.getUserId());

        if (existingUser.isPresent()) {
            return false;
        }
        User userJoin = User.builder()
                .userId(user.getUserId())
                .username(user.getUsername())
                .password(user.getPassword())
                .phone(user.getPhone())
                .email(user.getEmail())
                .goal(user.getGoal())
                .sex(user.getSex())
                .build();

        userRepository.save(userJoin);

        return true;
    }

    @Override
    public String login(String userId, String password) {
        Optional<User> userOptional = userRepository.findByUserId(userId);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) {
                return "Login successful";
            } else {
                return "비밀번호 틀림 ";
            }
        } else {
            return "아이디를 찾을 수 없습니다 . ";
        }
    }



}

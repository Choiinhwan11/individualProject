package org.example.individualproject.make.user.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.example.individualproject.make.user.entity.User;
import org.example.individualproject.make.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "user", produces = "application/json")
@CrossOrigin
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @PostMapping(path = "/join")
    public ResponseEntity<String> join(@RequestBody User user) {
        boolean isJoined = userService.join(user);
        if (isJoined) {
            return ResponseEntity.ok("회원가입 성공 ");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("회원가입 실패");
        }
    }

    @PostMapping(path = "/login")
    public ResponseEntity<String> login(@RequestParam String userId
                                        , @RequestParam String password
                                        , HttpSession session) {
        String loginResult = userService.login(userId, password);

        if ("Login successful".equals(loginResult)) {

            session.setAttribute("userId", userId);
            return ResponseEntity.ok("로그인 성공");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("로그인 실패: " + loginResult);
        }
    }



}

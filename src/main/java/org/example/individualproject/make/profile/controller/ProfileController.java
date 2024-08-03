package org.example.individualproject.make.profile.controller;

import lombok.RequiredArgsConstructor;
import org.example.individualproject.make.profile.dto.ProfileDTO;
import org.example.individualproject.make.profile.dto.ProfileUpdateDTO;
import org.example.individualproject.make.profile.service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profiles")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/{userId}")
    public ResponseEntity<ProfileDTO> getProfileById(@PathVariable("userId") String userId) {

        ProfileDTO profile = profileService.getProfileById(userId);
        return ResponseEntity.ok(profile);
    }

//    @PutMapping("/{userId}/profileUpdate")
//    public ResponseEntity<ProfileUpdateDTO> updateProfile(@PathVariable("userId") String userId,
//                                                          @RequestBody ProfileUpdateDTO profileUpdateDTO) {
//        ProfileUpdateDTO updatedProfile = profileService.updateProfile(userId, profileUpdateDTO);
//        return ResponseEntity.ok(updatedProfile);
//    }
}

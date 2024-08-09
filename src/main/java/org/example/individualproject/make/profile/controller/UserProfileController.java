package org.example.individualproject.make.profile.controller;

import lombok.RequiredArgsConstructor;
import org.example.individualproject.make.profile.service.UserProfileService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "profile", produces = "application/json")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class UserProfileController {

    private final UserProfileService profileService;

//    // 프로필 생성
//    @PostMapping
//    public ResponseEntity<Profile> createProfile(@RequestBody Profile profile) {
//        Profile createdProfile = profileService.createProfile(profile);
//        return ResponseEntity.ok(createdProfile);
//    }
//
//    // 프로필 조회 (전체)
//    @GetMapping
//    public ResponseEntity<List<Profile>> getAllProfiles() {
//        List<Profile> profiles = profileService.getAllProfiles();
//        return ResponseEntity.ok(profiles);
//    }
//
//    // 프로필 조회 (단일)
//    @GetMapping("/{id}")
//    public ResponseEntity<Profile> getProfileById(@PathVariable Long id) {
//        Profile profile = profileService.getProfileById(id);
//        return ResponseEntity.ok(profile);
//    }
//
//    // 프로필 수정
//    @PutMapping("/{id}")
//    public ResponseEntity<Profile> updateProfile(@PathVariable Long id, @RequestBody Profile profile) {
//        Profile updatedProfile = profileService.updateProfile(id, profile);
//        return ResponseEntity.ok(updatedProfile);
//    }
//
//    // 프로필 삭제
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteProfile(@PathVariable Long id) {
//        profileService.deleteProfile(id);
//        return ResponseEntity.noContent().build();
//    }
}

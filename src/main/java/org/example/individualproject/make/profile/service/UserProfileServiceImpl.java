package org.example.individualproject.make.profile.service;

import lombok.RequiredArgsConstructor;
import org.example.individualproject.make.profile.repository.UserProfileRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor

public class UserProfileServiceImpl implements UserProfileService {

    private final UserProfileRepository profileRepository;

//    @Override
//    public ProfileDTO getProfileById(Long userId) {
//        Optional<Profile> profile = profileRepository.findById(userId);
//
//        if (profile != null) {
//            return ProfileDTO.builder()
//                    .id(profile.get())
////                    .username(profile.getUsername())
////                    .email(profile.getEmail())
//                    .build();
//        } else {
//            throw new RuntimeException("Profile not found for userId: " + userId);
//        }
//    }

//    public ProfileUpdateDTO updateProfile(String userId, ProfileUpdateDTO profileUpdateDTO) {
//        // 프로필 엔티티 조회
//        Profile profile = profileRepository.findByUserId(userId);
//
//        if (profile != null) {
//
//            if (profileUpdateDTO.getUsername() != null) {
//                profile.setUsername(profileUpdateDTO.getUsername());
//            }
//            if (profileUpdateDTO.getEmail() != null) {
//                profile.setEmail(profileUpdateDTO.getEmail());
//            }
//
//            // 엔티티 저장
//            Profile savedProfile = profileRepository.save(profile);
//
//            // 업데이트된 정보를 ProfileUpdateDTO로 변환하여 반환
//            return ProfileUpdateDTO.builder()
//                    .username(savedProfile.getUsername())
//                    .email(savedProfile.getEmail())
//                    .build();
//        } else {
//            throw new RuntimeException("Profile not found for userId: " + userId);
//        }
//}
}

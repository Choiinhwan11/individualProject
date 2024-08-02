package org.example.individualproject.make.profile.service;

import lombok.RequiredArgsConstructor;
import org.example.individualproject.make.profile.dto.ProfileDTO;
import org.example.individualproject.make.profile.dto.ProfileUpdateDTO;
import org.example.individualproject.make.profile.entity.Profile;
import org.example.individualproject.make.profile.repository.ProfileRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    @Override
    public ProfileDTO getProfileById(String userId) {
        Profile profile = profileRepository.findByUserId(userId);

        if (profile != null) {
            return ProfileDTO.builder()
                    .id(profile.getId())
//                    .username(profile.getUsername())
//                    .email(profile.getEmail())
                    .build();
        } else {
            throw new RuntimeException("Profile not found for userId: " + userId);
        }
    }

    @Override
    @Transactional
    public ProfileUpdateDTO updateProfile(String userId, ProfileUpdateDTO profileUpdateDTO) {
        // 프로필 엔티티 조회
        Profile profile = profileRepository.findByUserId(userId);

        if (profile != null) {
            // 엔티티 업데이트를 빌더 패턴으로 처리
            Profile updatedProfile = Profile.builder()
                    .id(profile.getId())
                    .userId(profile.getUserId())
                    .username(profileUpdateDTO.getUsername())
                    .email(profileUpdateDTO.getEmail())
                    .build();

            // 엔티티 저장
            Profile savedProfile = profileRepository.save(updatedProfile);
        } else {
            throw new RuntimeException("Profile not found for userId: " + userId);
        }
    }

}

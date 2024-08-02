package org.example.individualproject.make.profile.service;

import org.example.individualproject.make.profile.dto.ProfileDTO;
import org.example.individualproject.make.profile.dto.ProfileUpdateDTO;

public interface ProfileService {

    ProfileDTO getProfileById(String userId);
    ProfileUpdateDTO updateProfile(String userId, ProfileUpdateDTO profileUpdateDTO);
}

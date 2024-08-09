package org.example.individualproject.make.profile.repository;

import org.example.individualproject.make.profile.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

//    findByUserId(String userId);


}

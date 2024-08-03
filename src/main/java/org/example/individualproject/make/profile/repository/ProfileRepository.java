package org.example.individualproject.make.profile.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ProfileRepository extends JpaRepository<Profile, Long> {

   org.example.individualproject.make.profile.entity.Profile findByUserId(String userId);


}

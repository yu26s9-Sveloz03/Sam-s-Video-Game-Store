package org.yearup.service;

import org.springframework.stereotype.Service;
import org.yearup.models.Profile;
import org.yearup.repository.ProfileRepository;

@Service
public class ProfileService
{
    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository)
    {
        this.profileRepository = profileRepository;
    }

    public Profile create(Profile profile)
    {
        return profileRepository.save(profile);
    }

    public Profile getByUserId(int userId){
        return profileRepository.getByUserId(userId);
    }

    public Profile updateProfile(int userId, Profile updatedProfile){
        Profile profile = profileRepository.getByUserId(userId);
        profile.setFirstName(updatedProfile.getFirstName());
        profile.setLastName(updatedProfile.getLastName());
        profile.setPhone(updatedProfile.getPhone());
        profile.setEmail(updatedProfile.getEmail());
        profile.setAddress(updatedProfile.getAddress());
        profile.setCity(updatedProfile.getCity());
        profile.setState(updatedProfile.getState());
        profile.setZip(updatedProfile.getZip());
        profileRepository.save(profile);
        return getByUserId(userId);
    }
}

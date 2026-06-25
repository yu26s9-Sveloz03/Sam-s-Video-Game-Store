package org.yearup.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.yearup.models.Profile;
import org.yearup.models.User;
import org.yearup.service.ProfileService;
import org.yearup.service.UserService;

import java.security.Principal;

@RestController
@RequestMapping("/profile")
@PreAuthorize("isAuthenticated()")
@CrossOrigin
public class ProfileController {

    private ProfileService profileService;
    private UserService userService;

    public ProfileController(ProfileService profileService, UserService userService){
        this.profileService = profileService;
        this.userService = userService;
    }

    @GetMapping
    public Profile getByUserId(Principal principal){
        String userName = principal.getName();
        User user = userService.getByUserName(userName);
        int userId = user.getId();
        return profileService.getByUserId(userId);
    }

    @PutMapping
    public ResponseEntity<Profile> updateProfile(Principal principal, @RequestBody Profile profile){
        String userName = principal.getName();
        User user = userService.getByUserName(userName);
        int userId = user.getId();
        Profile profile1 = profileService.updateProfile(userId,profile);
        return ResponseEntity.ok(profile1);
    }

}

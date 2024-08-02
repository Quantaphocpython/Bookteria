package com.devteria.profile.controller;

import org.springframework.web.bind.annotation.*;

import com.devteria.profile.dto.request.ProfileCreationRequest;
import com.devteria.profile.dto.response.UserProfileResponse;
import com.devteria.profile.service.IUserProfileService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
@RequestMapping("/internal/users")
public class InternalUserProfileController {
    IUserProfileService userProfileService;

    @PostMapping
    UserProfileResponse createProfile(@RequestBody ProfileCreationRequest request) {
        log.info("request: {}", request);
        return userProfileService.createProfile(request);
    }
}

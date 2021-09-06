package com.friendlist.friendlist.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.friendlist.friendlist.model.*;

@Configuration
public class FriendlistConfig {

    @Bean
    public FriendlistModel friendlistModelObj() {
        return new FriendlistModel();
    }
}
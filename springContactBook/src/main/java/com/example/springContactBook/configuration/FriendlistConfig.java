package com.example.springContactBook.configuration;

import com.friendlist.friendlist.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FriendlistConfig {

    @Bean
    public FriendlistModel friendlistModelObj() {
        return new FriendlistModel();
    }
}

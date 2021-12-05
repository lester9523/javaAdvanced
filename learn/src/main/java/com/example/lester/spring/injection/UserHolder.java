package com.example.lester.spring.injection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lester
 * @since 2021/12/5 18:16
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserHolder {
    private User user;
    private String description;

    public UserHolder(User user) {
        this.setUser(user);
    }
}

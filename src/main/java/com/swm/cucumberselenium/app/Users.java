package com.swm.cucumberselenium.app;

import static com.swm.cucumberselenium.constants.Application.*;

public class Users {

    public static User createValidUser() {
        User user = new User();
        user.withUserName(VALID_USERNAME).withPassword(VALID_PASSWORD);
        return user;
    }

    public static User createInvalidUsernameUser() {
        User user = new User();
        user.withUserName(INVALID_USERNAME).withPassword(VALID_PASSWORD);
        return user;
    }

    public static User createInvalidPasswordUser() {
        User user = new User();
        user.withUserName(VALID_USERNAME).withPassword(INVALID_PASSWORD);
        return user;
    }

}

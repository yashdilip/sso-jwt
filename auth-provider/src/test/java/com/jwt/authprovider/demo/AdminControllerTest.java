package com.jwt.authprovider.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdminControllerTest {
    AdminController adminController = new AdminController();

    @Test
    void testGet() {
        String result = adminController.get();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testPost() {
        String result = adminController.post();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testPut() {
        String result = adminController.put();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testDelete() {
        String result = adminController.delete();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme
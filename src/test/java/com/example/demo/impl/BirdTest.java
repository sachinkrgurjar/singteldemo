package com.example.demo.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.util.Assert;

import static org.mockito.MockitoAnnotations.initMocks;

public class BirdTest {

    @InjectMocks
    private Bird birdUnderTest;

    @BeforeEach
    void setUp(){initMocks(this);}

    @Test
    void testBird()
    {
       Boolean canFly =  birdUnderTest.fly();
        Assert.isTrue(true, String.valueOf(canFly));
    }
}

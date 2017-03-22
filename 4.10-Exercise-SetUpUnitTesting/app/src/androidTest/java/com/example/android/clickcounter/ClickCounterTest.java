package com.example.android.clickcounter;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ClickCounterTest {

    @Test
    public void testCounterHum(){
        ClickCounter clickCounter = new ClickCounter();
        clickCounter.increment();
        Assert.assertEquals(1, clickCounter.getCount());
    }
}

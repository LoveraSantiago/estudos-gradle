package com.udacity.gradle.test;

import com.udacity.gradle.Person;
import org.junit.Test;

public class PersonTest {
    @Test
    public void test() {
        Person person = new Person("Jeremy");
        assert person.getName().equals("Jeremy");
    }

     @Test
    public void test2() {
        Person person = new Person("Santuga");
        assert person.getName().equals("Jeremy");
    }

     @Test
    public void test3() {
        Person person = new Person("");
        assert person.getName().equals("");
    }
}

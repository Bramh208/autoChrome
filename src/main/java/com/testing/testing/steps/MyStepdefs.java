package com.testing.testing.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java8.En;

public class MyStepdefs implements En {
    public MyStepdefs() {
        When("^someone login onto page$", () -> {

            System.out.println("Test is in progress: Living Life");


        });

    }
}

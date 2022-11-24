package com.co.bootcamp.stepsdefinitions;

import com.co.bootcamp.tasks.WebFormTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class WebFormStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Andres");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^He user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://bonigarcia.dev/selenium-webdriver-java/web-form.html"));
    }

    @When("^He user enter data$")
    public void heUserEnterData() {
        OnStage.theActorInTheSpotlight().attemptsTo(WebFormTask.enter());

    }

    @Then("^he could see the form submitted$")
    public void heCouldSeeTheFormSubmitted() {

    }

}

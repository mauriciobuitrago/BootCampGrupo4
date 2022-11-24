package com.co.bootcamp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/webform.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.bootcamp.stepsdefinitions"
        )
public class WebFormRunner {
}


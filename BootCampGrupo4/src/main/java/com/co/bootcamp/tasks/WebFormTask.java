package com.co.bootcamp.tasks;

import com.co.bootcamp.userinterfaces.WebFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class WebFormTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("Andres Navarro").into(WebFormPage.TXT_ENTRADA));
        actor.attemptsTo(Enter.theValue("12345").into(WebFormPage.TXT_CLAVE));
        actor.attemptsTo(Click.on(WebFormPage.BTN_SEND));

    }

    public static WebFormTask enter()
    {
        return Tasks.instrumented(WebFormTask.class);
    }
}

package com.co.bootcamp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class WebFormPage {
    public static final Target TXT_ENTRADA = Target.the("ingresa el campo Entrada de texto").locatedBy("//input[@type='text']");
    public static final Target TXT_CLAVE = Target.the("ingresa el campo Clave").locatedBy("//input[@type='password']");
    public static final Target BTN_SEND = Target.the("Click en el boton submit").locatedBy("//*[text()='Submit']");

}

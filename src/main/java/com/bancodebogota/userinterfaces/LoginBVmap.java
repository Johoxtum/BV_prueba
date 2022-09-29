package com.bancodebogota.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;


public class LoginBVmap {

    public static final Target USERNAME = Target.the("Ingresa usuario")
            .located(ByShadow.cssSelector("#bdb-at-input", "#identificationNumber"));
    public static final Target PASSWORD = Target.the("Ingresar contraseña")
            .located(ByShadow.cssSelector("#bdb-at-input", "#secure"));
    public static final Target BTN_INGRESAR = Target.the("Boton para ingresar")
            .located(ByShadow.cssSelector("button[type='submit']"));
    public static final Target TOKEN = Target.the("Primer numero del token")
            .located(ByShadow.cssSelector("#input_0", "auth-bdb-ml-bm-token[class='hydrated']", "auth-bdb-at-input-token[class='hydrated']"));
    public static final Target TOKEN1 = Target.the("Segundo numero del token")
            .located(ByShadow.cssSelector("#input_1", "auth-bdb-ml-bm-token[class='hydrated']", "auth-bdb-at-input-token[class='hydrated']"));
    public static final Target TOKEN2 = Target.the("Tercer numero del token")
            .located(ByShadow.cssSelector("#input_2", "auth-bdb-ml-bm-token[class='hydrated']", "auth-bdb-at-input-token[class='hydrated']"));
    public static final Target TOKEN3 = Target.the("Cuarto numero del token")
            .located(ByShadow.cssSelector("#input_3", "auth-bdb-ml-bm-token[class='hydrated']", "auth-bdb-at-input-token[class='hydrated']"));
    public static final Target TOKEN4 = Target.the("Quinto numero del token")
            .located(ByShadow.cssSelector("#input_4", "auth-bdb-ml-bm-token[class='hydrated']", "auth-bdb-at-input-token[class='hydrated']"));
    public static final Target TOKEN5 = Target.the("Sexto numero del token")
            .located(ByShadow.cssSelector("#input_5", "auth-bdb-ml-bm-token[class='hydrated']", "auth-bdb-at-input-token[class='hydrated']"));
    public static final Target VERIFICAR = Target.the("Boton verificacion identidad")
            .located(ByShadow.cssSelector(".bdb-at-btn.bdb-at-btn--primary.bdb-at-btn--lg", "auth-bdb-ml-bm-token[class='hydrated']"));
    public static final Target NVERIFICAR = Target.the("Boton verificacion identidad1")
            .located(ByShadow.cssSelector("#notification-modal-button-0", "#notification-modal-overlay > auth-bdb-ml-modal"));
    public static final Target TUSPRODUCTOS = Target.the("Texto para comparar")
            .located(By.id("bsh-title"));
    public static final Target IFRAME = Target.the("Texto para comparar")
            .located(By.xpath("//iframe[@class='legacy-app-iframe']"));
}

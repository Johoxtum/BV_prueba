package com.bancodebogota.interactions;

import com.bancodebogota.tasks.TareaLoginBV;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.Map;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class PruebaSelenium implements Interaction {

    static final String VALIDATE_YOUR_PRODUCTS = "Tus productosahsjhj";

    @FindBy(id = "bsh-title")
    WebElementFacade lblYourProducts;

    @FindBy(xpath = "//iframe[@class='legacy-app-iframe']")
    WebElementFacade iFrame;


    @Override
    public <T extends Actor> void performAs(T actor) {

        getDriver().switchTo().frame(iFrame);
        assertThat(VALIDATE_YOUR_PRODUCTS, is(equalTo(lblYourProducts.getText())));
    }

    public static PruebaSelenium validar() {

        return instrumented(PruebaSelenium.class);
    }
}

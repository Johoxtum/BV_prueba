package com.bancodebogota.questions;

import com.bancodebogota.interactions.IFrame;
import com.bancodebogota.userinterfaces.LoginBVmap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.bancodebogota.userinterfaces.LoginBVmap.*;


public class DashboardBV implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {

        return BrowseTheWeb.as(actor).find(TUSPRODUCTOS).getText();

    }

    public static DashboardBV comparar() {

        return new DashboardBV();
    }
}

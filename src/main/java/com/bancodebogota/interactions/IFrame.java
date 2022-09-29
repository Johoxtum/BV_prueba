package com.bancodebogota.interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;


public class IFrame implements Interaction {

    private Target iFrame;

    public IFrame(Target iFrame) {
        this.iFrame = iFrame;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        iframe(iFrame,actor);
    }

    public void iframe(Target iFrame, Actor actor) {

        WebElement recorrerIframe = iFrame.resolveFor(actor);

        Switch.toFrame(recorrerIframe);


    }

    public static IFrame recorrer(Target iFrame) {

        return new IFrame(iFrame);
    }
}
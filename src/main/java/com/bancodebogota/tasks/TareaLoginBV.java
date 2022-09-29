package com.bancodebogota.tasks;


import com.bancodebogota.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import java.util.Map;

import static com.bancodebogota.userinterfaces.LoginBVmap.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class TareaLoginBV implements Task {

    private final Map<String, String> datos;


    public TareaLoginBV(Map<String, String> datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.keyValues(datos.get("username")).into(USERNAME),
                Enter.keyValues(datos.get("password")).into(PASSWORD),
                Click.on(BTN_INGRESAR),
                Enter.keyValues("8").into(TOKEN),
                Enter.keyValues("0").into(TOKEN1),
                Enter.keyValues("1").into(TOKEN2),
                Enter.keyValues("0").into(TOKEN3),
                Enter.keyValues("8").into(TOKEN4),
                Enter.keyValues("4").into(TOKEN5),
                Click.on(VERIFICAR),
                WaitElement.untilAppears(NVERIFICAR).then(Click.on(NVERIFICAR)),
                Switch.toFrame(0)


        );


    }

    public static TareaLoginBV informacion(Map<String, String> datos) {
        return instrumented(TareaLoginBV.class, datos);
    }
}

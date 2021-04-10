package choucair.automatizacion.reto.tasks;

import choucair.automatizacion.reto.userinterface.RegisterUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {
    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterUtest.REGISTER_BUTTON),
                Enter.theValue("enter name").into(RegisterUtest.INPUT_FIRST_NAME),
                Enter.theValue("enter last name").into(RegisterUtest.INPUT_LAST_NAME),
                Enter.theValue("enter email address").into(RegisterUtest.INPUT_EMAIL),
                SelectFromOptions.byValue("select birth month").from(RegisterUtest.SELECT_BIRTH_MONTH),
                        SelectFromOptions.byValue("select day of birth").from(RegisterUtest.SELECT_BIRTH_DAY),
                        SelectFromOptions.byValue("select year of birth").from(RegisterUtest.SELECT_BIRTH_YEAR),
                        SelectFromOptions.byValue("select birth month").from(RegisterUtest.INPUT_LANGUAGE),
                Click.on(RegisterUtest.NEXT_BUTTON)

        );

    }
}

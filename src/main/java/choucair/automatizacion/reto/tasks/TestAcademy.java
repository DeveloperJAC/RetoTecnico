package choucair.automatizacion.reto.tasks;

import choucair.automatizacion.reto.userinterface.RegisterUtest;
import choucair.automatizacion.reto.userinterface.TestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class TestAcademy implements Task {
    private String course;

    public TestAcademy(String course) {
        this.course = course;
    }


    public static TestAcademy the(String course) {
        return Tasks.instrumented(TestAcademy.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TestPage.LINK_AREA),
                Click.on(TestPage.INPUT_COURSE),
                Click.on(TestPage.SELECT_COURSE)


        );

    }
}

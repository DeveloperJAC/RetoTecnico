package choucair.automatizacion.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterUtest extends PageUtest{
    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to register")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final  Target INPUT_FIRST_NAME = Target.the("where we enter the name")
            .located(By.name("firsName"));
    public static final Target INPUT_LAST_NAME = Target.the("where we enter the last name")
            .located(By.name("lastName"));
    public static final Target INPUT_EMAIL = Target.the("we must enter the email")
            .located(By.id("email"));
    public static final Target SELECT_BIRTH_MONTH = Target.the("must select birth month")
            .located(By.id("birthMonth"));
    public static final Target SELECT_BIRTH_DAY = Target.the("you must select day of birth")
            .located(By.id("birthDay"));
    public static final Target SELECT_BIRTH_YEAR = Target.the("must select year of birth")
            .located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGE = Target.the("select spoken language")
            .located(By.id("languages"));
    public static final Target NEXT_BUTTON = Target.the("click for the next location")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a/span"));



}

package choucair.automatizacion.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TestPage extends PageUtest{
    public static final Target LINK_AREA = Target.the("select the Academy link")
            .located(By.xpath("/html/body/ui-view/nav-sidebar/div/nav/div[3]/nav-sidebar-item[2]/div/a/div[2]"));
    public static final Target INPUT_COURSE = Target.the("Find the course you want and hit enter")
            .located(By.id("searchInput"));
    public static final Target SELECT_COURSE = Target.the("click to search the course")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div/div[1]/course-track-card/div/div[4]/a"));




}

package co.com.banitsmo.automationtest.task;

import co.com.banitsmo.automationtest.interaction.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static co.com.banitsmo.automationtest.userinterface.Facta.UNIFIED_SELF_CERTIFICATION;



public class Facta implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Wait.theSeconds(3),Click.on(UNIFIED_SELF_CERTIFICATION),
                Wait.theSeconds(2));
        for (String winHandle : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(winHandle);
            actor.remember("Url",BrowseTheWeb.as(actor).getDriver().getCurrentUrl());
            String urlPdf =   actor.recall("Url");
            //String urlPdf = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
        }

    }
    public static Facta facta(){
        return new Facta();
    }
}

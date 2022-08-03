package co.com.banitsmo.automationtest.task;

import co.com.banitsmo.automationtest.interaction.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.banitsmo.automationtest.userinterface.Legal.DISCOVER_MORE_FACTA;

public class Legal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Wait.theSeconds(3),Click.on(DISCOVER_MORE_FACTA));
    }

    public static Legal legal(){
        return new Legal();
    }
}

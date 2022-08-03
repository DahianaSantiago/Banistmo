package co.com.banitsmo.automationtest.task;

import co.com.banitsmo.automationtest.interaction.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.banitsmo.automationtest.userinterface.LearningIsEasy.DISCOVER_MORE_LEGAL;

public class DiscoverMore implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Wait.theSeconds(3),
                Click.on(DISCOVER_MORE_LEGAL));
    }

    public static DiscoverMore discoverMore(){
        return new  DiscoverMore();
    }
}

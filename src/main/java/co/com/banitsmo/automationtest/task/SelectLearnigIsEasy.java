package co.com.banitsmo.automationtest.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.banitsmo.automationtest.userinterface.HomePage.LEARNIGISEASY;

public class SelectLearnigIsEasy implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LEARNIGISEASY));

    }

    public static SelectLearnigIsEasy selectLearnigIsEasy(){
        return new SelectLearnigIsEasy();
    }
}

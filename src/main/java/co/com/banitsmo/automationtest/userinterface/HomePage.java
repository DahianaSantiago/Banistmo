package co.com.banitsmo.automationtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target LEARNIGISEASY = Target.the("Text")
            .locatedBy("/html/body/div[2]/div[2]/div[1]/div[2]/div[6]/section/div[3]/footer/div[2]/div/div/div[2]/div/ul/li[7]/a");
}

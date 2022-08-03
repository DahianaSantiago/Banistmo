package co.com.banitsmo.automationtest.question;

import co.com.banitsmo.automationtest.userinterface.Facta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.xpath.operations.Bool;

import static co.com.banitsmo.automationtest.userinterface.Facta.NAME_PDF;

public class Validation implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return actor.recall("Url").equals("https://www.banistmo.com/wps/wcm/connect/www.banistmo.com11237/ad2e205d-52e5-477f-8eaa-26fc66d73509/PJ+Autocertificacion+unificado-+Fatca+y+CRS.pdf?MOD=AJPERES&CVID=mCx33X-");
       // return NAME_PDF.resolveFor(actor).getTextContent().contains("PJ+Autocertificacion+unificado-+Fatca+y+CRS.pdf");
    }
    public static Question<Boolean> Validation(){
        return new Validation();
    }
}

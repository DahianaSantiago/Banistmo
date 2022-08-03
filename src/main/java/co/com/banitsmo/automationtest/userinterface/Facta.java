package co.com.banitsmo.automationtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Facta {
    public static final Target UNIFIED_SELF_CERTIFICATION = Target.the("Unified self-certification pdf")
            .locatedBy("body.toolbar-closed:nth-child(2) div.wpthemeLayoutContainers.wpthemeLayoutContainersHidden:nth-child(2) div.wpthemeInner div.component-control.id-Z7_8252I1C0M0O260A72B17TR28M1:nth-child(2) section.ibmPortalControl.wpthemeControl.wpthemeHidden.a11yRegionTarget:nth-child(2) div.wpthemeControlBody.wpthemeOverflowAuto.wpthemeClear div.container-fluid.none:nth-child(2) div.row div.col-xs-12 div.tabs-verticales.container-fluid.tabs-horizontal div.row div.tab-content.responsive.col-sm-9.hidden-xs.hidden-sm div.tab-pane.active:nth-child(1) table.table-responsive:nth-child(8) tr:nth-child(3) td:nth-child(2) span.bt-content a:nth-child(1) > img:nth-child(1)");

    public static final Target NAME_PDF = Target.the("Name of pdf")
            .locatedBy("//*[text()='PJ+Autocertificacion+unificado-+Fatca+y+CRS.pdf']");

}

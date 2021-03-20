package proyecto7.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import proyecto7.userinterface.RegisterPage;

public class RegisterForm implements Task {
    private String strName;
    private String strLastName;
    private String strAddress;
    private String strEmail;
    private String strPhone;
    private String strGander;
    private String strHobbie;
    private String strLanguages;
    public RegisterForm(String strName,String strLastName,String strAddress,String strEmail,String strPhone,String strGander,String strHobbie,String strLanguages) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strAddress = strAddress;
        this.strEmail = strEmail;
        this.strPhone = strPhone;
        this.strGander = strGander;
        this.strHobbie = strHobbie;
        this.strLanguages = strLanguages;
    }

    public static RegisterForm the(String strName, String strLastName, String strAddress, String strEmail, String strPhone,String strGander,String strHobbie,String strLanguages) {
        return Tasks.instrumented(RegisterForm.class, strName,strLastName,strAddress,strEmail,strPhone,strGander,strHobbie,strLanguages);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strName).into(RegisterPage.NAME),
                Enter.theValue(strLastName).into(RegisterPage.LAST_NAME),
                Enter.theValue(strAddress).into(RegisterPage.ADDRESS),
                Enter.theValue(strEmail).into(RegisterPage.EMAIL),
                Enter.theValue(strPhone).into(RegisterPage.PHONE),
                Click.on("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@value='"+strGander+"']"),
                //$x("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@value='Cricket']")
                Click.on("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@value='"+strHobbie+"']"),
                //$x("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")
                Click.on("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"),
                Click.on("//a[contains(text(),'"+strLanguages+"')]")
                //$x("//a[contains(text(),'Arabic')]")

        );
    }
}

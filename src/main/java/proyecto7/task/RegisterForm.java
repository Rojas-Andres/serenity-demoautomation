package proyecto7.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
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
    private String strSkill;
    private String strCountry;
    private String strSelectCountry;
    private String strYear;
    private String strMonth;
    private String strDay;
    public RegisterForm(String strName,String strLastName,String strAddress,String strEmail,String strPhone,String strGander,String strHobbie,String strLanguages, String strSkill,String strCountry,String strSelectCountry, String strYear,String strMonth ,String strDay) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strAddress = strAddress;
        this.strEmail = strEmail;
        this.strPhone = strPhone;
        this.strGander = strGander;
        this.strHobbie = strHobbie;
        this.strLanguages = strLanguages;
        this.strSkill = strSkill;
        this.strCountry = strCountry;
        this.strSelectCountry=strSelectCountry;
        this.strYear = strYear;
        this.strMonth= strMonth;
        this.strDay = strDay;
    }

    public static RegisterForm the(String strName, String strLastName, String strAddress, String strEmail, String strPhone,String strGander,String strHobbie,String strLanguages,String strSkill,String strCountry,String strSelectCountry,String strYear,String strMonth ,String strDay) {
        return Tasks.instrumented(RegisterForm.class, strName,strLastName,strAddress,strEmail,strPhone,strGander,strHobbie,strLanguages,strSkill,strCountry,strSelectCountry,strYear,strMonth,strDay);
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
                Click.on("//a[contains(text(),'"+strLanguages+"')]"),
                //$x("//a[contains(text(),'Arabic')]")
                SelectFromOptions.byValue(strSkill).from(RegisterPage.SKILL),
                SelectFromOptions.byValue(strCountry).from(RegisterPage.COUNTRIES),
                Click.on("//span[@class='select2-selection select2-selection--single']"),
                //$x("//input[@class='select2-search__field']")
                Enter.theValue(strSelectCountry).into("//input[@class='select2-search__field']"),
                Hit.the(Keys.DOWN).into("//input[@class='select2-search__field']"),
                Hit.the(Keys.ENTER).into("//input[@class='select2-search__field']"),
                //$x("//select[@id='yearbox']")
                SelectFromOptions.byValue(strYear).from(RegisterPage.YEAR),
                SelectFromOptions.byValue(strMonth).from(RegisterPage.MONTH),
                SelectFromOptions.byValue(strDay).from(RegisterPage.DAY)




        );
    }
}

package proyecto7.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class RegisterPage {
    //$x("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='FirstName']")
    public static final Target NAME = Target.the("Nombre").located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='FirstName']"));
    //$x("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='LastName']")
    public static final Target LAST_NAME = Target.the("Apellido").located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='LastName']"));
    //$x("//div[@class='col-md-8 col-xs-8 col-sm-8']//textarea[@ng-model='Adress']")
    public static final Target ADDRESS = Target.the("DIRECCION").located(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']//textarea[@ng-model='Adress']"));
    //$x("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='EmailAdress']")
    public static final Target EMAIL = Target.the("CORREO").located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='EmailAdress']"));
    //$x("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='Phone']")
    public static final Target PHONE = Target.the("CORREO").located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='Phone']"));
    //$x("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@value='Male']")
    public static final Target GENDER = Target.the("Sexo").located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='Phone']"));

    //$x("//select[@id='Skills']")
    public static final Target SKILL = Target.the("Habilidad").located(By.xpath(("//select[@id='Skills']")));
    //$x("//select[@id='countries']")
    public static final Target COUNTRIES = Target.the("Pais").located(By.xpath(("//select[@id='countries']")));
    public static final Target YEAR = Target.the("Año de nacimiento").located(By.xpath(("//select[@id='yearbox']")));
    //$x("//select[@ng-model='monthbox']")
    public static final Target MONTH = Target.the("Mes de nacimiento").located(By.xpath(("//select[@ng-model='monthbox']")));
    //$x("//select[@id='daybox']")
    public static final Target DAY = Target.the("Dia de nacimiento").located(By.xpath(("//select[@id='daybox']")));

    //$x("//input[@id='firstpassword']")
    public static final Target FIRSTPASSWORD = Target.the("Primera Contraseña").located(By.xpath(("//input[@id='firstpassword']")));

    //$x("//input[@id='secondpassword']")
    public static final Target SECONDPASSWORD = Target.the("Segunda Contraseña").located(By.xpath(("//input[@id='secondpassword']")));
    //$x("//button[@id='submitbtn']")
    public static final Target SUBMIT = Target.the("Click en enviar").located(By.xpath(("//button[@id='submitbtn']")));
    //$x("//a[contains(text(),'WebTable')]")
    public static final Target CLICK_WEB_TABLE = Target.the("Click en WEBTABLE").located(By.xpath(("//a[contains(text(),'WebTable')]")));
    //$x("//div[@id='dismiss-button']")
    //public static final Target QUIT = Target.the("Quitar Publicidad").located(By.xpath(("//span[@class='ns-lzfq1-e-14']")));

    //$x("//h4[contains(text(),'- Double Click on Edit Icon to')]")

    public static final Target C_TEXT = Target.the("Question").located(By.xpath(("//h4[contains(text(),'- Double Click on Edit Icon to')]")));

}

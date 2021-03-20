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

}

package proyecto7.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class RegisterPage {
    //$x("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='FirstName']")
    public static final Target NAME = Target.the("Nombre").located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='FirstName']"));
    //$x("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='LastName']")
    public static final Target LAST_NAME = Target.the("Apellido").located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@ng-model='LastName']"));


}

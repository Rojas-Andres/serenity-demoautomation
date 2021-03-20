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

    public RegisterForm(String strName,String strLastName) {
        this.strName = strName;
        this.strLastName=strLastName;
    }

    public static RegisterForm the(String strName, String strLastName) {
        return Tasks.instrumented(RegisterForm.class, strName,strLastName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strName).into(RegisterPage.NAME),
                Enter.theValue(strLastName).into(RegisterPage.LAST_NAME)

        );
    }
}

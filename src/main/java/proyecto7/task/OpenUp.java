package proyecto7.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import proyecto7.userinterface.DemoPage;

public class OpenUp implements Task {
    private DemoPage demoPage;
    public static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }
    //Abrimos la pagina utest.com
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(demoPage));
    }

}

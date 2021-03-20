package proyecto7.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import proyecto7.task.RegisterForm;
import proyecto7.userinterface.RegisterPage;

public class Answer implements Question<Boolean> {
    private String strComponent;

    public Answer(String strComponent){
        this.strComponent = strComponent;
    }
    public static Answer toThe(String strComponent){
        return new Answer(strComponent);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        //String valor = Text.of(RegisterPage.C_TEXT).viewedBy(actor).asString();

        String component = Text.of(RegisterPage.C_TEXT).viewedBy(actor).asString();
        System.out.println("El componente como tal es "+component);
        if (strComponent.equals(component)){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }
}

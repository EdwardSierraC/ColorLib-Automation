package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static userinterfaces.LoginPage.*;

public class Login implements Task {
  private final List<Map<String, String>> userData;

  public Login(List<Map<String, String>> userData) {
    this.userData = userData;
  }

  public static Login withCredentials (List<Map<String, String>> userData) {
    return Tasks.instrumented(Login.class, userData);
  }


  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(INPUT_USER),
            Enter.theValue(userData.get(0).get("userLogin")).into(INPUT_USER),
            Click.on(INPUT_PASS),
            Enter.theValue(userData.get(0).get("passwordLogin")).into(INPUT_PASS),
            Click.on(BUTTON_SIGN)
    );
  }
}

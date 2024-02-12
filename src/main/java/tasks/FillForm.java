package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static userinterfaces.FormPage.*;

public class FillForm implements Task {
  private final List<Map<String, String>> userData;

  public FillForm(List<Map<String, String>> userData)
  {
    this.userData = userData;
  }

  public static FillForm withMyInformation (List<Map<String, String>> userData) {
    return Tasks.instrumented(FillForm.class, userData);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            WaitUntil.the(FORM_BUTTON, isCurrentlyVisible()).forNoMoreThan(20).seconds(),
            Click.on(FORM_BUTTON),
            Click.on(FORM_VALIDATION_BUTTON),
            WaitUntil.the(INPUT_REQUIRED, isCurrentlyVisible()),
            Click.on(INPUT_REQUIRED),
            Enter.theValue(userData.get(0).get("required")).into(INPUT_REQUIRED),
            Click.on(INPUT_EMAIL),
            Enter.theValue(userData.get(0).get("email")).into(INPUT_EMAIL),
            Click.on(INPUT_PASS),
            Enter.theValue(userData.get(0).get("password")).into(INPUT_PASS),
            Click.on(INPUT_C_PASS),
            Enter.theValue(userData.get(0).get("cpassword")).into(INPUT_C_PASS),
            //Click.on(INPUT_DATE),
            //Enter.theValue(userData.get(0).get("date")).into(INPUT_DATE),
            Click.on(INPUT_URL),
            Enter.theValue(userData.get(0).get("url")).into(INPUT_URL),
            Click.on(INPUT_DIGITS),
            Enter.theValue(userData.get(0).get("digits")).into(INPUT_DIGITS),
            Click.on(INPUT_RANGE),
            Enter.theValue(userData.get(0).get("range")).into(INPUT_C_PASS),
            Click.on(CHECKBOX_POLICY),
            Click.on(BUTTON_VALIDATE),
            Scroll.to(LBL_TITLE)
            );
  }
}

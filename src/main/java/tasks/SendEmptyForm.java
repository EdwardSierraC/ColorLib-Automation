package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static userinterfaces.FormPage.*;

public class SendEmptyForm implements Task {

  public static SendEmptyForm withData() {
    return Tasks.instrumented(SendEmptyForm.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            WaitUntil.the(FORM_BUTTON, isCurrentlyVisible()).forNoMoreThan(20).seconds(),
            Click.on(FORM_BUTTON),
            Click.on(FORM_VALIDATION_BUTTON),
            Click.on(BUTTON_VALIDATE),
            WaitUntil.the(MSG_REQUIRED, isCurrentlyVisible())
                    .forNoMoreThan(10).seconds()
    );
  }
}

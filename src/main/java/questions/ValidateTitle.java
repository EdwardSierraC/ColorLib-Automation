package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;

import static userinterfaces.FormPage.LBL_TITLE;

public class ValidateTitle implements Question<Boolean> {
  private String formValidation;

  public ValidateTitle (String formValidation) {
    this.formValidation = formValidation;
  }

  public static ValidateTitle onWeb (String formValidation) {

    return new ValidateTitle(formValidation);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean result;
    String title = LBL_TITLE.resolveFor(actor).getText();
    if (title.equals("Popup Validation")) {
      result = true;
    } else {
      result = false;
    }
    return result;
  }
}

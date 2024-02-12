package questions;

import com.beust.ah.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.FormPage.*;

public class validateRequiredMessages implements Question<Boolean> {
  private String validate;

  public validateRequiredMessages(String validate) {
    this.validate = validate;
  }

  public static validateRequiredMessages inForm(String validate) {

    return new validateRequiredMessages(validate);
  }

  @Override
  public Boolean answeredBy (Actor ACTOR) {
    boolean result;
    String required = MSG_REQUIRED.resolveFor(ACTOR).getText();
    String email = MSG_EMAIL.resolveFor(ACTOR).getText();
    String password = MSG_PASSWORD.resolveFor(ACTOR).getText();
    String c_password = MSG_C_PASSWORD.resolveFor(ACTOR).getText();
    String date = MSG_C_DATE.resolveFor(ACTOR).getText();
    String url = MSG_URL.resolveFor(ACTOR).getText();
    String digits = MSG_DIGITS.resolveFor(ACTOR).getText();
    String range = MSG_RANGE.resolveFor(ACTOR).getText();
    String agree = MSG_CHECKBOX.resolveFor(ACTOR).getText();

    if (required.equals("This field is required.")
        && email.equals("This field is required.")
        && password.equals("This field is required.")
        && c_password.equals("This field is required.")
        && date.equals("This field is required.")
        && url.equals("This field is required.")
        && digits.equals("This field is required.")
        && range.equals("This field is required.")
        && agree.equals("This field is required.")) {
      result = true;
    } else {
      result = false;
    }
    return result;
  }
}

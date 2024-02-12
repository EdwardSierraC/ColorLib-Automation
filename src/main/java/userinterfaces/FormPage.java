package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
  public static final Target FORM_BUTTON = Target.the("BUTTON FORMS")
          .located(By.xpath("//span[contains(.,'Forms')]"));
  public static final Target FORM_VALIDATION_BUTTON = Target.the("BUTTON FORM VALIDARION")
          .located(By.xpath("//a[contains(.,'Form Validation')]"));
  public static final Target INPUT_REQUIRED = Target.the("INPUT REQUIRED")
          .located(By.id("required2"));
  public static final Target INPUT_EMAIL = Target.the("INPUT EMAIL")
          .located(By.id("email2"));
  public static final Target INPUT_PASS = Target.the("INPUT PASS")
          .located(By.id("password2"));
  public static final Target INPUT_C_PASS = Target.the("INPUT CONFIRM PASS")
          .located(By.id("confirm_password2"));
  public static final Target INPUT_DATE = Target.the("INPUT DATE")
          .located(By.id("date2"));
  public static final Target INPUT_URL = Target.the("INPUT URL")
          .located(By.id("url2"));
  public static final Target INPUT_DIGITS = Target.the("INPUT DIGITS")
          .located(By.id("digits"));
  public static final Target INPUT_RANGE = Target.the("INPUT RANGE")
          .located(By.id("range"));
  public static final Target CHECKBOX_POLICY = Target.the("CHECKBOX POLICY")
          .located(By.id("range"));
  public static final Target BUTTON_VALIDATE = Target.the("BUTTON VALIDATE")
          .located(By.xpath("(//input[@value='Validate'])[2]"));
  public static final Target LBL_TITLE = Target.the("LBL TITLE")
          .located(By.xpath("//h5[contains(.,'Popup Validation')]"));
  public static final Target MSG_REQUIRED = Target.the("MSG REQUIRED")
          .located(By.id("required2-error"));
  public static final Target MSG_EMAIL = Target.the("MSG EMAIL")
          .located(By.id("email2-error"));
  public static final Target MSG_PASSWORD = Target.the("MSG PASSWORD")
          .located(By.id("password2-error"));
  public static final Target MSG_C_PASSWORD = Target.the("MSG CONFIRM PASSWORD")
          .located(By.id("confirm_password2-error"));
  public static final Target MSG_C_DATE = Target.the("MSG DATE")
          .located(By.id("date2-error"));
  public static final Target MSG_URL = Target.the("MSG URL")
          .located(By.id("url2-error"));
  public static final Target MSG_DIGITS = Target.the("MSG DIGITS")
          .located(By.id("digits-error"));
  public static final Target MSG_RANGE = Target.the("MSG RANGE")
          .located(By.id("range-error"));
  public static final Target MSG_CHECKBOX = Target.the("MSG RANGE")
          .located(By.id("agree2-error"));
}

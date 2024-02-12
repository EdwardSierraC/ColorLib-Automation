package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
  public static final Target INPUT_USER = Target.the("USER")
          .located(By.xpath("//input[@placeholder='Username']"));
  public static final Target INPUT_PASS = Target.the("PASS")
          .located(By.xpath("//input[@placeholder='Password']"));
  public static final Target BUTTON_SIGN = Target.the("BUTTON SIGN IN")
          .located(By.xpath("//button[@type='submit'][contains(.,'Sign in')]"));
}

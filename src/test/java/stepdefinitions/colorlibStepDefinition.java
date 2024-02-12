package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Constantes;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidateTitle;
import questions.validateRequiredMessages;
import tasks.FillForm;
import tasks.Login;
import tasks.SendEmptyForm;

import java.util.List;
import java.util.Map;

public class colorlibStepDefinition {
  @Before
  public void setStage()
  {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("I am on colorlibwebsite")
  public void i_am_on_colorlibwebsite() {
    OnStage.theActorCalled(Constantes.ACTOR)
            .wasAbleTo(Open.url(Constantes.URL));
  }
  @When("I login with my credentials and fill the form")
  public void i_login_with_my_credentials_and_fill_the_form(DataTable table) {
    List<Map<String, String>> userData = table.asMaps();
    OnStage.theActorInTheSpotlight().attemptsTo(
            Login.withCredentials(userData),
            FillForm.withMyInformation(userData)
    );
  }
  @Then("^I should see the title (.*)")
  public void i_should_see_the_field_required_empty(String msg) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
            ValidateTitle.onWeb(msg)
    ));
  }

  // TA VALIDATE ALL FIELDS ARE REQUIRED

  @When("I login with my credentials and send the empty form")
  public void i_login_with_my_credentials_and_send_the_empty_form(DataTable table) {
    List<Map<String, String>> userData = table.asMaps();
    OnStage.theActorInTheSpotlight().attemptsTo(
            Login.withCredentials(userData),
            SendEmptyForm.withData()
    );

  }
  @Then("^I should see the message (.*)")
  public void i_should_see_the_message_this_field_is_required(String msg) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
            validateRequiredMessages.inForm(msg)
    ));

  }
}

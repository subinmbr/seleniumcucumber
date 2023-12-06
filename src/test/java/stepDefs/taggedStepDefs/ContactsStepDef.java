package stepDefs.taggedStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ContactsStepDef {
	


@Given("user  logged in")
public void user_logged_in() {
  System.out.println("user logged in");
}
@When("delete contacts")
public void delete_contacts() {
	 System.out.println("delete contact");
}	

}

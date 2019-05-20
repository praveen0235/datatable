package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SDefinition {
	
	
	@Given("^navigate to the URL$")
	public void navigate_to_the_URL() throws Throwable {
		Base.setup();
	}
	
	//Elements obj = new Elements();

	@Then("^find the number of rows$")
	public String find_the_number_of_rows() throws Throwable {
		String data = Elements.table.getText();
		return data;
	}

	@Then("^print it on console$")
	public void print_it_on_console() throws Throwable {
		System.out.println(find_the_number_of_rows());
	}
	
}

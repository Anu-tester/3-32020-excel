package stepDefinitions;

import java.util.List;
import java.util.Map;

import com.qa.data.excel.ExcelReader;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCases {
	@Given("^scenario data$")
	public void scenario_data() throws Throwable {
		System.out.println("Scenario Have Some Data");

	}

	@When("^executed from Runner Class$")
	public void executed_from_Runner_Class() throws Throwable {
		System.out.println("Executed From Runner Class");

	}

	@Then("^UserName and Password shows on console form given (\\d+)\\.$")
	public void username_and_Password_shows_on_console_form_given(int RowsNumber) throws Throwable {
		ExcelReader reader = new ExcelReader(
				"C:\\Users\\Anu\\projects3_1\\exceldata\\excel\\src\\main\\java\\com\\qa\\data\\excel\\TestData.xlsx");
		String testData = reader.getCellData("Sheet1", 0, 2);
		String sheetName = "Sheet1";

		int rowCount = reader.getRowCount(sheetName);

		for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
			String loginId = reader.getCellData(sheetName, "FirstName", rowNum);
			String passsword = reader.getCellData(sheetName, "LastName", rowNum);

			System.out.println(loginId + " " + passsword);
		}

	}
}

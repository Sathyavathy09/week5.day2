package week5.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends Base {
	
	@Test (dataProvider = "sendData")
	public void createLead( String company, String fname, String lName, String phNo){
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		
}	
	
	@DataProvider
	public String[][] sendData() throws IOException
	{
		ExcelDemo ex = new ExcelDemo();
		String[][] getData = ex.readData("CreateLead");
		return getData;

	}
	
}







   package testCase;


	import java.io.IOException;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

    import io.github.bonigarcia.wdm.WebDriverManager;
import testNg.ReadExcel;

	public class CreateLead extends BaseClass {
		@BeforeTest
		public void setExcelfile() {
			filename="Createlead";
		}
      @Test(dataProvider="fetchValues")
		public void runCreateLead(String cName,String fName,String lName,String phno) {
			
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
			driver.findElement(By.name("submitButton")).click();
		
	}
      
	}
	/*
	 * String[][] values =new String[2][4];
	 * 
	 * values[0][0]="TestLeaf"; values[0][1]="Indhu"; values[0][2]="kamal";
	 * values[0][3]="909";
	 * 
	 * values[1][0]="TestLeaf"; values[1][1]="Kamal"; values[1][2]="Indhu";
	 * values[1][3]="909";
	 */





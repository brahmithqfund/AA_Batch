package pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/*import Test.CO_ILP.Need;
import Test.CO_ILP.scenario;*/
import pack.*;

import bsh.*;
//import scala.collection.Iterator;
//import scala.collection.Set;

//import Pages.HomePage;
//import Pages.LoginPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileWriter;

import java.io.IOException;
import java.io.FileReader;

public class Inst_Payoff extends AA_TLP{
	public static void Inst_Payoff (String SSN,String FileName) throws Exception{		
		//----------------------done updating

				//Excel TestData = new Excel(System.getProperty("user.dir")+"/TestData/TLP_Production/"+FileName);
				int lastrow=TestData.getLastRow("NewLoan");
				String sheetName="NewLoan";
				for(int row=2;row<=lastrow;row++)
				{
					String RegSSN = TestData.getCellData(sheetName,"SSN",row);
					if(SSN.equals(RegSSN))
					{
						String TxnType=TestData.getCellData(sheetName,"TxnType",row);
						String TenderType = TestData.getCellData(sheetName,"TenderType",row);
						String ProductID=TestData.getCellData(sheetName,"ProductID",row);
						String Password = TestData.getCellData(sheetName,"Password",row);
						String ESign_DisbType = TestData.getCellData(sheetName,"ESign_DisbType",row);
						String ESign_DisbType2 = TestData.getCellData(sheetName,"ESign_DisbType1",row);
						//String UserName = TestData.getCellData(sheetName,"UserName",row);
						//String StoreID = TestData.getCellData(sheetName,"StoreID",row);
						String SSN1 = SSN.substring(0, 3);
						String SSN2 = SSN.substring(3,5);
						String SSN3 = SSN.substring(5,9);
						Login.Login(UserName,Password,StoreId);
						driver.switchTo().defaultContent();
						WebDriverWait wait = new WebDriverWait(driver, 30);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("topFrame")));
						driver.switchTo().frame("topFrame");
						wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[id='910000']")));
						driver.findElement(By.cssSelector("li[id='910000']")).click();
						test.log(LogStatus.PASS, "Clicked on Loan Transactions");
						driver.switchTo().defaultContent();
						driver.switchTo().frame("mainFrame");
						driver.findElement(By.cssSelector("li[id='911101']")).click();
						test.log(LogStatus.PASS, "Clicked on Transactions");
						driver.switchTo().frame("main");
						driver.findElement(By.name("ssn1")).sendKeys(SSN1);
						test.log(LogStatus.PASS, "SSN1 is entered: "+SSN1);
						driver.findElement(By.name("ssn2")).sendKeys(SSN2);
						test.log(LogStatus.PASS, "SSN2 is entered: "+SSN2);
						driver.findElement(By.name("ssn3")).sendKeys(SSN3);
						test.log(LogStatus.PASS, "SSN3 is entered: "+SSN3);
						driver.findElement(By.name("submit1")).click();
						test.log(LogStatus.PASS, "Click on submit Button");
						for(String winHandle : driver.getWindowHandles()){
							driver.switchTo().window(winHandle);
						}
						driver.switchTo().defaultContent();
						driver.switchTo().frame("mainFrame");
						driver.switchTo().frame("main");
						driver.findElement(By.name("button")).click();
						test.log(LogStatus.PASS, "Click on GO Button");
						for(String winHandle : driver.getWindowHandles()){
							driver.switchTo().window(winHandle);
						}
						driver.switchTo().defaultContent();
						driver.switchTo().frame("mainFrame");
						driver.switchTo().frame("main");

						
						if(ProductID.equals("TLP"))
						{

							driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[7]/td[2]/table/tbody/tr/td/table/tbody/tr[4]/td[13]/input")).click();
						}

						
						test.log(LogStatus.PASS, "Click on GO Button");
						for( String winHandle1 : driver.getWindowHandles())
						{
							driver.switchTo().window(winHandle1);
						}
						driver.switchTo().defaultContent();
						driver.switchTo().frame("mainFrame");
						driver.switchTo().frame("main");
						driver.findElement(By.name("transactionList")).sendKeys("Payment");
						test.log(LogStatus.PASS, "Transaction Type is selected as Payment");
						
						if(ProductID.equals("TLP"))
						{

							driver.findElement(By.xpath("//*[@id='go_Button']")).click();
						}
						else
						{
							driver.findElement(By.id("go_Button")).click();
						}
						
						for( String winHandle1 : driver.getWindowHandles())
						{
							driver.switchTo().window(winHandle1);
						}
						driver.switchTo().defaultContent();
						driver.switchTo().frame("mainFrame");
						driver.switchTo().frame("main");
						
						

						for( String winHandle1 : driver.getWindowHandles())
						{
							driver.switchTo().window(winHandle1);
						}
						driver.switchTo().defaultContent();
						driver.switchTo().frame("mainFrame");
						driver.switchTo().frame("main");

						if(ProductID.equals("TLP"))
						{
							
							driver.findElement(By.xpath("//*[@id='PD3']")).click();
							test.log(LogStatus.PASS, " Click Pay Off the balance ");
							driver.findElement(By.name("requestBean.siilBean.tenderTypeFirst")).sendKeys("Cash");
							test.log(LogStatus.PASS, "tenderType  as Cash ");
							String Pmt= driver.findElement(By.name("requestBean.siilBean.payAmt")).getAttribute("value");

							driver.findElement(By.name("requestBean.siilBean.tenderAmtFirst")).sendKeys(Pmt);
							test.log(LogStatus.PASS, " Click pay any other amt Type ");
							
						}
						
						if(ProductID.equals("TLP"))
						{
							
							driver.findElement(By.name("requestBean.password")).sendKeys(Password);
							driver.findElement(By.name("finish")).click();
							test.log(LogStatus.PASS, "Password is selected as "+Password);
						} 

						{

							if(driver.findElement(By.name("Ok")).isDisplayed())

							{
								test.log(LogStatus.PASS, "Payoff Completed Successfully ");
								driver.findElement(By.name("Ok")).click();
							}
							else
							{
								test.log(LogStatus.FAIL, "Payoff is not Completed Successfully ");
							}

						}
					}
				}
			}		

}

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
import pack.Void;
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

public class AA_OH_ILP extends AA_ILP{

	

//Venkat scenarios
	
	@Test(priority = 0, groups = "venkat_OH_ILP")

	public void Login_Homescreen_Borrower_Registration_NewLoan_verify_() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Login_Homescreen_Borrower_Registration_NewLoan_verify_TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:01" + "_" + PayFrequency + "_" + CollateralType,
						"Login_ Home screen_ Borrower _Registration_New loan_verifyOrigination fee and MHC fee");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				// History.History(SSN, FileName, 0);

			}
		}

	}

	@Test(priority = 1, groups = "venkat_OH_ILP")

	public void Login_Homescreen_Borrower_Registration_NewLoan_Monthly() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Login_Homescreen_Borrower_Registration_NewLoan_Monthly_TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:02" + "_" + PayFrequency + "_" + CollateralType,
						"Login_ Home screen_ Borrower _Registration monthly income frequency_New loan");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				// History.History(SSN, FileName, 0);

			}
		}

	}

	@Test(priority = 42, groups = "venkat_OH_ILP") // 2

	public void Login_Homescreen_Borrower_Registration_NewLoan_SemiMonthly() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Login_Homescreen_Borrower_Registration_NewLoan_SemiMonthly_TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:03" + "_" + PayFrequency + "_" + CollateralType,
						"Login_ Home screen_ Borrower _Registration semimonthly income frequency_New loan");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				// History.History(SSN, FileName, 0);

			}
		}

	}

	@Test(priority = 3, groups = "venkat_OH_ILP")

	public void Login_Homescreen_Borrower_Registration_NewLoan_BiWeekly__() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Login_Homescreen_Borrower_Registration_NewLoan_BiWeekly__TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:04" + "_" + PayFrequency + "_" + CollateralType,
						"Login_ Home screen_ Borrower _Registration biweekly income frequency_New loan");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				// History.History(SSN, FileName, 0);

			}
		}

	}

	@Test(priority = 4, groups = "venkat_OH_ILP")

	public void Login_Homescreen_Borrower_Registration_NewLoan_Weekly_() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Login_Homescreen_Borrower_Registration_NewLoan_Weekly_TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:05" + "_" + PayFrequency + "_" + CollateralType,
						"Login_ Home screen_ Borrower _Registration weekly income frequency_New loan");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				// History.History(SSN, FileName, 0);

			}
		}

	}

	@Test(priority = 5, groups = "venkat_OH_ILP")

	public void Login_Homescreen_Borrower_Registration_NewLoan_ACH_() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Login_Homescreen_Borrower_Registration_NewLoan_ACH_TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:05" + "_" + PayFrequency + "_" + CollateralType,
						"Login_ Home screen_ Borrower _Registration weekly income frequency_New loan");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_OHILP_AccuralDate.NewLoan_OHILP_AccuralDate(SSN, FileName, "200");

			}
		}

	}

	@Test(priority = 6, groups = "venkat_OH_ILP")

	public void Login_Homescreen_Borrower_Registration_NewLoan_MultiDisb_() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Login_Homescreen_Borrower_Registration_NewLoan_MultiDisb_TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:07" + "_" + PayFrequency + "_" + CollateralType,
						"Login_ Home screen_ Borrower _Registration_select multiple disbursement types");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP_MultiDisb.NewLoan_ILP_MultiDisb(SSN, FileName, "200");
				// History.History(SSN, FileName, 0);

			}
		}

	}

	@Test(priority = 7, groups = "venkat_OH_ILP")

	public void CO_ILP_NewLoanVoid() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_COILP_NewLoan_Void_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";

		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);

			if (RunFlag.equals("Y")) {

				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);

				test = reports.startTest(Header + "_S.No:8" + "_" + PayFrequency + "_" + CollateralType,
						"Loan– same day Void");

				Assert.assertTrue(true);
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				Void.Void(SSN, FileName);
			}

		}
	}

	@Test(priority = 8, groups = "venkat_OH_ILP")

	public void loan_VoidEncryption() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_loan_VoidEncryption_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";

		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();

				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:9" + "_" + PayFrequency + "_" + CollateralType,
						"Loan – void on next day with encryption key");
				appUrl = AppURL;
				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore.AgeStore(SSN, FileName, 1);
				EncryptionKey_Void.EncryptionKey_Void(SSN, FileName);

			}
		}

	}

	@Test(priority = 9, groups = "venkat_OH_ILP")

	public void CO_ILP_NewLoanRescind() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_COILP_NewLoan_Rescind_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);

				test = reports.startTest(Header + "_S.No:10" + "_" + PayFrequency + "_" + CollateralType,
						"Loan– Rescind");

				Assert.assertTrue(true);
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				Rescind.Rescind(SSN, FileName);

			}

		}

	}

	@Test(priority = 10, groups = "venkat_OH_ILP")

	public void CO_ILP_MultipleDisbNewLoan_Void() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_COILP_MultipleDisb_Void_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);

			if (RunFlag.equals("Y"))

			{

				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);

				test = reports.startTest(Header + "_S.No:11" + "_" + PayFrequency + "_" + CollateralType,
						"Loan with multiple disbursement (cash& check)->void with cash");

				Assert.assertTrue(true);
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP_MultiDisb.NewLoan_ILP_MultiDisb(SSN, FileName, "200");
				Void.Void(SSN, FileName);
				/// History.History(SSN, FileName);
				// Drawerassign.Drawerassign(SSN, FileName);

			}

		}

	}

	@Test(priority = 12, groups = "venkat_OH_ILP") // Run scenario.scenario with
													// store date need to check
													// again for the date

	public void LonI_StoreDateafterRescindPeriod_Payment_selectpayanyotheramt_Pymtamtlessthan1stint() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_LonI_StoreDateafterRescindPeriod_Payment_selectpayanyotheramt_Pymtamtlessthan1stint_Txn_TestData.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				test = reports.startTest(Header + "_S.No:13" + "_" + PayFrequency + "_" + CollateralType,
						"Loan_age the store date to after rescind period_select payment option from CSR dropdown_Payment screen should show the follwing options  1.Pay Off the balance 2.Pay Installment Am t 3.Pay any other Amt>select pay any other amt_enter Payment amount less than 1# amount");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore.AgeStore(SSN, FileName, -6);
				Payment_LessthanAmount.Payment_LessthanAmount(SSN, FileName);
				// History.History1(SSN, FileName);

			}
		}

	}

	@Test(priority = 13, groups = "venkat_OH_ILP") // Run scenario.scenario with
													// store date need to check
													// again for the date

	public void LonI_RunEODbatchon1Instduedate_Payment_PayPastDue_NextInstallment() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_LonI_RunEODbatchon1Instduedate_Payment_PayPastDue_NextInstallment_Txn_TestData.xls";

		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				test = reports.startTest(Header + "_S.No:14" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>Run EOD batch process on 1# due date>Run again EOD batch process from 10th day of 1# due date>Payment(past due +installment amount");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 0,0);
				Customer_Status.Customer_Status(SSN, FileName);
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, 1, 2);
				Payment_Pastdue_NextInst.Payment_Pastdue_NextInst(SSN, FileName);
				// History.History1(SSN, FileName);
				Customer_Status.Customer_Status(SSN, FileName);

			}
		}

	}

	@Test(priority = 14, groups = "venkat_OH_ILP") // Run scenario.scenario with
													// store date need to check
													// again for the date

	public void LonI_RunEODbatchon1Instduedate_AgainEODbatchfrom10thdayof1stInstduedate_Payment_Pastdue_1stInstamt()
			throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_LonI_RunEODbatchon1Instduedate_AgainEODbatchfrom10thdayof1stInstduedate_Payment_Pastdue_Pymtamt_Txn_TestData.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				test = reports.startTest(Header + "_S.No:15" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>Run EOD batch process on 1# due date>Run again EOD batch process from 10th day of 1# due date>Payment(past due +installment amount");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 0,0);
				Customer_Status.Customer_Status(SSN, FileName);
				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 10,10);
				Payment_2ndEODbatchprocess.Payment_2ndEODbatchprocess(SSN, FileName);
				Customer_Status.Customer_Status(SSN, FileName);
				// Apportions_List.Apportions_List(SSN, FileName, 2);

			}
		}

	}

	@Test(priority = 15, groups = "venkat_OH_ILP") // Run scenario.scenario with
													// store date need to check
													// again for the date

	public void LonI_StoreDateafterRescindPeriod_Payment_selectpayanyotheramt_Pymtamtlessthan1stint_VoidPymt()
			throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_LonI_StoreDateafterRescindPeriod_Payment_selectpayanyotheramt_Pymtamtlessthan1stint_VoidPymt_Txn_TestData.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				test = reports.startTest(Header + "_S.No:16" + "_" + PayFrequency + "_" + CollateralType,
						"Loan_age the store date to after rescind period_select payment option from CSR dropdown_Payment screen should show the follwing options  1.Pay Off the balance 2.Pay Installment Am t 3.Pay any other Amt>select pay any other amt_enter Payment amount less than 1# amount");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore.AgeStore(SSN, FileName, -6);
				Payment_LessthanAmount.Payment_LessthanAmount(SSN, FileName);
				// Apportions_List.Apportions_List(SSN, FileName, row);
				Void_Payment.Void_Payment(SSN, FileName);
				// Void.Void(SSN, FileName);
				// Apportions_List.Apportions_List(SSN, FileName, row);

			}
		}

	}

	@Test(priority = 16, groups = "venkat_OH_ILP") // Dubilicate

	public void LonI_RunEODbatchon1Instduedate_Payment_PayPastDue_NextInstallment_VoidPymt() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_LonI_RunEODbatchon1Instduedate_Payment_PayPastDue_NextInstallment_VoidPymt_Txn_TestData.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				test = reports.startTest(Header + "_S.No:17" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>Run EOD batch process on 1# due date>Run again EOD batch process from 10th day of 1# due date>Payment(past due +installment amount");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 0,0);
				Customer_Status.Customer_Status(SSN, FileName);
				// Apportions_List.Apportions_List(SSN, FileName, 2);
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, 1, 2);
				Payment_Pastdue_NextInst.Payment_Pastdue_NextInst(SSN, FileName);
				// History.History1(SSN, FileName);
				Customer_Status.Customer_Status(SSN, FileName);
				Void_Payment.Void_Payment(SSN, FileName);
				// Apportions_List.Apportions_List(SSN, FileName, 2);
				Customer_Status.Customer_Status(SSN, FileName);

			}
		}

	}

	@Test(priority = 17, groups = "venkat_OH_ILP")

	public void LonI_RunEODbatchon1Instduedate_AgainEODbatchfrom10thdayof1stInstduedate_Payment_Pastdue_1stInstamt_Void()
			throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_LonI_RunEODbatchon1Instduedate_AgainEODbatchfrom10thdayof1stInstduedate_Payment_Pastdue_1stInstamt_Void_Txn_TestData.xls";

		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				test = reports.startTest(Header + "_S.No:18" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>Run EOD batch process on 1# due date>Run again EOD batch process from 10th day of 1# due date>Payment(past due +installement amount)>void payment on next day");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 0, 2);
				Customer_Status.Customer_Status(SSN, FileName);
				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 10, 2);
				Payment_2ndEODbatchprocess.Payment_2ndEODbatchprocess(SSN, FileName);
				Customer_Status.Customer_Status(SSN, FileName);
				// Apportions_List.Apportions_List(SSN, FileName, 2);
				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 12, 2);
				// Void_Payment.Void_Payment(SSN, FileName);
				Payment_EncryptionKey_Void.Payment_EncryptionKey_Void(SSN, FileName);

			}
		}

	}

	@Test(priority = 18, groups = "venkat_OH_ILP")

	public void Loan_Deposit_Rtn_paymentLessthanLoanAmount() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_Deposit_Rtn_paymentLessthanLoanAmount_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";

		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();

				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:19" + "_" + PayFrequency + "_" + CollateralType,
						"Loan_1# deposit_rtn_payment(less than 1# amount)");
				appUrl = AppURL;
				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore.AgeStore(SSN, FileName, -1);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				ACHReturnPosting.ACHReturnPosting(SSN, FileName);
				Payment_LessthanAmount.Payment_LessthanAmount(SSN, FileName);
				// History.History(SSN, FileName);
				Loan_Balance_Status.Loan_Balance_Status(SSN, FileName);
			}
		}

	}

	@Test(priority = 19, groups = "venkat_OH_ILP")

	public void Loan_Deposit_Rtn_paymentGreaterthanLoanAmount() throws Exception {

		// Start test. Mention test script name
		String FileName = "Loan_Deposit_Rtn_paymentGreaterthanLoanAmount.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";

		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();

				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:20" + "_" + PayFrequency + "_" + CollateralType,
						"Loan_1# deposit_rtn_payment(greaterthan 1# amount)");
				appUrl = AppURL;
				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore.AgeStore(SSN, FileName, -1);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				// inst.inst1_AgeStore(SSN, FileName, 8);
				ACHReturnPosting.ACHReturnPosting(SSN, FileName);
				inst1_AgeStore.inst1_AgeStore(SSN, FileName, 0);
				Payment_gaterthanAmount.Payment_gaterthanAmount(SSN, FileName);
				// History.History(SSN, FileName );
				Loan_Balance_Status.Loan_Balance_Status(SSN, FileName);
			}
		}

	}

	@Test(priority = 20, groups = "venkat_OH_ILP")

	public void Loan_Deposit_RTN_EODBatchon10days_PaymentGeterthanLoanAmount() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_Deposit_RTN_EODBatchon10days_PaymentGeterthanLoanAmount_Testdata.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:21" + "_" + PayFrequency + "_" + CollateralType,
						"Loan_1# deposit_rtn_Run EOB batch process from 10th day of due date_payment(greater  than 1# amount)");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);

				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");

				AgeStore_ILP.AgeStore_ILP(SSN, FileName, -1, 2);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);

				Loan_Balance_Status.Loan_Balance_Status(SSN, FileName);
				// AgeStore_ILP.AgeStore_ILP(SSN, FileName, 8, 2);
				ACHReturnPosting.ACHReturnPosting(SSN, FileName);

				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 10, 2);
				// Check_TransactionRecords.Check_TransactionRecords(SSN,
				// FileName);
				Loan_Balance_Status.Loan_Balance_Status(SSN, FileName);

				Payment_gaterthanAmount.Payment_gaterthanAmount(SSN, FileName);

				// History.History(SSN, FileName);
				// History.History1(SSN, FileName);

			}
		}

	}

	@Test(priority = 21, groups = "venkat_OH_ILP")

	public void LonI_1stInstdeposit_return_Payment_lessthan1stInstamount_VoidPayment() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_LonI_1stInstdeposit_return_Payment_lessthan1stInstamount_VoidPayment_Txn_TestData.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				test = reports.startTest(Header + "_S.No:22" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>default>Run EOD batch process(default date+60 days)");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, -1, 2);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				// AgeStore_ILP.AgeStore_ILP(SSN, FileName, 8, 2);
				ACHReturnPosting.ACHReturnPosting(SSN, FileName);
				Payment_LessthanAmount_venkat.Payment_LessthanAmount_venkat(SSN, FileName, 2);
				Void_Payment.Void_Payment(SSN, FileName);
				// Apportions_List.Apportions_List(SSN, FileName, 2);
				Customer_Status.Customer_Status(SSN, FileName);
				// History.History(SSN, FileName);
			}
		}

	}

	@Test(priority = 22, groups = "venkat_OH_ILP")

	public void Loan_Deposit_Rtn_paymentLessthanLoanAmount_Void() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_Deposit_Rtn_paymentLessthanLoanAmount_Void_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";

		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();

				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:23" + "_" + PayFrequency + "_" + CollateralType,
						"Loan_1# deposit_rtn_payment(greater  than 1# amount)_void payment on next day  (Encryption key issue)");
				appUrl = AppURL;
				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore.AgeStore(SSN, FileName, -1);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				ACHReturnPosting.ACHReturnPosting(SSN, FileName);
				Payment_gaterthanAmount.Payment_gaterthanAmount(SSN, FileName);
				AgeStore.AgeStore(SSN, FileName, 1);
				Payment_EncryptionKey_Void.Payment_EncryptionKey_Void(SSN, FileName);
				// History.History(SSN, FileName);
				Loan_Balance_Status.Loan_Balance_Status(SSN, FileName);
			}
		}

	}

	@Test(priority = 23, groups = "venkat_OH_ILP")

	public void Loan_1stDep_Ret_EODBatch10daysDueDate_PmtGreaterthanInstAmt_Void_() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_1stDep_Ret_EODBatch10daysDueDate_PmtGreaterthanInstAmt_Void_TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:24" + "_" + PayFrequency + "_" + CollateralType,
						"Loan_1# deposit_rtn_Run EOB batch process from 10th day of due date>payment(greater  than 1# amount)_Void");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");

				AgeStore_ILP.AgeStore_ILP(SSN, FileName, -1, 2);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);

				Loan_Balance_Status.Loan_Balance_Status(SSN, FileName);
				// AgeStore_ILP.AgeStore_ILP(SSN, FileName, 8, 2);
				ACHReturnPosting.ACHReturnPosting(SSN, FileName);
				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 10, 2);
				// Check_TransactionRecords.Check_TransactionRecords(SSN,
				// FileName);
				Loan_Balance_Status.Loan_Balance_Status(SSN, FileName);
				PayAnyAmt_Installments_venkat.PayAnyAmt_Installments_venkat(SSN, FileName,"");
				PayAny_Void.PayAny_Void(SSN, FileName);
				// History.History(SSN, FileName);
				// History.History1(SSN, FileName);

			}
		}

	}

	@Test(priority = 24)
	public void Loan_PaymentinCSRPortel() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_Payments_Txn_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_OH_ILP_venkat");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:25" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>select payment option from CSR dropdown> Payment screen ");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);

				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore.AgeStore(SSN, FileName, -5);
				Payoff.Payoff(SSN, FileName);
				// History_Paymentcaluculation.History_Paymentcaluculation(SSN,
				// FileName);

			}
		}

	}

	@Test(priority = 25)
	public void AA_Loan_1stInstallmentPayments() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_1stInstallmentPayments_Txn_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_OH_ILP_venkat");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:26" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>1# payment on due date>payoff");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore_1stInstallment.AgeStore_1stInstallment(SSN, FileName, 0);
				Payoff.Payoff(SSN, FileName);
				// History_Paymentcaluculation.History_Paymentcaluculation(SSN,
				// FileName);

			}
		}

	}

	@Test(priority = 26)
	public void Loan_PaymentinCSRPortel_Void() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_Payment_Void_Txn_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_OH_ILP_venkat");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:28" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>select payment option from CSR dropdown> Payment screen should show the follwing options  1.Pay Off the balance 2.Pay Installment Am t3.Pay any other Amt>select payoff balance>Enter amount>");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore.AgeStore(SSN, FileName, -5);
				Payoff.Payoff(SSN, FileName);
				PayAny_Void.PayAny_Void(SSN, FileName);
				// History_Paymentcaluculation.History_Paymentcaluculation(SSN,
				// FileName);

			}
		}

	}

	/*
	 * //@Test(priority = 27) Dubilecate public void
	 * AA_Loan_1stInstallmentPayments_Void() throws Exception {
	 * 
	 * // Start test. Mention test script name String FileName =
	 * "AA_Loan_1stInstallmentPayments_Void_Txn_Testdata.xls"; TestData = new
	 * Excel(System.getProperty("user.dir") +
	 * prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
	 * int lastrow = TestData.getLastRow("NewLoan"); String sheetName =
	 * "NewLoan"; // int lastrow=TestData.getLastRow("Borrower");
	 * System.out.println(lastrow); for (int row = 2; row <= lastrow; row++) {
	 * String RunFlag = TestData.getCellData(sheetName, "Run", row); //
	 * System.out.println(RunFlag); if (RunFlag.equals("Y")) { //
	 * driver.get(appUrl); // test.log(LogStatus.INFO, "Application is launched"
	 * ); // driver.manage().window().maximize(); AppURL =
	 * prop.getProperty("AppURL_OH_ILP_venkat"); UserName =
	 * prop.getProperty("UserName_OH_ILP_venkat"); Password =
	 * prop.getProperty("Password_OH_ILP_venkat"); String PayFrequency =
	 * TestData.getCellData(sheetName, "Income_PayFrequency", row); String
	 * CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType",
	 * row); // System.out.println(Password); StoreId =
	 * prop.getProperty("StoreID_OH_ILP_venkat"); String ProductID =
	 * TestData.getCellData(sheetName, "ProductID", row); String StateID =
	 * TestData.getCellData(sheetName, "StateID", row); String SSN =
	 * TestData.getCellData(sheetName, "SSN", row); String Header = StateID +
	 * "_" + ProductID; // System.out.println(SSN); test =
	 * reports.startTest(Header + "_S.No:29" + "_" + PayFrequency + "_" +
	 * CollateralType,"Loan>1# payment on due date>void>payoff>void"); appUrl =
	 * AppURL;
	 * 
	 * 
	 * Login.Login(UserName, Password, StoreId);
	 * RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test,
	 * AppURL, SSN, FileName); NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
	 * AgeStore_.AgeStore_1stInstallment(SSN, FileName, 0); Payoff.Payoff(SSN,
	 * FileName); //
	 * History_Paymentcaluculation.History_Paymentcaluculation(SSN, FileName);
	 * 
	 * } }
	 * 
	 * }
	 */
	@Test(priority = 28, groups = "venkat_OH_ILP")

	public void Loan_Pmt1stInstdate_Pmt2ndInstdate_void_EODBatch10days2Inst_payoff_() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_Pmt1stInstdate_Pmt2ndInstdate_void_EODBatch10days2Inst_payoff_TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:30" + "_" + PayFrequency + "_" + CollateralType,
						"Loan_1# payment on due date_2#payment on due date_void_run EOD batch process on 10th day of 2# _payoff_(consider loan has only three installements)_void");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, 0, 2);
				Payment_ILP.Payment_ILP(SSN, FileName);
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, 0, 3);
				Payment_ILP.Payment_ILP(SSN, FileName);
				PayAny_Void.PayAny_Void(SSN, FileName);
				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 10, 3);
				Payoff_Installments.Payoff_Installments(SSN, FileName);
				Loan_Balance_Status.Loan_Balance_Status(SSN, FileName);
				PayAny_Void.PayAny_Void(SSN, FileName);
				// History.History2(SSN, FileName);

			}
		}

	}

	@Test(priority = 29, groups = "venkat_OH_ILP")

	public void Loan_Deposit_Rtn_payoff() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan1stInsatallmentDeposit_Return_Payoff_Txn_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";

		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();

				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:31" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>1#depsoit >rtn>payoff>");
				appUrl = AppURL;
				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore.AgeStore(SSN, FileName, -1);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 8);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				AgeStore_1stInstallment.AgeStore_1stInstallment(SSN, FileName, 8);
				ACHReturnPosting.ACHReturnPosting(SSN, FileName);
				Payoff_Return.Payoff_Return(SSN, FileName);
				// History_Payoffcaluculation.History_Payoffcaluculation(SSN,
				// FileName);
			}
		}

	}

	@Test(priority = 30, groups = "venkat_OH_ILP")

	public void Loan_Deposit_Rtn_clear_2InstDeposit_Return_EODBatchprocess_payoff() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan1stInsatallmentDeposit_2ndInstDeposit_Return_EodBatch_3rdInst_Payoff_Txn_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";

		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();

				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:32" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>1#deposit >clr>2# dep>rtn>run EOD batch process on 10th from 2# due date>payoff>age the store date to one day before 3# due date(banking day)>run EOD");
				appUrl = AppURL;
				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore.AgeStore(SSN, FileName, -1);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 8, 2);
				AgeStore_2ndInstallment.AgeStore_2ndInstallment(SSN, FileName, -1);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 3);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				ACHReturnPosting.ACHReturnPosting(SSN, FileName);
				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 10, 3);
				Payoff_Return.Payoff_Return(SSN, FileName);
				AgeStore_3rdInstallment.AgeStore_3rdInstallment(SSN, FileName, -1);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				// History_Payoffcaluculation_.History_Payoffcaluculation_3rdInst(SSN,
				// FileName);
			}
		}

	}

	@Test(priority = 31, groups = "venkat_OH_ILP")

	public void Loan_Deposit_Rtn_Payoff_Void() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan1stInsatallmentDeposit_Return_Payoff_void_Txn_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";

		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();

				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:33" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>1#depsoit >rtn>payoff>void");
				appUrl = AppURL;
				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore.AgeStore(SSN, FileName, -1);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				AgeStore_1stInstallment.AgeStore_1stInstallment(SSN, FileName, 8);
				ACHReturnPosting.ACHReturnPosting(SSN, FileName);
				Payoff_Return.Payoff_Return(SSN, FileName);
				PayAny_Void.PayAny_Void(SSN, FileName);
				// Void.Void(SSN, FileName);
				// History_Payoffcaluculation.History_Payoffcaluculation(SSN,
				// FileName);
			}
		}
	}

	@Test(priority = 32, groups = "venkat_OH_ILP")

	public void Loan_DepositACH_() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_DepositACH_TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:35" + "_" + PayFrequency + "_" + CollateralType,
						"Loan_age the store date to one day before 1# due date(banking day)_Run EOD process_Run payliance origination file_Process depsoit on due by clicking on Process ILP pre ach depsoits");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, -1, 2);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				// Check_TransactionRecords.Check_TransactionRecords(SSN,
				// FileName);

			}
		}

	}

	@Test(priority = 33, groups = "venkat_OH_ILP")

	public void Loan_1stInstpartialpayment_1stInstdeposit_() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_1stInstpartialpayment_1stInstdeposit_TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:36" + "_" + PayFrequency + "_" + CollateralType,
						"Loan_1st Inst partial payment_1st Inst deposit");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, 0, 2);
				PartialPayment.PartialPayment(SSN, FileName);
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, -1, 2);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing_RecordVerify.StatementGeneration_EODProcessing_RecordVerify(SSN,
						FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				// Check_TransactionRecords.Check_TransactionRecords(SSN,
				// FileName);

			}
		}

	}

	@Test(priority = 34, groups = "venkat_OH_ILP") // dubilacate

	public void Loan_1stInstpaymentFullCash_1stInstdeposit_() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_1stInstpaymentFullCash_1stInstdeposit_TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:37" + "_" + PayFrequency + "_" + CollateralType,
						"Loan_1st Inst  full cash payment_1st Inst deposit");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, 0, 2);
				Payment_ILP.Payment_ILP(SSN, FileName);
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, -1, 2);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				// StatementGeneration_EODProcessing_RecordVerify.StatementGeneration_EODProcessing_RecordVerify(SSN,
				// FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				// Check_TransactionRecords.Check_TransactionRecords(SSN,
				// FileName);

			}
		}

	}

	@Test(priority = 35, groups = "venkat_OH_ILP")
	public void AA_Loan_ACHRevoke_1stInsatallmentDeposit() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_ACHRevoke__1stInsatllmentDeposit_Txn_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_OH_ILP_venkat");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:38" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>ach revoke >1# deposit");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				ACH_Revoke.ACH_Revoke(SSN, FileName);
				AgeStore_1stInstallment.AgeStore_1stInstallment(SSN, FileName, -1);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				// EODProcessing_with_recordsChecking.EODProcessing_with_recordsChecking(SSN,
				// FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);

			}
		}

	}

	@Test(priority = 36, groups = "venkat_OH_ILP")
	public void AA_Loan_ACHRevoke_1stInsatallmentPayment_ACHAuthorization_2ndIsatallmentDeposit() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_ACHRevoke__1stInsatllmentPayment_ACHAuthorigation_ACHDeposit_Txn_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_OH_ILP_venkat");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:39" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>ach revoke >1# payment>ach auth>2# deposit");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				ACH_Revoke.ACH_Revoke(SSN, FileName);
				AgeStore_1stInstallment.AgeStore_1stInstallment(SSN, FileName, 0);
				Payment_ILP.Payment_ILP(SSN, FileName);
				ACHAuthorization.ACHAuthorization(SSN, FileName);
				AgeStore_2ndInstallment.AgeStore_2ndInstallment(SSN, FileName, -1);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);

			}
		}

	}

	@Test(priority = 37, groups = "venkat_OH_ILP") // dubilicate

	public void CO_ILP_Loan_Instwisepayment_last_deposit() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_CO_ILP_Loan_Instwisepayment_LastInst_deposit_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";

		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);

			if (RunFlag.equals("Y")) {

				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);

				test = reports.startTest(Header + "_S.No:40" + "_" + PayFrequency + "_" + CollateralType,
						"Loan>payment all the installements acc to respective due dates except last installement>last # deposit");

				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				// NewLoan_ILP_NegAmt.NewLoan_ILP_NegAmt(SSN, FileName, "200");
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, 0, 2);
				installmentPayment.installmentPayment(SSN, FileName);
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, 0, 3);
				installmentPayment.installmentPayment(SSN, FileName);
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, 0, 4);
				installmentPayment.installmentPayment(SSN, FileName);
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, -1, 5);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);

			}

		}
	}

	@Test(priority = 38, groups = "venkat_OH_ILP")

	public void Loan_1stInstDeposit_Rtn() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_1stInsatallmentDeposit_Return_Txn_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";

		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();

				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:41" + "_" + PayFrequency + "_" + CollateralType,
						"Laon>1# deposit>Return");
				appUrl = AppURL;
				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore.AgeStore(SSN, FileName, -1);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				ACHReturnPosting.ACHReturnPosting(SSN, FileName);
				// History_LoanStatus.History_LoanStatus(SSN, FileName);

			}
		}

	}

	@Test(priority = 39, groups = "venkat_OH_ILP")

	public void Loan_1stParPmt_1stDep_Ret_() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_1stParPmt_1stDep_Ret_TestData.xls";
		Excel TestData = new Excel("E:/QC_Workspace/AA_Automation/TestData/OH_ILP/Local/" + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_FL_ILP_kiran");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:42" + "_" + PayFrequency + "_" + CollateralType,
						"Loan_1# partial payment_1# deposit_Return");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, -6, 2);
				PayAnyAmt_Installments_venkat.PayAnyAmt_Installments_venkat(SSN, FileName, "15");
				AgeStore_ILP.AgeStore_ILP(SSN, FileName, -1, 2);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				// AgeStore_ILP.AgeStore_ILP(SSN, FileName, 8, 2);
				ACHReturnPosting.ACHReturnPosting(SSN, FileName);
				// Check_TransactionRecords.Check_TransactionRecords(SSN,
				// FileName);
				Loan_Balance_Status.Loan_Balance_Status(SSN, FileName);

			}
		}

	}

	/*
	 * // @Test (priority=40,groups = "venkat_OH_ILP")//Dubilicate
	 * 
	 * public void
	 * Loan_PaymentallInstOnduedate_ExceptLastInst_LastDeposit_Return() throws
	 * Exception {
	 * 
	 * // Start test. Mention test script name String FileName=
	 * "AA_Loan_PaymentallInstOnduedate_ExceptLastInst_LastDeposit_Return_Testdata.xls";
	 * TestData = new Excel(System.getProperty("user.dir") +
	 * prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
	 * int lastrow=TestData.getLastRow("NewLoan"); String sheetName="NewLoan";
	 * 
	 * //int lastrow=TestData.getLastRow("Borrower");
	 * System.out.println(lastrow); for(int row=2;row<=lastrow;row++) { String
	 * RunFlag = TestData.getCellData(sheetName,"Run",row);
	 * //System.out.println(RunFlag); if(RunFlag.equals("Y")) {
	 * //driver.get(appUrl); //test.log(LogStatus.INFO,
	 * "Application is launched"); //driver.manage().window().maximize();
	 * 
	 * 
	 * String PayFrequency =
	 * TestData.getCellData(sheetName,"Income_PayFrequency",row); String
	 * CollateralType =
	 * TestData.getCellData(sheetName,"ESign_CollateralType",row); AppURL =
	 * prop.getProperty("AppURL_OH_ILP_venkat"); UserName =
	 * prop.getProperty("UserName_OH_ILP_venkat"); Password =
	 * prop.getProperty("Password_OH_ILP_venkat"); //
	 * System.out.println(Password); StoreId =
	 * prop.getProperty("StoreID_FL_ILP_kiran"); String ProductID =
	 * TestData.getCellData(sheetName,"ProductID",row); String StateID =
	 * TestData.getCellData(sheetName,"StateID",row); String SSN =
	 * TestData.getCellData(sheetName,"SSN",row); String Header = StateID+ "_" +
	 * ProductID; //System.out.println(SSN); test =
	 * reports.startTest(Header+"_S.No:43"+"_"+PayFrequency+"_"+CollateralType,
	 * "Loan_payment all the installements acc to respective due dates except last installement_last # deposit_Return"
	 * ); appUrl = AppURL; Login.Login(UserName,Password,StoreId);
	 * RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test,
	 * AppURL, SSN, FileName); NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
	 * AgeStore_ILP.AgeStore_ILP(SSN, FileName, 0, 2);
	 * Payment_Inst_Amount.Payment_Inst_Amount(SSN, FileName, 2);
	 * AgeStore_ILP.AgeStore_ILP(SSN, FileName, 0, 3);
	 * Payment_Inst_Amount.Payment_Inst_Amount(SSN, FileName, 3);
	 * AgeStore_ILP.AgeStore_ILP(SSN, FileName, 0, 4);
	 * Payment_Inst_Amount.Payment_Inst_Amount(SSN, FileName, 4);
	 * 
	 * AgeStore_ILP.AgeStore_ILP(SSN, FileName, -1, 5);
	 * DrawerDeassign.DrawerDeassign(SSN, FileName);
	 * StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN,
	 * FileName); StoreInfo.StoreInfo(SSN, FileName); Safeassign.Safeassign(SSN,
	 * FileName); Drawerassign.Drawerassign(SSN, FileName);
	 * Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1,5);
	 * ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0); //
	 * AgeStore_ILP.AgeStore_ILP(SSN, FileName, 8, 5);
	 * ACHReturnPosting.ACHReturnPosting(SSN, FileName);
	 * Loan_Balance_Status.Loan_Balance_Status(SSN, FileName);
	 * Check_Payment.Check_Payment(SSN, FileName);
	 * 
	 * 
	 * 
	 * } }
	 * 
	 * 
	 * }
	 */

	@Test(priority = 41, groups = "venkat_OH_ILP")
	public void AA_Loan_ACHRevoke_1stInsatallmentDeposit_Clear() throws Exception {

		// Start test. Mention test script name
		String FileName = "AA_Loan_ACHRevoke__1stInsatllmentDeposit_Clear_Txn_Testdata.xls";
		TestData = new Excel(
				System.getProperty("user.dir") + prop.getProperty("AA_Store_Test_data_OH_ILP_path_venkat") + FileName);
		int lastrow = TestData.getLastRow("NewLoan");
		String sheetName = "NewLoan";
		// int lastrow=TestData.getLastRow("Borrower");
		System.out.println(lastrow);
		for (int row = 2; row <= lastrow; row++) {
			String RunFlag = TestData.getCellData(sheetName, "Run", row);
			// System.out.println(RunFlag);
			if (RunFlag.equals("Y")) {
				// driver.get(appUrl);
				// test.log(LogStatus.INFO, "Application is launched");
				// driver.manage().window().maximize();
				AppURL = prop.getProperty("AppURL_OH_ILP_venkat");
				UserName = prop.getProperty("UserName_OH_ILP_venkat");
				Password = prop.getProperty("Password_OH_ILP_venkat");
				String PayFrequency = TestData.getCellData(sheetName, "Income_PayFrequency", row);
				String CollateralType = TestData.getCellData(sheetName, "ESign_CollateralType", row);
				// System.out.println(Password);
				StoreId = prop.getProperty("StoreID_OH_ILP_venkat");
				String ProductID = TestData.getCellData(sheetName, "ProductID", row);
				String StateID = TestData.getCellData(sheetName, "StateID", row);
				String SSN = TestData.getCellData(sheetName, "SSN", row);
				String Header = StateID + "_" + ProductID;
				// System.out.println(SSN);
				test = reports.startTest(Header + "_S.No:44" + "_" + PayFrequency + "_" + CollateralType,
						"Laon>1# deposit>Clear");
				appUrl = AppURL;

				Login.Login(UserName, Password, StoreId);
				RegistrationPage_NewLoan_ILP.RegistrationPage_NewLoan_ILP(driver, test, AppURL, SSN, FileName);
				NewLoan_ILP.NewLoan_ILP(SSN, FileName, "200");
				AgeStore_1stInstallment.AgeStore_1stInstallment(SSN, FileName, -1);
				DrawerDeassign.DrawerDeassign(SSN, FileName);
				StatementGeneration_EODProcessing.StatementGeneration_EODProcessing(SSN, FileName);
				StoreInfo.StoreInfo(SSN, FileName);
				Safeassign.Safeassign(SSN, FileName);
				Drawerassign.Drawerassign(SSN, FileName);
				Payliance_OriginationFile.Payliance_OriginationFile(SSN, FileName, -1, 2);
				ACH_Deposit1.ACH_Deposit1(SSN, FileName, 0);
				EOD_BatchProcess_DueDate.EOD_BatchProcess_DueDate(SSN, FileName, 8, 2);

			}
		}

	}

 
 

	
	
	
	
	
 
	 
	
	@AfterMethod(alwaysRun = true)

	public void getResult(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
			// test.log(LogStatus.FAIL, "Test Case Failed is
			// "+result.getThrowable());

			String screenshotPath = getScreenhot(driver, result.getName());
			// To add it in the extent report
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {

			test.log(LogStatus.PASS, result.getName() + " Test Case is Passed");
		}
		reports.flush();
		// driver.quit();

	}

	public static String getScreenhot(WebDriver driver, String screenshotName) throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		// TakesScreenshot ts = (TakesScreenshot) driver;
		// File source = ts.getScreenshotAs(OutputType.FILE);

		File source = ((TakesScreenshot) (driver)).getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		String destination = System.getProperty("user.dir") + "/ExecutionReports/LOC/FailedTestsScreenshots/"
				+ screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	@AfterMethod
	@AfterTest(alwaysRun = true)
	public void tearDown() {
		// Ending Test
		reports.endTest(test);

		// writing everything into HTML report
		reports.flush();
	}

	@AfterClass(alwaysRun = true)
	public void quit() {
		// Closing browser
		driver.quit();

	}

	public void takeScreenShot(WebDriver driver, String filePath) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeClass(alwaysRun = true)
	public synchronized void initialize() {
		// Create an instance of ExtentsReports class and pass report storage
		// path as a parameter
		// Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		try {
			BufferedReader reader;
			reader = new BufferedReader(

					new FileReader("C:/AA_Batch/AA_ILP/src/test/java/pack/Config.properties"));

			prop = new Properties();
			prop.load(reader);
			reader.close();

		}

		catch (Exception e) {

			System.out.println("Object proprties file not found");
		}

		String timestamp = new SimpleDateFormat("MM.dd.yyyy.HH.mm.ss").format(new Date());
		// Date D = new Date();

		String kfilename = prop.getProperty("QC_Store_extent_report_file_name") + timestamp + ".html";

		reports = new ExtentReports(
				System.getProperty("user.dir") + prop.getProperty("QC_Store_extent_report_path") + kfilename, true);
		/*
		 * reports = new ExtentReports(System.getProperty("user.dir") +
		 * "/ExecutionReports/CO_ILP/AA_CO_ILP_Generic Scenarios_" + timestamp +
		 * ".html", true); reports.addSystemInfo("Browser Version", "IE 11.0");
		 */
	}

	@BeforeTest(alwaysRun = true)
	public void setup_Grid() throws IOException, InterruptedException {

		try {
			BufferedReader reader;
			reader = new BufferedReader(

					new FileReader("C:/AA_Batch/AA_ILP/src/test/java/pack/Config.properties"));

			prop = new Properties();
			prop.load(reader);
			reader.close();

		}

		catch (Exception e) {

			System.out.println("Object proprties file not found");
		}

		Runtime.getRuntime().exec("taskkill /T /F /IM IEDriverServer.exe");
		Thread.sleep(5000); // Allow OS to kill the process
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*
		 * String Node = "http://192.168.2.123:5555/wd/hub"; DesiredCapabilities
		 * cap = DesiredCapabilities.internetExplorer();
		 * 
		 * 
		 * System.setProperty("webdriver.ie.driver",System.getProperty(
		 * "user.dir")+"/IEDriverServer.exe");
		 * 
		 * driver = new RemoteWebDriver(new URL(Node), cap);
		 */
		/*
		 * System.setProperty("webdriver.ie.driver",System.getProperty(
		 * "user.dir")+"/IEDriverServer.exe"); driver = new
		 * InternetExplorerDriver();
		 */
	}

	public boolean IsElementExits(String Value) {
		int secondsToWait = 5;

		try {
			new WebDriverWait(driver, secondsToWait)
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Value)));
			return true;
		} catch (org.openqa.selenium.TimeoutException e) {
			return false;
		}
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex) {
			return false;
		}
	}

	public static WebElement Field(WebDriver driver) {

		try {
			Thread.sleep(500);
			WebElement element = (new WebDriverWait(driver, 9)).until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td/table")));
			return element;
		} catch (Exception e) {
			return null;
		}
	}

	public void proc(String ReturnFormat) throws ClassNotFoundException, SQLException {
		Connection conn = null;

		// Object of Statement. It is used to create a Statement to execute the
		// query
		Statement stmt = null;

		// Object of ResultSet => 'It maintains a cursor that points to the
		// current row in the result set'
		ResultSet resultSet = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("before conn");

		// Open a connection
		try {

			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.242:1521:QFUNDUAT2",
					"QFUNDX_LOCAL_AUTOMATION", "QFUNDX_LOCAL_AUTOMATION");

		} catch (SQLException e1) {

			System.out.println("Connection Failed! Check output console" + e1);
			e1.printStackTrace();
		}

		// Execute a query
		stmt = conn.createStatement();
		System.out.println("after conn");

		try {
			String A = null;

			String content;

			String fw = "E:\\AdminLogin.txt";
			// String content = "\r\n";

			// content=A;
			// fw = "E:\\AdminLogin.txt";

			appendUsingFileWriter(fw, ReturnFormat);
			// appendUsingFileWriter(fw,"\r\n");
			// appendUsingFileWriter(fw,content);

			// String str = content.readLine();

			fw.replaceAll("[0-9,a-z,A-Z]{17,21}", A);

			// fw.close();

			System.out.println("after query");

			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (Exception e) {
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		} catch (Exception e2) {

			System.out.println(" console" + e2);
			e2.printStackTrace();
		}

	}

	private static void appendUsingFileWriter(String filePath, String text) {
		File file = new File(filePath);
		FileWriter fr = null;
		try {
			// Below constructor argument decides whether to append or override
			fr = new FileWriter(file);
			fr.write(text);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

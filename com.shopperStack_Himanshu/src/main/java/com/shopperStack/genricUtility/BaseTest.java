package com.shopperStack.genricUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.shopperStack_Himanshu.Home_page;
import com.shopperStack_Himanshu.Loginpage;
import com.shopperStack_Himanshu.Welcome_page;

public class BaseTest {

	public WebDriver driver;
	public static WebDriver sDriver;
	public FileUtility fileUtility = new FileUtility();
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public Welcome_page welcomepage;
	public Loginpage loginpage;
	public WebDriverWait wait;
	public Home_page homePage;
	public javaUtility javaUtitilty = new javaUtility();
	public WebDriverUtility webDriverUtility = new WebDriverUtility();

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
		spark = new ExtentSparkReporter(FrameworkConstent.extentReportsPath + javaUtitilty.getLocalDateTime() + ".html");
		reports = new ExtentReports();
		reports.attachReporter(spark);
		test = reports.createTest("Demo");

	}

	@BeforeClass
	public void beforeClass() throws IOException {
		System.out.println("Before class");
		String browserName = fileUtility.readDataFromPropertyFileString("browserName");
		String url = fileUtility.readDataFromPropertyFileString("url");

		if (browserName.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.contains("firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.contains("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("please enter valid browser name");
		}
		sDriver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		homePage = new Home_page(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);

	}

	@BeforeMethod

	public void beforeMethod() throws InterruptedException, IOException {
		System.out.println("BeforeMethod");
		welcomepage = new Welcome_page(driver);
		wait.until(ExpectedConditions.elementToBeClickable(welcomepage.getLoginbtn()));
		Thread.sleep(2000);

		welcomepage.getLoginbtn().click();

		loginpage = new Loginpage(driver);
		loginpage.getEmailtextfield().sendKeys(fileUtility.readDataFromPropertyFileString("userName"));
		loginpage.getPasswordtextfield().sendKeys(fileUtility.readDataFromPropertyFileString("password"));
		loginpage.getLoginbtn().click();

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");

		homePage.getAccountbtn().click();
		homePage.getLogoutbtn().click();
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("@AfterClass");
		Thread.sleep(3000);
		driver.quit();

	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
		reports.flush();

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}
}
package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class TechnocratsUniversityTests {

	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		var options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		driver = new ChromeDriver(options);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		// Quit out of Selenium Chrome driver
		driver.quit();
	}

	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	void testAllLinks() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Go to home page of Technocrats University
		String baseUrl = "http://localhost:8080/ArtifactID/hello";
		driver.get("http://localhost:8080/ArtifactID/hello");

		// Go to all majors page
		driver.findElement(By.id("allMajors")).click();
		driver.findElement(By.id("goBack")).click();

		// Go to all students page
		driver.findElement(By.id("allStudents")).click();
		driver.findElement(By.id("goBack")).click();

		// Go to major by ID page
		driver.findElement(By.id("majorById")).click();
		driver.findElement(By.id("textEntry")).sendKeys("1");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.id("goBack")).click();

		// Go to student by ID page
		driver.findElement(By.id("studentById")).click();
		driver.findElement(By.id("textEntry")).sendKeys("3");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.id("goBack")).click();

		// Go to students by major cost page
		driver.findElement(By.id("allStudentsByMajorCost")).click();
		driver.findElement(By.id("textEntry")).sendKeys("2000");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.id("goBack")).click();
		// fail("Not yet implemented");
	}

	@Test
	void allMajorsCorrectDisplay() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Go to home page of Technocrats University
		String baseUrl = "http://localhost:8080/ArtifactID/allMajors";
		driver.get(baseUrl);
		
		Assert.assertTrue(driver.findElement(By.className("entryRow")).isDisplayed());
	}
	
	@Test
	void allStudentsCorrectDisplay() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Go to home page of Technocrats University
		String baseUrl = "http://localhost:8080/ArtifactID/allStudents";
		driver.get(baseUrl);
		
		Assert.assertTrue(driver.findElement(By.className("entryRow")).isDisplayed());
	}
	
	@Test
	void majorByIdBadInput() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Go to home page of Technocrats University
		String baseUrl = "http://localhost:8080/ArtifactID/getMajorById";
		driver.get(baseUrl);
		
		driver.findElement(By.id("textEntry")).sendKeys("-1");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.id("goBack")).click();
	}
	
	@Test
	void studentByIdBadInput() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Go to home page of Technocrats University
		String baseUrl = "http://localhost:8080/ArtifactID/getMajorById";
		driver.get(baseUrl);
		
		driver.findElement(By.id("textEntry")).sendKeys("-1");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.id("goBack")).click();
	}
	
	@Test
	void majorByIdDirectToView() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Go to home page of Technocrats University
		String baseUrl = "http://localhost:8080/ArtifactID/getMajorByIdView";
		driver.get(baseUrl);
		
		Assert.assertTrue(driver.findElement(By.id("titleRow")).isDisplayed());
	}
	
	@Test
	void studentByIdDirectToView() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Go to home page of Technocrats University
		String baseUrl = "http://localhost:8080/ArtifactID/getStudentByIdView";
		driver.get(baseUrl);
		
		Assert.assertTrue(driver.findElement(By.id("titleRow")).isDisplayed());
	}
	
	@Test
	void allStudentsByMajorCostCorrectDisplay() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Go to home page of Technocrats University
		String baseUrl = "http://localhost:8080/ArtifactID/getAllStudentsByMajorCost";
		driver.get(baseUrl);
		
		driver.findElement(By.id("textEntry")).sendKeys("100");
		driver.findElement(By.id("submitButton")).click();
		
		Assert.assertTrue(driver.findElement(By.className("entryRow")).isDisplayed());
	}
	
	@Test
	void allStudentsByMajorCostBadInput() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Go to home page of Technocrats University
		String baseUrl = "http://localhost:8080/ArtifactID/getAllStudentsByMajorCost";
		driver.get(baseUrl);
		
		driver.findElement(By.id("textEntry")).sendKeys("100");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.id("goBack")).click();
	}
}
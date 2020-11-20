package com.udacity.jwdnd.course1.cloudstorage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CloudStorageApplicationTests {

	@LocalServerPort
	private int port;

	private WebDriver driver;

	@BeforeAll
	static void beforeAll() {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeEach
	public void beforeEach() {
		this.driver = new ChromeDriver();
	}

	@AfterEach
	public void afterEach() {
		if (this.driver != null) {
			driver.quit();
		}
	}

	@Test
	public void testUserSignupAndLogin() throws InterruptedException{
		String _firstName = "John";
		String _lastName = "Doe";
		String _username = "jdoe";
		String _password = "test123!";

		driver.get("http://localhost:" + this.port + "/signup");

		// ########### Sign Up ############
		SignUpPage signUpPage = new SignUpPage(driver);

		signUpPage.performSignUp(_firstName, _lastName, _username, _password);

		Thread.sleep(5000);

		// ########### Login ##############
		
	}

//	// Sign up and Login
//	@Test
//	public void signUpAndLoginTest() throws InterruptedException {
//
//		driver.get("http://localhost:" + this.port + "/signup");
//
//		// ########### Sign Up ############
//		WebElement inputFieldFirstName = driver.findElement(By.id("inputFirstName"));
//		inputFieldFirstName.sendKeys("john");
//
//		WebElement inputFieldLastName = driver.findElement(By.id("inputLastName"));
//		inputFieldLastName.sendKeys("doe");
//
//		WebElement inputFieldUsername = driver.findElement(By.id("inputUsername"));
//		inputFieldUsername.sendKeys("jdoe");
//
//		WebElement inputFieldPassword = driver.findElement(By.id("inputPassword"));
//		inputFieldPassword.sendKeys("test123!");
//
//		inputFieldPassword.submit();
//
//		Thread.sleep(2000);
//
//		// ########### Login ##############
// 		WebElement inputFieldLoginUser = driver.findElement(By.id("inputUsername"));
//		inputFieldLoginUser.sendKeys("jdoe");
//
//		WebElement inputFieldLoginPassword = driver.findElement(By.id("inputPassword"));
//		inputFieldLoginPassword.sendKeys("test123!");
//
//		inputFieldLoginPassword.submit();
//
//		Thread.sleep(3000);
//	}
}

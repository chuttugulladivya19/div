package stepdefinition;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Googlesearch {
		WebDriver driver;
		@Given("browser is open")
		public void browser_is_open() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		@Given("user is on google search page")
		public void user_is_on_google_search_page() {
			driver.navigate().to("http://www.google.com");
		}
		@When("user enter a text in search box")
		public void user_enter_a_text_in_search_box() {
			driver.findElement(By.name("q")).sendKeys("India");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		}
		@Then("user is navigated to search result")
		public void user_is_navigated_to_search_result() throws InterruptedException {
			Thread.sleep(30000);
			driver.quit();
		}
	}





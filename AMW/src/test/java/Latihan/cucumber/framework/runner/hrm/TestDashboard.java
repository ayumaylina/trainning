package Latihan.cucumber.framework.runner.hrm;
//package Latihan.cucumber.framework.runner.hrm.scenefirst;
//
//import static org.testng.Assert.assertEquals;
//
//import org.openqa.selenium.WebDriver;
//
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//
//import cucumber.framework.page.hrms.DashboardPage;
//import cucumber.framework.runner.hrms.scenefirst.SceneFirstHooks;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class TestDashboard {
//
//	WebDriver driver;
//	private static ExtentTest extentTest;
//	private DashboardPage dashboardPage = new DashboardPage();
//	
//	public TestDashboard() {
//		driver = SceneFirstHooks.driver;
//		extentTest = SceneFirstHooks.extentTest;
//	}
//	
//	@When("User click menu Dashboard")
//	public void user_click_menu_dashboard() {
////		Hooks.delay(1);
//		dashboardPage.goToMenuDashboard();
//		extentTest.log(LogStatus.PASS, "User click menu Dashboard");
//	}
//	
//	@Then("User on menu Dashboard")
//	public void user_on_menu_dashboard() {
//		//Sengaja fail untuk uji fungsi screenshot
//		assertEquals(dashboardPage.getTxtDashboardPage(), "Launching Soo");
//		extentTest.log(LogStatus.PASS, "User on menu Dashboard");
//	}	

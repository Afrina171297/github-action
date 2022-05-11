import org.testng.annotations.Test;

//import com.test.pages.homepage;

//import org.testng.AssertJUnit;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
public class testcase1 extends baseclass1 {
	
searchpage1 searchpage1;	
	
	@Test	
	public void Verifylinks() throws InterruptedException {
		System.out.println(driver);
		
		searchpage1 = new searchpage1(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(5000);
		searchpage1.hotel_click();
		Thread.sleep(5000);
		searchpage1.search("Switzerland");
		Thread.sleep(5000);
		searchpage1.search_result();
		Thread.sleep(10000);
		searchpage1.checkin_date();
		Thread.sleep(6000);
		searchpage1.checkout_date();
		Thread.sleep(6000);
		searchpage1.room_add();
		searchpage1.adult_add();
		Thread.sleep(5000);
		searchpage1.child_add();
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,50)");
		searchpage1.child_age();
		Thread.sleep(10000);
		searchpage1.child_ageselect();
		Thread.sleep(2000);
		searchpage1.update_info();
		Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,950)");
	    Thread.sleep(5000);
	    searchpage1.two_star();
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,-750)");
	    Thread.sleep(15000);
	    System.out.println(searchpage1.hotel_name());
	   
		
	}
}

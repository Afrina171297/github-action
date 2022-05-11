package testcase;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
//import org.testng.Assert;
//import org.testng.AssertJUnit;
//import org.testng.Assert;
//import org.testng.annotations.Test;
import page_elements.searchpage;
import base.Baseclass;

public class testcases extends Baseclass {
        
	searchpage searchpage;
	
	@Test
	public void HoletName() throws InterruptedException {
		System.out.println(driver);
		
		searchpage = new searchpage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(5000);
		searchpage.hotel_click();
		Thread.sleep(5000);
		searchpage.search("Switzerland");
		Thread.sleep(5000);
		searchpage.search_result();
		Thread.sleep(10000);
		searchpage.checkin_date();
		Thread.sleep(6000);
		searchpage.checkout_date();
		Thread.sleep(6000);
		searchpage.room_add();
		searchpage.adult_add();
		searchpage.child_add();
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,50)");
		searchpage.child_age();
		Thread.sleep(10000);
		searchpage.child_ageselect();
		Thread.sleep(2000);
		searchpage.update_info();
		Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,950)");
	    Thread.sleep(5000);
	    searchpage.two_star();
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,-750)");
	    Thread.sleep(15000);
	    System.out.println(searchpage.hotel_name());
	   
		
	}
	

}

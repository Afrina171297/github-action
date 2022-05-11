import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpage1 {

	public searchpage1(WebDriver driver) {
		
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println(driver);
	}
	@FindBy(xpath = "//span[contains(text(),'Hotels')]")
	WebElement hotel;
	public void hotel_click() {
		hotel.click();
		
	   }
	
	
	@FindBy (xpath = "/html/body/div[3]/div/form/input[1]")
	WebElement search;
	public void search(String country) {
		   search.clear();
		   search.sendKeys(country);
	   }
	@FindBy (xpath = "//*[@id=\"typeahead_results\"]/a[1]")
	WebElement searchresult;
	public void search_result() {
		  searchresult.click();
	   }
	
	
	
	@FindBy (xpath = "//div[2]/div[2]/div[3]/div[2]/div[4]")
    WebElement checkin;
	public void checkin_date() {
		  checkin.click();
	   }
	//new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated("checkin");
	
	@FindBy (xpath = "(.//*[normalize-space(text()) and normalize-space(.)='SAT'])[1]/following::div[23]")
	WebElement checkout;
	public void checkout_date() {
		  checkout.click();    	   
	   }
	
	@FindBy (xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]")
    WebElement room;
	public void room_add() {
		  room.click();    	   
	   }
	
	@FindBy (xpath = "//div[2]/div/button[2]")
	WebElement adult;
	public void adult_add() {
		  adult.click();    	   
	   }
	
	@FindBy (xpath = "//div[3]/div/button[2]")
	WebElement child;
	public void child_add() {
		  child.click();    	   
	   }
	@FindBy (xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Child 1'])[1]/following::button[1]")
	WebElement age;
	public void child_age() {
		  age.click();    	   
	   }
	
	@FindBy (xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Age'])[2]/following::button[3]")
	WebElement ageselect;
	public void child_ageselect() {
		  ageselect.click();    	   
	   }
	
	@FindBy (xpath = "//div[5]/button")
	WebElement update;
	public void update_info() {
		  update.click();    	   
	   }
	
	@FindBy (xpath = "//div[6]/div[2]/div[4]/div/label")
	WebElement star;
	public void two_star() {
		  star.click();    	 
		 
	   }
	
	@FindBy (xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Updating list...'])[1]/following::a[2]")
	WebElement hotelname;
	public String hotel_name() {
		   return hotelname.getText();
		    	   
	   }
	
}

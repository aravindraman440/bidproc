package venilascript;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateEAuctions {
public static void main(String[] args) throws InterruptedException  {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://demo.bidproc.com/common/user/register");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Login with Credentials
	driver.findElement(By.id("j_username")).sendKeys("babu@yopmail.com");
	driver.findElement(By.id("j_password")).sendKeys("tender@123");
	driver.findElement(By.name("submit")).click();
	//mouse over create icon
	WebElement create = driver.findElement(By.xpath("//i[@class='epro icon-RFX']"));
	Actions builder=new Actions(driver);
	builder.moveToElement(create).build().perform();
	//click create eAuction
	driver.findElement(By.linkText("Create eAuction")).click();
	//project id
	driver.findElement(By.id("txtProjectId")).sendKeys("65439");
	//project title
	driver.findElement(By.id("txtProjectTitle")).sendKeys("Auction for Construction Tool Title");
	//project reference number
	driver.findElement(By.id("txtAuctionNo")).sendKeys("65436");
	//Auction title
	driver.findElement(By.id("txtBriefScope")).sendKeys("Building Material");
	//Auction Description 
	driver.findElement(By.id("txtauctiondetails")).sendKeys("Description Auction for Construction Tool Title");
	//select variant
	WebElement drop1 = driver.findElement(By.id("rdoAuctionVariant"));
	Select drop=new Select(drop1);
	drop.selectByValue("1");
	System.out.println("varient");
	WebElement drop2= driver.findElement(By.id("rdoAuctionMethod"));
	Select dropDown2=new Select(drop2);
	dropDown2.selectByValue("1");
	System.out.println("method");
	driver.findElement(By.id("equipment")).click();
	
	WebElement drop3= driver.findElement(By.id("optBaseCurrency"));
	Select dropDown3=new Select(drop3);
	dropDown3.selectByValue("112");
	System.out.println("base");
	

	WebElement drop4= driver.findElement(By.id("optDecimalVal"));
	Select dropDown4=new Select(drop4);
	dropDown4.selectByVisibleText("3");
	
	WebElement drop5= driver.findElement(By.id("rdobiddingType"));
	Select dropDown5=new Select(drop5);
	dropDown5.selectByValue("1");
	driver.findElement(By.id("txtProductLoc")).sendKeys("Oman");
	
	driver.findElement(By.linkText("Next")).click();
	//bidding Access
	WebElement biddingAccess= driver.findElement(By.id("rdoBiddingAccess"));
	Select Access=new Select(biddingAccess);
	Access.selectByVisibleText("Limited");
	
	WebElement multipleLine= driver.findElement(By.id("selIsPartialFillingAllowed"));
	Select multiLine=new Select(multipleLine);
	multiLine.selectByVisibleText("Applicable");
	
	WebElement exyendTime= driver.findElement(By.id("txtExtendedTime"));
	Select time=new Select(exyendTime);
	time.selectByVisibleText("5");
	
	WebElement extend= driver.findElement(By.id("txtExtendedTimeBy"));
	Select exTime=new Select(extend);
	exTime.selectByVisibleText("5");
	
	driver.findElement(By.id("txtNoOfExtension")).sendKeys("2");
	driver.findElement(By.id("txtEstimatedValue")).sendKeys("345");
	
	driver.findElement(By.xpath("(//div[@class='col-md-12 txt-right']/a)[2]")).click();
	
	driver.findElement(By.id("paymentDetailsNext")).click();
	//Bidder Response End Date & Time
	driver.findElement(By.id("txtDocumentEndDate")).click();
	driver.findElement(By.xpath("(//td[text()='15'])[1]")).click();
	driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-time']")).click();
	driver.findElement(By.className("timepicker-hour")).click();
	driver.findElement(By.xpath("(//td[text()='13'])[2]")).click();
	driver.findElement(By.className("timepicker-minute")).click();
	driver.findElement(By.xpath("(//td[text()='15'])[3]")).click();
	
	//eAuction Start Date & Time
	driver.findElement(By.id("txtAuctionStartDate")).click();
	driver.findElement(By.xpath("(//td[text()='15'])[1]")).click();
	driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-time']")).click();
	driver.findElement(By.xpath("(//span[@class='timepicker-hour'])[1]")).click();
	driver.findElement(By.xpath("(//td[text()='14'])[2]")).click();
	driver.findElement(By.xpath("//span[@class='timepicker-minute']")).click();
	driver.findElement(By.xpath("(//td[text()='30'])[3]")).click();
	
	driver.findElement(By.id("auction-conf")).click();
	driver.findElement(By.id("auctionConfig-date")).click();
	//eAuction End Date & Time
	Thread.sleep(5000);
	driver.findElement(By.xpath("//form[@id='tenderDtBean']//input[@id='txtAuctionEndDate']")).click();
	//WebDriverWait wait =new WebDriverWait(driver,20 );
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='tenderDtBean']//input[@id='txtAuctionEndDate']")));
	//WebElement endDate = driver.findElement);
	Thread.sleep(5000);

	driver.findElement(By.xpath("//div[@class='datepicker-days']//tr[3]//td[text()='17']")).click();
	driver.findElement(By.xpath("//a[@data-action='togglePicker']/span[@class='glyphicon glyphicon-time']")).click();
	driver.findElement(By.xpath("(//span[@class='timepicker-hour'])[1]")).click();
	driver.findElement(By.xpath("//div[@class='timepicker-hours']//td[text()='02']")).click();
	driver.findElement(By.xpath("//span[@class='timepicker-minute']")).click();
	driver.findElement(By.xpath("//td[text()='50']")).click();
	driver.findElement(By.xpath("//button[@id='btnSubmitForm']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")).click();
	Thread.sleep(5000);
	String title = driver.getTitle();
	System.out.println(title);
}
}

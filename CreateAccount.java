package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();
		d.findElement(By.id("username")).sendKeys("demosalesmanager");
		d.findElement(By.id("password")).sendKeys("crmsfa");
		d.findElement(By.className("decorativeSubmit")).click();
		d.findElement(By.id("label")).click();
		d.findElement(By.linkText("Accounts")).click();
		d.findElement(By.linkText("Create Account")).click();
		d.findElement(By.id("accountName")).sendKeys("TestLeaf");
		d.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		d.findElement(By.xpath("//select//option[@value='IND_SOFTWARE']")).click();
		//Thread.sleep(5000);
		Select owner=new Select(d.findElement(By.name("ownershipEnumId")));
		owner.selectByVisibleText("S-Corporation");
		//Thread.sleep(5000);
		d.findElement(By.xpath("//option[@value='LEAD_EMPLOYEE']")).click();
		Select  marketing = new Select(d.findElement(By.id("marketingCampaignId")));
		marketing.selectByIndex(6);
		//Thread.sleep(9000);
		Select state = new Select(d.findElement(By.id("generalStateProvinceGeoId")));
		state.selectByValue("TX");
		d.findElement(By.className("smallSubmit")).click();
		d.findElement(By.className("buttonDangerous")).click();
		Thread.sleep(5000);
		d.switchTo().alert().accept();
		//WebElement accountname = d.findElement(By.xpath("//div[@id='center-content-column']//div[@class='frameSection'][1]//td[2]/span[1]"));
		//WebElement accountname = d.findElement(By.partialLinkText("//div[@id='center-content-column']//div[@class='frameSection'][1]//td[2]/span[1]"));
		//WebElement accountname = d.findElement(By.xpath("//span[contains(text(),'TestLeaf')]"));
		//WebElement accountname = d.findElement(By.partialLinkText("//span[contains(text(),'TestLeaf')]"));
		WebElement accountname = d.findElement(By.partialLinkText("TestLeaf"));
		
		String accname = accountname.getText();
		if(accname.contains("Leaf")) {
			System.out.println("Account name is: " +accname);
		}
		else {
			System.out.println("Account name not found");
		}
		Thread.sleep(5000);
		//{//div[@id="center-content-column"]//div[@class="frameSection"][1]//td[2]/span[1]}
		
		/*WebElement createAcc = d.findElement(By.className("smallSubmit"));
		WebElement duplicateAcc = d.findElement(By.className("buttonDangerous"));
		if(createAcc.isEnabled()) {
			createAcc.click();
			System.out.println("Duplicate acc");
		}
		else {
			duplicateAcc.click();
			System.out.println("create acc");
		}*/
		
		d.quit();
		

	}

}

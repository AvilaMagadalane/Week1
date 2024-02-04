package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/login");
		d.manage().window().maximize();
		d.findElement(By.id("username")).sendKeys("demosalesmanager");
		d.findElement(By.id("password")).sendKeys("crmsfa");
		d.findElement(By.className("decorativeSubmit")).click();
		d.findElement(By.id("label")).click();
		d.findElement(By.xpath("//li[@class='sectionTabButtonUnselected'][1]")).click();
		d.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		d.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		d.findElement(By.id("createLeadForm_firstName")).sendKeys("Avila");
		d.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		d.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456789");
		d.findElement(By.name("submitButton")).click();
		WebElement lead = d.findElement(By.id("viewLead_companyName_sp"));
		System.out.println(lead.getText());
		d.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		d.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		d.findElement(By.name("phoneNumber")).sendKeys("123456789");
		d.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(5000);
		WebElement lead1 = d.findElement(By.xpath("//div[@class='x-grid3-scroller']//a[1]"));
		String s = lead1.getText();
		System.out.println(lead1.getText());
		lead1.click();
		//WebElement lead = d.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[contains(text(),'Avila')]"));
		
		//lead.click();
		//d.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[contains(text(),'Avila')]")).click();
		//lead.click();
		d.findElement(By.className("subMenuButtonDangerous")).click();
		d.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		d.findElement(By.name("id")).sendKeys(s);
		//name.sendKeys(lead1)
		d.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		WebElement norec = d.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
		
		/*String rec= norec.getText();
		if(rec.contains("records")) {
			System.out.println(rec);
		}
		else {
			System.out.println("empty");
		}*/
		
		if(norec.isDisplayed()) {
			System.out.println(norec.getText());
		}
		else {
			System.out.println("Record is present");
		}
		//Thread.sleep(5000);
		d.quit();
	}

}

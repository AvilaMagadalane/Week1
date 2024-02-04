package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();
		d.findElement(By.id("username")).sendKeys("demosalesmanager");
		d.findElement(By.id("password")).sendKeys("crmsfa");
		d.findElement(By.className("decorativeSubmit")).click();
		d.findElement(By.id("label")).click();
		d.findElement(By.className("sectionTabButtonSelected")).click();
		d.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		d.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLead");
		d.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Avila");
		d.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("V");
		d.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Avila_1");
		d.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		d.findElement(By.id("createLeadForm_description")).sendKeys("Selenium");
		d.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Test@gmail.com");
		d.findElement(By.xpath("//option[contains(text(),'New York')]")).click();
		d.findElement(By.name("submitButton")).click();
		//d.switchTo().alert().accept();
		//d.findElement(By.xpath("//a[text()='Edit']")).click();
		//Thread.sleep(5000);
		//d.findElement(By.xpath("//a[@class='subMenuButton'][text()='Edit']")).click();
		d.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		d.findElement(By.name("description")).clear();
		WebElement updateCN=d.findElement(By.id("updateLeadForm_companyName"));
		updateCN.clear();
		updateCN.sendKeys("Test");
		WebElement updateFN=d.findElement(By.id("updateLeadForm_firstName"));
		updateFN.clear();
		updateFN.sendKeys("Test");
		WebElement updateLN=d.findElement(By.id("updateLeadForm_lastName"));
		updateLN.clear();
		updateLN.sendKeys("Test");
		d.findElement(By.name("submitButton")).click();
		System.out.println(d.getTitle());
		
		
		Thread.sleep(5000);
		d.quit();

	}

}

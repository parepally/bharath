import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Additional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bharath\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		//driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.id("checkBoxOption3")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());	
	        //driver.findElement(By.xpath("(//span[@class='airport-code d-block'])[2]")).click();
        //driver.findElement(By.xpath("(//input[@id='search_input'])[2]")).sendKeys("John f kennedy");
	    /*driver.findElement(By.id("selectTripType-val")).click();
	    driver.findElement(By.id("ui-list-selectTripType2")).click();
	    driver.findElement(By.xpath("//*[@id='passengers-val']")).click();
	    driver.findElement(By.id("ui-list-passengers3")).click();
	   // driver.close();*/
	    
	
	}
}
package Tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends DefaultTest{


	
	
  @Test(priority=1)
  public void shouldLoginAsUser() {
	  
	  
	  driver.findElement(By.id("email")).sendKeys("administrator@testarena.pl");
	  driver.findElement(By.id("password")).sendKeys("sumXQQ72$L");
	  driver.findElement(By.id("login")).click();
	  
	  assertEquals(driver.getTitle(), "Cockpit - TestArena");
	  System.out.println("Poprawne zalogowanie");
	  
  }
  
  @Test(priority=2)
  public void shouldLoginWithFakePassword() {
	  driver  = new ChromeDriver();
	  
	  driver.get("http://demo.testarena.pl/zaloguj");
	  
	  driver.findElement(By.id("email")).sendKeys("administrator@testarena.pl");
	  driver.findElement(By.id("password")).sendKeys("1212212$L");
	  driver.findElement(By.id("login")).click();
	  
	  assertEquals(driver.getTitle(), "Kokpit - TestArena Demo");
	  System.out.println("Niepoprawnw zalogowanie - bad passwd");
	  
  }

  

}

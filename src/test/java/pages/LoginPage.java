package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
								//VARIÁVEIS
	
	//Botões
	
	final String btnRealizarLogin = "//a[normalize-space()='Signup / Login']";
	final String btnLogin = "//button[@data-qa='login-button']";
	
	//Campos
	
	final String inptEmail = "//input[@data-qa='login-email']";
	final String inptSenha = "//input[@placeholder='Password']";
	
	//Valores
	final String vlEmail = "rayssa.ribemboim@gmail.com";
	final String vlSenha = "123456";
	
	
	
								//MÉTODOS
	
	public void realizarLogin() {
		
		driver.findElement(By.xpath(btnRealizarLogin)).click();
		driver.findElement(By.xpath(inptEmail)).sendKeys(vlEmail);
		driver.findElement(By.xpath(inptSenha)).sendKeys(vlSenha);
		driver.findElement(By.xpath(btnLogin)).click();
			
		
	}
	
}

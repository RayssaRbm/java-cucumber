package pages;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import junit.framework.Assert;



public class NovoUsuarioPage {

	
	WebDriver driver;
	
	public NovoUsuarioPage(WebDriver driver) {
		this.driver = driver;
	}
	
								//VARIÁVEIS
	
	//Botões
	
	final String btnRealizarLogin = "//a[normalize-space()='Signup / Login']";
	final String btnSeguirCadastro = "//button[@data-qa='signup-button']";
	final String btnPais = "//select[@id='country']";
	final String btnCriarConta = "(//button[@data-qa='create-account'])[1]";
	 
	//Campos
	
	final String inptName = "//input[@placeholder='Name']";
	final String inptEmail = "//input[@data-qa='signup-email']";
	final String inptGenero = "//input[@id='id_gender1']";
	final String inptSenha = "//input[@id='password']";
	final String inptPrimeiroNome = "//input[@id='first_name']";
	final String inptUltimoNome = "//input[@id='last_name']";
	final String inptEndereco = "//input[@id='address1']";
	final String inptCep = "(//input[@id='zipcode'])[1]";
    final String inptTelefone = "(//input[@id='mobile_number'])[1]";
    final String inptEstado = "(//input[@id='state'])[1]";
	final String inptCidade = "(//input[@id='city'])[1]";
   
	
	//Valores
		
	final String vlNome = "Novo Usuário" + " " + getSaltString();
	final String vlEmail = getSaltString()+"@gmail.com";
	final String vlPais = "(//option[@value='United States'])[1]";
	
	
	
    							//MÉTODOS
	
	
	protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { 
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	protected String getSaltNumber() {
        String SALTCHARS = "0123456789";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) { 
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	
	public void solicitarCadastro() {
		
		driver.findElement(By.xpath(btnRealizarLogin)).click();
		driver.findElement(By.xpath(inptName)).sendKeys(vlNome);
		driver.findElement(By.xpath(inptEmail)).sendKeys(vlEmail);
		driver.findElement(By.xpath(btnSeguirCadastro)).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	
	
	public void novoCadastro(){
		
		
		driver.findElement(By.xpath(inptGenero)).click();
		driver.findElement(By.xpath(inptSenha)).sendKeys(getSaltString());
		driver.findElement(By.xpath(inptPrimeiroNome)).sendKeys(getSaltString());
		driver.findElement(By.xpath(inptUltimoNome)).sendKeys(getSaltString());
		driver.findElement(By.xpath(inptEndereco)).sendKeys(getSaltString());
		driver.findElement(By.xpath(btnPais)).click();
		driver.findElement(By.xpath(vlPais)).click();
		driver.findElement(By.xpath(inptEstado)).sendKeys(getSaltString());
		driver.findElement(By.xpath(inptCidade)).sendKeys(getSaltString());
		driver.findElement(By.xpath(inptCep)).sendKeys(getSaltNumber());
		driver.findElement(By.xpath(inptTelefone)).sendKeys(getSaltNumber());
		driver.findElement(By.xpath(btnCriarConta)).click();
		
		
	}
	
	public void sucessoCadastro() {
		
		String textoElement = driver.findElement(By.xpath("//section[@id='form']//p[1]")).getText();
		Assert.assertEquals("Congratulations! Your new account has been successfully created!", textoElement);
		
		
	}
	
}

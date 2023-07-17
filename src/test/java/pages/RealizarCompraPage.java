package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import junit.framework.Assert;


public class RealizarCompraPage {
	
	WebDriver driver;
		
	public RealizarCompraPage(WebDriver driver) {
		this.driver = driver;
	}
	
							//VARIÁVEIS 
	
	
	//Botões
	
	final String btnSelecionarVestido = "(//a[contains(text(),'Add to cart')])[7]";
	final String btnSelecionarSari = "(//a[contains(text(),'Add to cart')])[63]";
	final String btnSelecionarCamiseta = "(//a[contains(text(),'Add to cart')])[3]";
	final String btnContinueComprando = "(//button[@data-dismiss='modal'])[1]";
	final String btnCarrinho = "(//a)[4]";
	final String btnProcessarCompra = "//body/section[@id='cart_items']/div/section[@id='do_action']/div/div/div/a[1]";
	final String btnSeguirCompra = "(//a[normalize-space()='Place Order'])[1]";
	final String btnFinalizarCompra = "(//button[@id='submit'])[1]";
	final String btnVoltarHome = "(//a[@data-qa='continue-button'])[1]";	
		
	//Campos
	
	final String inptCartaoNome = "(//input[@data-qa='name-on-card'])[1]";
	final String inptCartaoNumero = "(//input[@data-qa='card-number'])[1]";
	final String inptCartaoCodigo = "//input[@placeholder='ex. 311']";
	final String inptCartaoMesVenc = "(//input[@placeholder='MM'])[1]";
	final String inptCartaoAnoVenc = "(//input[@placeholder='YYYY'])[1]";
		
		
	//Valores
	
	final String vlCartaoNome = "RAYSSA RIBEMBOIM";
	final String vlCartaoNumero = "1234567890";
	final String vlCartaoCodigo = "123";
	final String vlCartaoMesVenc = "20";
	final String vlCartaoAnoVenc = "2024";
	
	
	
								//MÉTODOS
	
		
	public void selecionarItens() {
		
		driver.findElement(By.xpath(btnSelecionarVestido)).click();
		driver.findElement(By.xpath(btnContinueComprando)).click();
		driver.findElement(By.xpath(btnSelecionarVestido)).click();
		driver.findElement(By.xpath(btnContinueComprando)).click();
		driver.findElement(By.xpath(btnSelecionarVestido)).click();
		driver.findElement(By.xpath(btnContinueComprando)).click();
		driver.findElement(By.xpath(btnSelecionarSari)).click();
		driver.findElement(By.xpath(btnContinueComprando)).click();
		driver.findElement(By.xpath(btnSelecionarSari)).click();
		driver.findElement(By.xpath(btnContinueComprando)).click();
		driver.findElement(By.xpath(btnSelecionarCamiseta)).click();
		driver.findElement(By.xpath(btnCarrinho)).click();
		driver.findElement(By.xpath(btnProcessarCompra)).click();
		driver.findElement(By.xpath(btnSeguirCompra)).click();
		
		//Fechar popup Google Vignette
		driver.get("https://automationexercise.com/payment");
		
		
		
	}
	
	public void finalizarCompra() {
		
		driver.findElement(By.xpath(inptCartaoNome)).sendKeys(vlCartaoNome);
		driver.findElement(By.xpath(inptCartaoNumero)).sendKeys(vlCartaoNumero);
		driver.findElement(By.xpath(inptCartaoCodigo)).sendKeys(vlCartaoCodigo);
		driver.findElement(By.xpath(inptCartaoMesVenc)).sendKeys(vlCartaoMesVenc);
		driver.findElement(By.xpath(inptCartaoAnoVenc)).sendKeys(vlCartaoAnoVenc);
		driver.findElement(By.xpath(btnFinalizarCompra)).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		String textoElement = driver.findElement(By.xpath("//section[@id='form']//div//div//div//p")).getText();
		Assert.assertEquals("Congratulations! Your order has been confirmed!", textoElement);
		driver.findElement(By.xpath(btnVoltarHome)).click();
		
		
	}
}
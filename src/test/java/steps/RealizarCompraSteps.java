package steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.RealizarCompraPage;
import pages.LoginPage;



public class RealizarCompraSteps {
	
	WebDriver driver;
	
	@Before
	public void before() {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After
	public void afterScenario(){
	        if(driver != null){
	            driver.close();
	            driver.quit();
	            driver = null;
	        }
	    }

	@Dado("que o usuário realize o login no ecommerce: {string}")
	public void Login (String url) {
	    driver.get(url);
	    
	    LoginPage Logar = new LoginPage(driver);
	    Logar.realizarLogin();
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	}

	@Quando("todos os produtos forem incluídos no carrinho")
	public void incluirItens () {
	 	   RealizarCompraPage IncluirItens = new RealizarCompraPage(driver);
	 	   IncluirItens.selecionarItens();
	}

	@Então("finalizo a compra com sucesso")
	public void finalizarCompra() {
		RealizarCompraPage FinalizarCompra = new RealizarCompraPage(driver);
		FinalizarCompra.finalizarCompra();
	}
	
	
}

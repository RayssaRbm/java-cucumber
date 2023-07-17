package steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.NovoUsuarioPage;



public class CadastroSteps {
	
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
	
	@Dado("que acesso o ecommerce: {string}")
	public void acessarPagina(String url) {
		driver.get(url);
				
	}
	
	
	@Quando("solicito um novo cadastro")
	public void solicitarCadastro() {
		
		NovoUsuarioPage novoUsuario = new NovoUsuarioPage(driver);
		novoUsuario.solicitarCadastro();
	    
	}
	
	@E("preencho os dados necessários")
	public void incluirDados() {
		
		NovoUsuarioPage PreencherDados = new NovoUsuarioPage(driver);
		PreencherDados.novoCadastro();
	    
	}

	@Então("usuário é cadastrado com sucesso")
	public void finalizarCadastro() {
		
		NovoUsuarioPage CadastroConcluido = new NovoUsuarioPage(driver);
		CadastroConcluido.sucessoCadastro();
	    
	}


}

package frame.web.metodos;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MetodosTeste {
	
	WebDriver driver;
	/**
	 * @author ROQUE CHIMULL
	 * @metodo abrir navegador
	 * @param site
	 */
	public void abrirNavegador(String site) {
		
		try {
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get(site);
		driver.manage().window().maximize();
		}catch (Exception e) {
			System.out.println("____error____ao tentar abrir navegador " +e.getMessage());
		}
	}
	/**
	 * Metodo clicar em um elemento
	 * @param element
	 */
	public void clicar(By element) {
		try {
			driver.findElement(element).click();
		}catch (Exception e) {
			System.out.println("____error____ao tentar clicar no elemento " +e.getMessage());
		}
	}
	
	/**
	 * Metodo preencher texto no elemento
	 * @param element
	 * @param texto
	 */
	public void preencher() {
		
		try {
			driver.navigate().to("about:blank");
			
		}catch (Exception e) {
			System.out.println("____error____ao tentar preencher " +e.getMessage());
		}
	}
	/**
	 * Metodo dar enter no elemento
	 * @param elemento
	 */
	public void submit(By elemento) {
		try {
			driver.findElement(elemento).submit();
		}catch (Exception e) {
			System.out.println("____error____ao tentar dar enter" +e.getMessage());
		}
	}
	public void fecharNavegador() {
		try {
			driver.quit();
		
	}catch (Exception e) {
		System.out.println("____error____ao tentar fechar navegador" +e.getMessage());
	}
	
	}
	
	/**
	 * Metodo para aguardar elemento ser clicável
	 * @param elemento
	 */
	public void aguardarElemento(By elemento) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		}catch (Exception e) {
			System.out.println("____error____elemento não visivel" +e.getMessage());
		}
		
	}
	/**
	 * @param tempo
	 */
	public void pausar(int tempo) {
		try {
			Thread.sleep(tempo);
		}catch (Exception e) {
			System.out.println("____error____ao pausar o teste" +e.getMessage());
		}
	}
/**
 * metodo para tirar screenShot da tela
 * @param screen Shot
 * 
 */
public void screenShot (String nome) {
	try {
		
		TakesScreenshot scrShot = (TakesScreenshot) (driver);
		File scrfile = scrShot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./evidencias/" +nome+ ".png");
		FileUtils.copyFile(scrfile, destfile);
		
	}catch (Exception e) {
		System.out.println("____error____na evidencia" +e.getMessage());
	}
}

}

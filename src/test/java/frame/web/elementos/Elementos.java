package frame.web.elementos;

import org.openqa.selenium.By;

public class Elementos {

	
	private By pesquisar = By.xpath("/html/body/form[1]/div/center/table/tbody/tr/td/table[2]/tbody/tr[2]/td/div/center/a/img");
public By click = By.xpath("/html/body/form/input");
	public By getPesquisar() {
		return pesquisar;
	}
}

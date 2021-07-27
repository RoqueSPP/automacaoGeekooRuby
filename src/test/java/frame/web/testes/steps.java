package frame.web.testes;

import frame.web.elementos.Elementos;
import frame.web.metodos.MetodosTeste;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
MetodosTeste metodo = new MetodosTeste();
Elementos el = new Elementos();



	@Given("eu esteja no google")
	public void eu_esteja_no_google() {
	  metodo.abrirNavegador("https://www.google.com.br");
	}

	@When("pesquisar {string}")
	public void pesquisar(String string) throws InterruptedException {
		metodo.clicar(el.getPesquisar());

	}

	@Then("valido o texto {string}")
	public void valido_o_texto(String string) {
	    metodo.screenShot("ok");
	}
}

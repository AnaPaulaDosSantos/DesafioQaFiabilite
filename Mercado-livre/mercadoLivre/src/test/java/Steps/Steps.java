package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps {
	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String url) throws Throwable {
		m.ExecutarNavegador(url);
	}

	@And("^digite na barra de pesquisa \"([^\"]*)\"$")
	public void digite_na_barra_de_pesquisa(String Iten) throws Throwable {
		m.pausa(2000);
		m.preencher(e.getCampoDePesquisa(), Iten);
		
		

	}

	@And("^click na Lupa de Pesquisa$")
	public void click_na_Lupa_de_Pesquisa() throws Throwable {
		m.clicar(e.getLupaDePesquisa());
	}

	@Then("^valide o iten pesquisado \"([^\"]*)\"$")
	public void valide_o_iten_pesquisado(String ItenPesquisado) throws Throwable {
		m.pausa(2000);
		m.validarTexto(ItenPesquisado, e.getCampoValidarPesquisa());
	}

	@And("^selecione o produto$")
	public void selecione_o_produto() throws Throwable {
      m.clicar(e.getSelecionaIten());
      m.pausa(2000);

	}

	@And("^selecione adicionar à sacola$")
	public void selecione_adicionar_à_sacola() throws Throwable {
		m.clicar(e.getBtnAdicioarASacola());
	}

	@Then("^valide o iten adicionado na sacola\"([^\"]*)\"$")
	public void valide_o_iten_adicionado_na_sacola(String itenSacola) throws Throwable {
		m.pausa(5000);
		m.validarTexto(itenSacola, e.getValidarItenNaSacola());
	}

}

package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By campoDePesquisa = By.id("input-search");
	private By lupaDePesquisa = By.cssSelector("#search-container > div > svg");
	private By campoValidarPesquisa =  By.cssSelector("#__next > div > main > section:nth-child(5) > div.sc-dFtzxp.iTebDB > div > h1");
	private By selecionaIten = By.cssSelector("#__next > div > main > section:nth-child(5) > div.sc-dFtzxp.bESJXZ > div > ul > li:nth-child(1) > a > div.sc-jSYIrd.cUpzpi > img");
	private By pegarItenParaValidção = By.cssSelector("body > div.wrapper__main > div.wrapper__content.js-wrapper-content > div.wrapper__control > div.header-product.js-header-product > h1");
	private By btnAdicioarASacola = By.cssSelector("#__next > div > main > section:nth-child(6) > div.sc-eCImPb.DcfVk > div > button > label");
	private By validarItenNaSacola = By.cssSelector("#root > div > div.App.clearfix > div > div:nth-child(2) > div > div.BasketTable > div.BasketTable-items > div > div > div.BasketItemProduct > div > a > p:nth-child(1)");
	public By getCampoDePesquisa() {
		return campoDePesquisa;
	}
	public By getLupaDePesquisa() {
		return lupaDePesquisa;
	}
	public By getCampoValidarPesquisa() {
		return campoValidarPesquisa;
	}
	public By getSelecionaIten() {
		return selecionaIten;
	}
	public By getPegarItenParaValidção() {
		return pegarItenParaValidção;
	}
	public By getBtnAdicioarASacola() {
		return btnAdicioarASacola;
	}
	public By getValidarItenNaSacola() {
		return validarItenNaSacola;
	}
	

}

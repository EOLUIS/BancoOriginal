package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]");
	private By btnAbrirContaParaVoce = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("telefone");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	private By textoFaltaPouco = By.xpath("//*[@id=\"pu-modalSucesso\"]/div/div[1]/p/span[1]");
	private By btnAbrirContaParaSuaEmpresa = By.id("bt2");
	private By btnAbrirContaEmpresa = By.id("btnContatoForm");
	private By campoNomePJ = By.xpath("//*[@id=\"nome\"]");
	private By campoCelularPJ = By.xpath("//*[@id=\"telefone\"]");
	private By campoEmailPJ = By.xpath("//*[@id=\"email\"]");
	private By campoCNPJPJ = By.xpath("//*[@id=\"cnpj\"]");
	private By btnQueroSerClientePJ = By.xpath("//*[@id=\"btnEnviar\"]");
	private By textoSucesso = By.xpath("//*[@id=\"pu-modalSucessoCNPJ\"]/div/div[1]/p/span[1]");
	private By btnDoCokke = By.id("onetrust-accept-btn-handler");

	public By getBtnDoCokke() {
		return btnDoCokke;
	}

	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}

	public void getTextoFaltaPouco(By textoFaltaPouco) {
		this.textoFaltaPouco = textoFaltaPouco;
	}

	public By getTextoSucesso() {
		return textoSucesso;
	}

	public void getTextoSucesso(By textoSucesso) {
		this.textoSucesso = textoSucesso;
	}


	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getBtnAbrirContaParaVoce() {
		return btnAbrirContaParaVoce;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoTelefone() {
		return campoTelefone;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}

	public By getBtnAbrirContaParaSuaEmpresa() {
		return btnAbrirContaParaSuaEmpresa;
	}

	public By getBtnAbrirContaEmpresa() {
		return btnAbrirContaEmpresa;
	}

	public By getCampoNomePJ() {
		return campoNomePJ;
	}

	public By getCampoCelularPJ() {
		return campoCelularPJ;
	}

	public By getCampoEmailPJ() {
		return campoEmailPJ;
	}

	public By getCampoCNPJPJ() {
		return campoCNPJPJ;
	}

	public By getBtnQueroSerClientePJ() {
		return btnQueroSerClientePJ;
	}
}

package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class KeepNotes {
	
	public KeepNotes(AppiumDriver<?> driver) {	
	 	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
		
	@AndroidFindBy(id = "com.google.android.keep:id/new_note_button")
	private MobileElement adicionarAnotacao;
	
	@AndroidFindBy(accessibility = "Open navigation drawer")
	private MobileElement adicionarNovaAnotacao;
	
	@AndroidFindBy(id = "com.google.android.keep:id/edit_note_text")
	private MobileElement campoAnotacao;
	
	@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
	private MobileElement campoTitulo;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Titulo da anotacao']")
	private MobileElement acessarCampoParaEditar;
	
	@AndroidFindBy(id = "com.google.android.keep:id/edit_note_text")
	private MobileElement acessarCampoAnotacaoParaEditar;
	
	@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
	private MobileElement acessarCampoTituloParaEditar;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Titulo da anotacao editada!']")
	private MobileElement acessarCampoParaAgendar;
	
	@AndroidFindBy(id = "com.google.android.keep:id/menu_reminder")
	private MobileElement botaoAgendamento;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pick a date & time']")
	private MobileElement acessarMenuDateTime;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='March 20']")
	private MobileElement acessarCampoDia;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Does not repeat']")
	private MobileElement acessarCampoRepeticao;
	
	@AndroidFindBy(id = "com.google.android.keep:id/save")
	private MobileElement botaoSalvarAgendamento;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Titulo da anotacao editada!']")
	private MobileElement acessarCampoParaExcluir;
	
	@AndroidFindBy(id = "com.google.android.keep:id/bs_action_button")
	private MobileElement botaoConfiguracoes;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete']")
	private MobileElement campoDelete;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Note moved to trash']")
	private MobileElement verificarTexto;
	

	
	public void acessarBotaoNovaAnotacao() throws Exception {
		adicionarAnotacao.click();
	}
	
	public void escreverCampoAnotacao(String anotacao) throws Exception {
		campoAnotacao.click();
		campoAnotacao.sendKeys(anotacao);
	}
	
	public void escreverTituloAnotacao(String titulo) throws Exception {
		campoTitulo.click();
		campoTitulo.sendKeys(titulo);
	}
	
	public void adicionarNovaAnotacao() throws Exception {
		adicionarAnotacao.click();
		Thread.sleep(3000);
	}
	
	// Editar
	
	public void acessarCampoParaEditar() throws Exception {
		acessarCampoParaEditar.click();
	}
	
	public void editarCampoAnotacao(String anotacao) throws Exception {
		acessarCampoAnotacaoParaEditar.click();
		acessarCampoAnotacaoParaEditar.sendKeys(anotacao);
	}
	
	public void editarTituloAnotacao(String titulo) throws Exception {
		acessarCampoTituloParaEditar.click();
		acessarCampoTituloParaEditar.sendKeys(titulo);
	}
	
	public void adicionarAnotacaoEditada() throws Exception {
		adicionarAnotacao.click();
		Thread.sleep(3000);
	}
	
	//Agendar
	
	public void acessarCampoParaAgendar() throws Exception {
		acessarCampoParaAgendar.click();
	}
	
	public void acessarBotaoAgendamento() throws Exception {
		botaoAgendamento.click();
	}
	
	public void editarAgendamento(String dia, String repeticao) throws Exception {
		acessarMenuDateTime.click();
		acessarCampoDia.click();;
		MobileElement clickDia = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='"+dia+"']"));
		clickDia.click();
		acessarCampoRepeticao.click();
		MobileElement clickRepeticao = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='"+repeticao+"']"));
		clickRepeticao.click();
	}
	
	
	public void salvarAgendamento() throws Exception {
		botaoSalvarAgendamento.click();
		adicionarAnotacao.click();
		Thread.sleep(3000);
	}
	
	//Excluir
	
	public void acessarCampoParaExcluir() throws Exception {
		acessarCampoParaExcluir.click();
	}
	
	public void acessarBotaoConfiguracoes() throws Exception {
		botaoConfiguracoes.click();
	}
	
	public void acessarCampoDelete() throws Exception {
		campoDelete.click();
	}
	
	public void verificarExclusao() throws Exception {
		assertEquals("Note moved to trash", verificarTexto.getText());
		Thread.sleep(3000);
	}
	

}

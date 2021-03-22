package steps;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.KeepNotes;

public class KeepNotesSteps {
	
	KeepNotes k = new KeepNotes(driver);
	
	//ETAPA ADICIONAR

	@Dado("que o usuario clique para adicionar uma nova anotacao")
	public void queOUsuarioCliqueParaAdicionarUmaNovaAnotacao() throws Exception {
		k.acessarBotaoNovaAnotacao();
	}

	@Quando("o usuario digitar sua anotacao com {string}")
	public void oUsuarioDigitarSuaAnotacaoCom(String string) throws Exception {
		k.escreverCampoAnotacao(string);
	}

	@Quando("configurar um titulo da anotacao com {string}")
	public void configurarUmTituloDaAnotacaoCom(String string) throws Exception {
		k.escreverTituloAnotacao(string);
	}

	@Entao("o app adiciona um novo lembrete de anotacao.")
	public void oAppAdicionaUmNovoLembreteDeAnotacao() throws Exception {
		k.adicionarNovaAnotacao();
	}
	
	//ETAPA EDITAR

	@Dado("que o usuario clique na anotacao para editar")
	public void queOUsuarioCliqueNaAnotacaoParaEditar() throws Exception {
		k.acessarCampoParaEditar();
	}

	@Quando("o usuario editar o campo anotacao com {string}")
	public void oUsuarioEditarOCampoAnotacaoCom(String string) throws Exception {
		k.editarCampoAnotacao(string);
	}

	@Quando("editar o titulo da anotacao com {string}")
	public void editarOTituloDaAnotacaoCom(String string) throws Exception {
		k.editarTituloAnotacao(string);
	}

	@Entao("o app edita a anotacao.")
	public void oAppEditaAAnotacao() throws Exception {
		k.adicionarAnotacaoEditada();
	}
	
	//ETAPA AGENDAR

	@Dado("que o usuario clique na anotacao para agendar")
	public void queOUsuarioCliqueNaAnotacaoParaAgendar() throws Exception {
		k.acessarCampoParaAgendar();
	}

	@Quando("o usuario clicar no botao de agendamento")
	public void oUsuarioClicarNoBotaoDeAgendamento() throws Exception {
		k.acessarBotaoAgendamento();
	}

	@Quando("editar o agendamento para {string}, {string}")
	public void editarOAgendamentoPara(String string, String string2) throws Exception {
		k.editarAgendamento(string, string2);
	}

	@Entao("o app agenda a anotacao.")
	public void oAppAgendaAAnotacao() throws Exception {
		k.salvarAgendamento();
	}
	
	//ETAPA EXCLUIR
	
	@Dado("que o usuario clique na anotacao para excluir")
	public void queOUsuarioCliqueNaAnotacaoParaExcluir() throws Exception {
		k.acessarCampoParaExcluir();
	}

	@Quando("o usuario clicar no botao configuracoes")
	public void oUsuarioClicarNoBotaoConfiguracoes() throws Exception {
		k.acessarBotaoConfiguracoes();
	}

	@Quando("clique na opcao delete")
	public void cliqueNaOpcaoDelete() throws Exception {
		k.acessarCampoDelete();
	}

	@Entao("o app exclui a anotacao.")
	public void oAppExcluiAAnotacao() throws Exception {
		k.verificarExclusao();
	}


	
}

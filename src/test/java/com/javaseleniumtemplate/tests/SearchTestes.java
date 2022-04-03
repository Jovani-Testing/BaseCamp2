package com.javaseleniumtemplate.tests;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.SearchPage;
import org.junit.Assert;
import org.junit.Test;

public class SearchTestes extends TestBase {

    //Objects
    LoginPage loginPage;
    SearchPage searchPage;

    //Tests
    @Test
    public void preencherRelatorio() {

        //Objects instances
        loginPage  = new LoginPage();
        searchPage = new SearchPage();

        //Parameteres
        String usuario = "jovani.custodio";
        String senha   = "TestesBase2";
        String plataforma= "Web";
        String ordemServico= "01";
        String resumo ="Projeto final Base2Camp.";
        String descicao= "Projeto final Base2Camp, com entrega para dia  04/04/2022 ," +
                         "onde será realizado alguns cenários de automação da plataforma mantis.";
        String cenarios="Cinco casos de testes automatizados para os cenários Mantis";
        String informacoesAdicionais="Foi uma honra participar do curso, infelizmente " +
                         "não pude aproveitar mias e me aprofundar nos testes, pois minha filhinha nasceu nesse meio tempo," +
                         "sendo assim, foi por um bom motivo.Toda a equipe está de parabéns, muito obrigado.";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
        searchPage.acessarRelatorio();
        searchPage.selecionarProjeto();
        searchPage.selecionarCategoria();
        searchPage.selecionarTeste();
        searchPage.selecionarReprodutibilidade();
        searchPage.selecionarGravidade();
        searchPage.selecionarPrioridade();
        searchPage.selecionarPerfil();
        searchPage.selecionarPlataforma(plataforma);
        searchPage.informarOdemDeServico(ordemServico);
        searchPage.selecionarAdmnistrador();
        searchPage.adicionarResumo(resumo);
        searchPage.adicionarDescricao(descicao);
        searchPage.informarCasosDeTestes(cenarios);
        searchPage.relatarInformacoesAdicionais(informacoesAdicionais);
        searchPage.enviarRelatorio();

    }
}

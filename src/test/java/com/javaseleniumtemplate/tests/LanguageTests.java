package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LanguagePage;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.SearchPage;
import org.junit.Test;

public class LanguageTests extends TestBase {

    //Objects
    LoginPage loginPage;
    SearchPage searchPage;
    LanguagePage languagePage;

    //Tests
    @Test
    public void alterarLinguagem() {

        //Objects instances
        loginPage    = new LoginPage();
        searchPage   = new SearchPage();
        languagePage = new LanguagePage();

        //Parameteres
        String usuario = "jovani.custodio";
        String senha   = "TestesBase2";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
        languagePage.acessarMinhaConta();
        languagePage.acessarPreferencias();
        languagePage.escolherLinguagem();
        languagePage.atualizarPerfil();
    }
}
package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LanguagePage  extends PageBase {

    //Mapping
    By myAccont    = By.xpath("/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[1]/a[8]");
    By preferences = By.xpath("(//a[normalize-space()='Preferências'])[1]");
    By language    = By.xpath("//option[@value='portuguese_brazil']");
    By updatePrefs = By.xpath("/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[18]/td[1]/input[1]");

    //Actions
    public void acessarMinhaConta() {click(myAccont);}

    public void acessarPreferencias() {click(preferences);}

    public void escolherLinguagem() {click(language);}

    public void atualizarPerfil() {click(updatePrefs);}


}







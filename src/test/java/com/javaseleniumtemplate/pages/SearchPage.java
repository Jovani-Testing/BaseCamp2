package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class SearchPage extends PageBase {


    //Mapping
    By usuarioAcesso = By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]");
    By reportIssue = By.xpath("/html/body/table[2]/tbody/tr/td[1]/a[3]");
    By selectProject= By.xpath("/html/body/div[2]/form/table/tbody/tr[4]/td/input");
    By category = By.xpath("/html/body/div[2]/form/table/tbody/tr[2]/td[2]/select");
    By selecCategory = By.xpath("/html/body/div[2]/form/table/tbody/tr[2]/td[2]/select/option[20]");
    By reproducibility = By.xpath("/html/body/div[2]/form/table/tbody/tr[3]/td[2]/select/option[1]");
    By severity = By.xpath("/html/body/div[2]/form/table/tbody/tr[4]/td[2]/select/option[5]");
    By priority = By.xpath("/html/body/div[2]/form/table/tbody/tr[5]/td[2]/select/option[3]");
    By selectProfile = By.xpath("/html/body/div[2]/form/table/tbody/tr[6]/td[2]/select/option[2]");
    By plataform = By.xpath("//*[@id=\"platform\"]");
    By  service = By.xpath("/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[7]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]");
    By assignTo = By.xpath("/html/body/div[2]/form/table/tbody/tr[8]/td[2]/select/option[3]");
    By summary  = By.xpath("(//input[@name='summary'])[1]");
    By description =By.xpath("(//textarea[@name='description'])[1]");
    By testScenarios = By.xpath("(//textarea[@name='steps_to_reproduce'])[1]");
    By additionInformation = By.xpath("(//textarea[@name='additional_info'])[1]");
    By submitReport =By.xpath("(//input[@value='Submit Report'])[1]");


    //Actions
    public String validarAcesso() {
        return getText(usuarioAcesso);
    }

    public void acessarRelatorio() {
        click(reportIssue);
    }

    public void selecionarProjeto () {click(selectProject);}

    public void selecionarCategoria() {click(category);}

    public void selecionarTeste() {click(selecCategory );}

    public void selecionarReprodutibilidade() {click(reproducibility );}

    public void selecionarGravidade() {click(severity );}

    public void  selecionarPrioridade(){click(priority);}

    public void selecionarPerfil(){click(selectProfile);}

    public void selecionarPlataforma(String plataforma){sendKeys(plataform,plataforma);}

    public void informarOdemDeServico(String ordemServico){sendKeys(service,ordemServico);}

    public void selecionarAdmnistrador(){click(assignTo);}

    public void adicionarResumo(String resumo){sendKeys(summary,resumo);}

    public void adicionarDescricao(String descricao){sendKeys(description,descricao);}

    public void informarCasosDeTestes(String cenarios){sendKeys(testScenarios,cenarios);}

    public void relatarInformacoesAdicionais(String informacoesAdicionais){sendKeys(additionInformation,informacoesAdicionais);}

    public void  enviarRelatorio(){click(submitReport);}
    }





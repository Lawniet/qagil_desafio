package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.danilo.services.Configuracao;

public class CasoDeTeste3Steps {

    @Dado("fecho o popup")
    public void fecho_o_popup()throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='onetrust-close-btn-container']/button").click();

    }

    @Dado("clico no menu carreiras")
    public void clico_no_menu_carreiras() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='navigation-menu']/div[4]/div[1]/span").click();
    }

    @Dado("clico no item do menu vagas em tecnologia")
    public void clico_no_item_do_menu_vagas_em_tecnologia() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='primaryLink4_Carreiras']/div/div/ul/li[3]/ul/li[6]/a").click();
   
    }

    @Entao("devo ver o destaque em {string}")
    public void devo_ver_o_destaque_em(String string) {
        Configuracao.seletorQueryCss(".area-of-interest-title ");
        String frase = Configuracao.seletorQueryCss(".area-of-interest-title ").getText();
        assertEquals(frase, "Carreiras em tecnologia");
        Configuracao.fechar();
    }

    @Dado("digito no campo de busca {string}")
    public void digito_no_campo_de_busca(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Dado("clico no botao procurar")
    public void clico_no_botao_procurar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("devo encontrar vagas para programadores")
    public void devo_encontrar_vagas_para_programadores() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
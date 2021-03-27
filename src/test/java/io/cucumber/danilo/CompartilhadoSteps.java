package io.cucumber.danilo;

import io.cucumber.java.pt.*;
import io.cucumber.danilo.services.Configuracao;


public class CompartilhadoSteps {

    @Dado("que eu estou no site da Accenture")
    public void que_eu_estou_no_site_da_Accenture() {
        Configuracao.abrir("https://www.accenture.com/br-pt");
    }

    
}
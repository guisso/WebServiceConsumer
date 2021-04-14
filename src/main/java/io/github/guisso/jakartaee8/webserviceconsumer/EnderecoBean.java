package io.github.guisso.jakartaee8.webserviceconsumer;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Luis Guisso <luis.guisso at ifnmg.edu.br>
 */
@Named
@ViewScoped
public class EnderecoBean implements Serializable {

    private Integer cep;
    private Endereco endereco;

    public EnderecoBean() {
        endereco = new Endereco();
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
//</editor-fold>

    public String consultarCep() {
        System.out.println("CEP = " + cep);

        if (cep != null && cep.toString().length() == 8) {

            // CORRETO: viacep.com.br/ws/39404058/json/
            String resource = "https://viacep.com.br/ws";

            Client client = ClientBuilder.newClient();
            
            WebTarget target = client.target(resource)
                    .path("{cep}/json")
                    .resolveTemplate("cep", cep);
            
            Invocation.Builder builder 
                    = target.request(MediaType
                            .APPLICATION_JSON);
            
            Endereco e = builder.get(Endereco.class);
            System.out.println("=> " + e);
            
            setEndereco(e);
            
            client.close();
            
        } else {
            endereco = new Endereco();
        }

        return null;
    }

}

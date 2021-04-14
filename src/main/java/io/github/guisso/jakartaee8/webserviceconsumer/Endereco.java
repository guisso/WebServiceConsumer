package io.github.guisso.jakartaee8.webserviceconsumer;

/**
 *
 * @author Luis Guisso <luis.guisso at ifnmg.edu.br>
 */
public class Endereco {

//    {
//    "cep": "39404-058",
//    "logradouro": "Rua Dois",
//    "complemento": "",
//    "bairro": "Village do Lago I",
//    "localidade": "Montes Claros",
//    "uf": "MG",
//    "ibge": "3143302",
//    "gia": "",
//    "ddd": "38",
//    "siafi": "4865"
//  }
    private String cep;
    private String logradouro;
    private String complemento;
    private Integer numero;
    private String bairro;
    private String localidade;
    private String uf;
    private Integer ibge;
    private Byte ddd;
    private Short siafi;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public void setIbge(Integer ibge) {
        this.ibge = ibge;
    }

    public Byte getDdd() {
        return ddd;
    }

    public void setDdd(Byte ddd) {
        this.ddd = ddd;
    }

    public Short getSiafi() {
        return siafi;
    }

    public void setSiafi(Short siafi) {
        this.siafi = siafi;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Endereco{"
                + "cep=" + cep
                + ", logradouro=" + logradouro
                + ", complemento=" + complemento
                + ", numero=" + numero
                + ", bairro=" + bairro
                + ", localidade=" + localidade
                + ", uf=" + uf
                + ", ibge=" + ibge
                + ", ddd=" + ddd
                + ", siafi=" + siafi
                + '}';
    }

}

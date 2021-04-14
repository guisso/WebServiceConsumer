package io.github.guisso.jakartaee8.webserviceconsumer;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Luis Guisso <luis.guisso at ifnmg.edu.br>
 */
@FacesConverter(value = "cepConverter", managed = true)
public class CepConverter 
        implements Converter<Integer> {

    @Override
    public Integer getAsObject(
            FacesContext context, 
            UIComponent component, 
            String cep) {
        if (cep != null) {
            // CORRETO  : viacep.com.br/ws/39404058/json/
            // INCORRETO: viacep.com.br/ws/39.404-058/json/
            return Integer.parseInt(
                    cep
                    .replace(".", "")
                    .replace("-", "")
            );
        }
        return null;
    }

    @Override
    public String getAsString(
            FacesContext context, 
            UIComponent component, 
            Integer cep) {
        if (cep != null) {
            return cep.toString();
        }
        return null;
    }
    
}

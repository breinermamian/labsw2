/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central.negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Breiner Mamian
 */
public class GestorCiudadano {
    private List<Ciudadano> listado;

    public GestorCiudadano() {
        listado = new ArrayList();
        //inicializar();
    }
    
    public Ciudadano buscarCiudadano(String id) {
        for (Ciudadano ciu : listado) {
            if (ciu.getCedula().equals(id)) {
                return ciu;
            }
        }
        return null;
    }
    
}

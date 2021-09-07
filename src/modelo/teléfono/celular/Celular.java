/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.teléfono.celular;

/**
 *
 * @author Mariano
 */
public class Celular extends Dispositivo {

    private boolean encendido;
    public Bateria bat;
    public UnidadModular umodular;

    public void Encender() {

    }

    public void Apagar() {

    }
    
    public void Mostrarinfo(){
        
    }

    public Celular() {
        this.umodular = new UnidadModular();
    }

    public void colocar(Bateria objbateria) {
        this.bat = objbateria;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PatronCommand;

/**
 * @author Antonio Miguel Martel
 * Implementacion del patron command
 * La responzabilidad de esta interfaz es lanzar la lógica correpondiente
 * al pulsar un boton.
 */
public interface Command {
    
    public void execute();
    
}

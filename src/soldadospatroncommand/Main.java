/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldadospatroncommand;

/**
 * @author Antonio Miguel Martel
 */
public class Main {


    public static void main(String[] args) {
        //Activamos controlador
        KeyboardHandler keyboardHandler = new KeyboardHandler();
        
        //Nos metemos en el bucle del juego.
        while(true) {
            keyboardHandler.getInput();
            
        }
        
    }

}

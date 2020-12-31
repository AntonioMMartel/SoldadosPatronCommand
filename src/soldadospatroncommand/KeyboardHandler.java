/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldadospatroncommand;

/**
 * @author Antonio Miguel Martel
 * 
 * 
 * 
 */
public class KeyboardHandler {
    private final Button buttonW = new ButtonHandler("W");
    private final Button buttonA = new ButtonHandler("A");
    private final Button buttonS = new ButtonHandler("S");
    private final Button buttonD = new ButtonHandler("D");

    public KeyboardHandler() {
    }
    
    //Esto es horroroso. 
    //Se emplean consultas y son mejores disparadores (interrupciones)
    //Esto esta fijo y no se puede cambiar cuando quiera
    void getInput() {
        if (this.buttonW.isPressed()) moveUp();
        else if (this.buttonA.isPressed()) moveLeft();
        else if (this.buttonS.isPressed()) moveDown();
        else if (this.buttonD.isPressed()) moveRight();
    }
    
    
    //Es inteligente que el mando decida que pasa cuando se mueven los soladidots?
    // Por la carisima el mando tmb sabe 
    private void moveUp() {
        
    }

    private void moveDown() {
        
    }

    private void moveRight() {
    
    }

    private void moveLeft() {
    
    }
    
    
    
}

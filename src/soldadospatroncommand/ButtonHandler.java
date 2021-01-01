/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldadospatroncommand;

/**
 * @author Antonio Miguel Martel
 * 
 */
public class ButtonHandler implements Button {
    private final String ButtonId;
    
    
    public ButtonHandler(String ButtonId) {
        this.ButtonId = ButtonId;
    }
    
    @Override
    public boolean isPressed() {
        /* */
        return false;
    }
    
    
    
}

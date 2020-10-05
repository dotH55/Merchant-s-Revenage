/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merchantsrevenge;

public class Door {
    private String ID;
    private String direction;
    
    public Door(String ID, String direction){
        this.ID = ID;
        this.direction = direction;
    }
    public String getRoomID(){
        return ID;
    }
    
}

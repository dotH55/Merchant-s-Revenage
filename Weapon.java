/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merchantsrevenge;

/**
 *
 * @author Lleaf
 */
public class Weapon extends Item{
    
    private int damage;
    public Weapon(String ID, String name, String description, int buyPrice, int sellPrice, int damage){
        super(ID, name, description, buyPrice, sellPrice);
        this.damage = damage;
    }
    
    

   
    
}

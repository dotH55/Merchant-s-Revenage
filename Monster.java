/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merchantsrevenge;
import java.util.*;

public class Monster extends Character{
    
    private String description;
    private String name;
    
    private Item weapon;
    private Item shield;
    
    ArrayList<Item> dropList;
    ArrayList<Item> weaponList;
    
    public Monster(String ID, String name,String description, int health, int strength, 
            int agility, int magic, int stamina, int luck){
        super(ID, health, strength, agility, magic, stamina, luck);
    dropList = new ArrayList<>();
    weaponList = new ArrayList<>();
    weapon = null;
    shield = null;
    this.description = description;
    this.name = name;
    
    //Create All Monsters
    Monster M01 = new Monster("M01", "Goblin", "A low-life Goblin, "
            + "brandishing a weak looking dagger, comes charging at you", 10, 2, 2, 0, 1, 1);
    M01.addDrop(shield);
        
    }

    //Getters

    public String getDescription() {
        return description;
    }

    public ArrayList<Item> getDropList() {
        return dropList;
    }
    
    //Methods
    public void addDrop(Item i){
        dropList.add(i);
    }
    public void drop(Player p){
        for(int i = 0; i < dropList.size(); i++){
            p.addToInventory(dropList.remove(i));
        }
        
    }
    public void setWeapon(Weapon i){
        weapon = i;
    }
    public void setShield(Shield s){
        shield = s;
    }
}

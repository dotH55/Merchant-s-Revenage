/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merchantsrevenge;
import java.util.*;

public class Player extends Character{
    
    private ArrayList<Item> inventory;
    private int money;
    
    
    public Player(String ID, int health, int strength, int agility, int magic, int stamina, int luck, int money) {
        super(ID, health, strength, agility, magic, stamina, luck);
        this.money =  money;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int m){
        money = m;
    }
    public void sell(Item i){
        inventory.remove(i);
        setMoney(getMoney() + i.getBuyPrice());
    }
    public void buy(Item i){
        inventory.add(i);
        setMoney(getMoney() - i.getBuyPrice());
        
    }
    //Method for using Potions
    public void use(Potion p){
        super.setHealth(super.getHealth() + p.getHealth());
        super.setStrength(super.getStrength() + p.getStrength());
        super.setAgility(super.getAgility() + p.getAgility());
        super.setMagic(super.getMagic() + p.getMagic());
        super.setStamina(super.getStamina() + p.getStamina());
        super.setLuck(super.getLuck() + p.getLuck());
    }
    
    public void addToInventory(Item i){
        inventory.add(i);
    }
    
    //Method for combining Items
    public void conbine(Weapon w1, Weapon w2){
        if(w1.getName().equals("Sharp Stone") && w2.getName().equals("Wooden Stick")){
            Weapon WoodenSword = new Weapon("W01", "Wooden Sword", "Made of Sharp Stone & Wooden Stick", 0, 1, 5);
            inventory.remove(w1);
            inventory.remove(w2);
            inventory.add(WoodenSword);

        }else if(w1.getName().equals("Wooden Stick") && w2.getName().equals("Wooden Stick")){
            Potion potion = new Potion("W01", "Wooden Sword", "Great for healing minor injures", 3, 10, 2, 0, 0, 0, 0, 0);
            inventory.remove(w1);
            inventory.remove(w2);
            inventory.add(potion);
             
        }
        else if(w1.getName().equals("Wooden Stick") && w2.getName().equals("Lighter")){
            Artifact potion = new Artifact("W01", "Wooden Sword", "Great for healing minor injures", 3, 10, "Can be Used to burn something");
            inventory.remove(w1);
            inventory.remove(w2);
            inventory.add(potion);
             
        }
    }
        public void conbine(Weapon w1, Weapon w2, Weapon w3){
        if(w1.getName().equals("Flint") && w2.getName().equals("Sharp Stone") && w2.getName().equals("Wooden Stick")){
            Artifact potion = new Artifact("W01", "Wooden Sword", "Great for healing minor injures", 3, 10, "Can be Used to burn something");
            inventory.remove(w1);
            inventory.remove(w2);
            inventory.remove(w3);
            inventory.add(potion);
        }

    }
    
    
}

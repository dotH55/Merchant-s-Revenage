/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merchantsrevenge;

import java.util.*;
/**
 *
 * @author Lleaf
 */
public class Character {
    
    private String ID;
    private int health;
    private int strength;
    private int agility;
    private int magic;
    private int stamina;
    private int luck;

    ArrayList<Item> weaponList;
    
    public Character(String ID, int health, int strength, 
            int agility, int magic, int stamina, int luck){
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.magic = magic;
        this.stamina = stamina;
        this.luck = luck;
    }

    public String getID() {
        return ID;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getMagic() {
        return magic;
    }

    public int getStamina() {
        return stamina;
    }

    public int getLuck() {
        return luck;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }
    
    

    public ArrayList<Item> getWeaponList() {
        return weaponList;
    }
    
}

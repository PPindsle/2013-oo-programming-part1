/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TinaRam
 */
public class Bird {

    private String name;
    private String latin;
    private int timesObserved;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.timesObserved = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void birdObserved() {
        this.timesObserved++;
    }
    
    @Override
    public String toString() {
        return this.name +" ("+ this.latin +"): "+ this.timesObserved +" observations";
    }
    
    
}

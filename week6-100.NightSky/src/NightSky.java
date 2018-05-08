/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pernille
 */
import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int heigth;
    private int starsInLastPrint = 0;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.heigth = 10;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.heigth = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.heigth = height;
    }
    
    public void printLine() {
        Random rand = new Random();
        String line = "";
        for (int i = 0; i < this.width; i++) {
            if (rand.nextDouble() <= this.density) {
                line += "*";
                starsInLastPrint++;
            } else {
                line += " ";
            }
        }
        System.out.println(line);
    }
    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i < this.heigth; i++) {
            this.printLine();
        }
    }
    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}

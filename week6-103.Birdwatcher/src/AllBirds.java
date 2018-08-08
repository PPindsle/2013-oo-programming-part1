/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TinaRam
 */
import java.util.ArrayList;

public class AllBirds {

    private ArrayList<Bird> birds = new ArrayList<Bird>();

    // constructor
    public AllBirds() {

    }

    public void add(String name, String latin) {
        this.birds.add(new Bird(name, latin));
    }

    public void observation(String name) {

        for (Bird bird : birds) {

            if (bird.getName().contains(name)) {
                bird.birdObserved();
            }
        }

    }

    public void statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void findBird(String name) {

        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                System.out.println(bird);
            }
        }
    }

}

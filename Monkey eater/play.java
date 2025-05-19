
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends World
{  
    static Counter score = new Counter("Score: ");
    static Counter health = new Counter("Health: ");
    private int level = 1;

    /**
     * Constructor for objects of class play.
     */
    public play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        monyet monyet = new monyet();
        addObject(monyet, 129, 463);

        addObject(score, 40, 30);
        score.setValue(0);

        addObject(health, 260, 30);
        health.setValue(5);
    }

    public void act()
    {
        // Tambahkan pisang dan boom secara acak
        if (Greenfoot.getRandomNumber(100) < 2) {
            addObject(new pisang(), Greenfoot.getRandomNumber(300), 1);
        }
        if (Greenfoot.getRandomNumber(200) < 1) {
            addObject(new boom(), Greenfoot.getRandomNumber(300), 1);
        }

        // Cek kesehatan habis, pindah ke layar game over
        if (play.health.getValue() == 0) {
            Greenfoot.setWorld(new game_over());
        }

        // Cek skor untuk naik level
        if (score.getValue() >= 100 && level == 1) {
            level = 2;
            Greenfoot.setWorld(new level2());
        }

        // Cek skor untuk menang
        if (score.getValue() >= 200) {
            Greenfoot.setWorld(new win());
        }
    }
}

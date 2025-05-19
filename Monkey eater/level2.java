
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 2 of the game
 */
public class level2 extends World
{  
    static Counter score = play.score;
    static Counter health = play.health;

    public level2()
    {    
        super(300, 500, 1);
        prepare();
    }

    private void prepare()
    {
        monyet monyet = new monyet();
        addObject(monyet, 129, 463);

        addObject(score, 40, 30);
        addObject(health, 260, 30);
    }
    
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 2) {
            addObject(new pisang(), Greenfoot.getRandomNumber(300), 1);
        }
        if (Greenfoot.getRandomNumber(200) < 1) {
            addObject(new boom(), Greenfoot.getRandomNumber(300), 1);
        }

        if (health.getValue() == 0) {
            Greenfoot.setWorld(new game_over());
        }
    }
}

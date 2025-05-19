
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Winning screen of the game
 */
public class win extends World
{
    public win()
    {    
        super(300, 500, 1); 
        //showText("You Win!", 150, 250);

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        play_again play_again = new play_again();
        addObject(play_again,150,303);
        play_again.setLocation(161,408);
        play_again.setLocation(140,389);
        play_again.setLocation(145,395);
        menang menang = new menang();
        addObject(menang,141,259);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class monyet extends Actor
{
    public void act()
    {
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-5, getY());
        }
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+5, getY());
        }
        
        pisang a = (pisang)getOneIntersectingObject(pisang.class);
        if (a != null){
            getWorld().removeObject(a);
            play.score.add(10);
            Greenfoot.playSound("makan.mp3");

            // Tambahan: cek apakah skor sudah 200 atau lebih
            if (play.score.getValue() >= 200) {
                Greenfoot.setWorld(new win());
            }
        }
        
        boom b = (boom)getOneIntersectingObject(boom.class);
        if (b != null){
            getWorld().removeObject(b);
            play.health.add(-1);
            Greenfoot.playSound("enyah.mp3");
        }
    }
}
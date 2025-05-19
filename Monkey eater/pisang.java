import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pisang extends Actor
{
    public void act()
    {
        int speed = 1;
        if (getWorld() instanceof level2) {
            speed = 1; // Lebih cepat di level 2
        }

        setLocation(getX(), getY() + speed);

        if (isAtEdge()) {
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
        }
    }
}

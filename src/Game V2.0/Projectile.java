import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * In this sub class i've worked on the design of the bullet and also put in a function to make the bullet disapper when it hits the edge of the environment.
 * 
 * @author (Rayan Syed) 
 * @version (1)
 */
public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Projectile() //designing projectile
    {
        setImage(new GreenfootImage(10, 2));
        getImage().setColor(Color.BLACK);
        getImage().fillRect(0,0,10,2);
    }
    public void act() //removing projectile if they hit the edge of screen.
    {
        move(20);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}

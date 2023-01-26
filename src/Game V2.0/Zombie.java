import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * In this sub class i've worked on the function to check if zombie is eliminated, remove zombie out of the environment once it has been eliminated, the hits to eliminate zombie, and the design of the zombie.
 * 
 * @author (Rayan Syed) 
 * @version (1)
 */
public class Zombie extends Actor
{
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 2; //this is how many projectiles the zombie will take to die. Right now, zombies will be killed by 2 bullet.
    Player player;
    Counter counter;
     public Zombie(Player mainPlayer, Counter counter) //design of zombies
    {
        this.counter = counter;
        player = mainPlayer;
        setImage("skull.png");
        getImage().scale(50,50);
    }
    public void act()
    {
        moveAround();
        hitByProjectile();
    }
    public void moveAround()
    {
    move(1);
    turnTowards(player.getX(), player.getY());
    }
    public void hitByProjectile() //fuction to remove zombies from screen if they are hit by a projectile
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile != null)
        {
            health--;
            getWorld().removeObject(projectile);
        }
        if(health == 0) //checks if the zombie is killed so accordingly our score and cash increased.
        {
            counter.score++; 
            counter.money+=5; //5 points are added for every kill
            getWorld().removeObject(this);
        }
    }
}

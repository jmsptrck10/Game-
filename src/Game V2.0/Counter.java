import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A loop to count score, cash, money and time.
 * 
 * @author (James Patrick Arellano) 
 * @version (1)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //following will initialize all important parameters for the counter
    int score;
    int money;
    int time;
    int level = 1;
    public Counter() //counter display function on the world
    {
        setImage(new GreenfootImage("Your Score: " + score + "\n Your Cash: " + money + "\n Time: " + time/60 + "\n Level: " + level, 40, Color.BLACK, new Color (0,0,0,0)));
    }
    public void act()
    {
        time++;
        setImage(new GreenfootImage("Your Score: " + score + "\n Your Cash: " + money + "\n Time: " + time/60 + "\n Level: " + level, 40, Color.BLACK, new Color (0,0,0,0)));
        if((time/60) >= 60 && (time/60) < 120) //following code will check the time and change the level of the game
        {
            level = 2;
        }
        if((time/60) >= 120 && (time/60) < 180)
        {
            level = 3;
        }
        if((time/60) == 180) //after 3 minutes, game will end and the message will appear on the screen
        {
            getWorld().showText("Congratulations, You Win!", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop(); // this will stop the game
        }
    }
}

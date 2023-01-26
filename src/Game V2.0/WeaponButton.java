import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * In this sub class i've worked on the weapon upgrade functions, for example the design of the weapon upgrade button and also the function to adjust the cash and increase bullets when fire.
 * 
 * @author (Rayan Syed) 
 * @version (1)
 */
public class WeaponButton extends Actor
{
    /**
     * Act - do whatever the Weapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Counter counter;
    int weaponUpgrade = 1;
    public WeaponButton(Counter counter) //design of weaponUpgrade button
    {
        this.counter = counter;
        setImage("anchor.png");
        getImage().scale(50,50);
    }
    public void act() //function to check if we have clicked the upgrade weapon button and accordingly adjust the cash and increase firing projectiles
    {
        if(Greenfoot.mousePressed(this) && counter.money > 399)
        {
            counter.money = counter.money - 400;
            weaponUpgrade++;
        }
        if(weaponUpgrade >= 3) //if already at level 3, then weapon upgrade button will disappear. 
        {
            getWorld().removeObject(this);
        }
       
    }
}

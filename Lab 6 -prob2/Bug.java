import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*
 * Add another Animal of your choosing (I will call it a Bug) that will move more quickly/randomly,
 * eat the lettuce (to steal from the turtle), but will not be effected by the snakes. ,                                                                          
 * Also make it harder for the turtle to kill this Bug by requiring multiple "hits" by the turtle before it is removed from the world..
 * Note: One intersection of two objects, as noted by a call to getOneObjectAtOffset(),
 * will actually register as multiple hits, maybe 3 or 4, due to the speed of the act() methods being called. 
 * To define the new subclass and choose the default image right click on Animal class and choose New Subclass,
 * name the class and choose an image. The class shell will be created with an empty Act method.
 */

public class Bug extends Animal
{
    /**
     * Act - do whatever the Bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        tryToEatLettuce();
        move(8);
        
        if (atWorldEdge())
        {
             turn(15);
        }
        if (Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(40)-20);
        }
       
    }    
    
    

    public void tryToEatLettuce()
    {
        if (canSee(Lettuce.class))
        {
            eat(Lettuce.class);
            if (getWorld().getObjects(Lettuce.class).size()==0)
                Greenfoot.stop();
            
        }
    }    
}
    

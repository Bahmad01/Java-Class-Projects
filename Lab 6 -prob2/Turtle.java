import greenfoot.*; 

public class Turtle extends Animal
{

    public void act()
    {
        tryToEatLettuce();
        tryToHitBug();
        move(getMoveDistance());
        if (Greenfoot.isKeyDown("right")){
                turn(5);
        }
        if (Greenfoot.isKeyDown("left")){
                turn(-5);
        }
    }
    
    private int getMoveDistance(){
        if (getWorld().getObjects(Lettuce.class).size()<5)
            return 3;
            else return 5;
    }

    public void tryToEatLettuce()
    {
        if (canSee(Lettuce.class))
        {
            eat(Lettuce.class);
            if (getWorld().getObjects(Lettuce.class).size()==0)
                Greenfoot.stop();
            if (getWorld().getObjects(Lettuce.class).size()==3) {
                 Snake snake = new Snake();
                 getWorld().addObject(snake, 117, 162);
            }
 
        }
    } 
    public void tryToHitBug()
    {
		    boolean intersects;
            //add an if statement to remove the bug once the turtle hits it three times
			int count=0;
			if( intersects(Bug))
			{
				count++;
			}
			if(count>4)
            getWorld().removeObject(getOneObjectAtOffset(0,0,Bug.class));
            
            //Greenfoot.stop();
             
    }
}
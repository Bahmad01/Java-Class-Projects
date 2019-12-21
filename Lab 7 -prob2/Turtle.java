import greenfoot.*; 

public class Turtle extends Animal
{
    private Counter reference;
    public void act()
    {
        tryToEatLettuce();
        tryToEatBug();
 
        move(getMoveDistance());
        if (Greenfoot.isKeyDown("right")){
                turn(5);
        }
        if (Greenfoot.isKeyDown("left")){
                turn(-5);
        }
        
    }
    public Turtle(Counter c)
    {
        reference = c; 
    }
    private int getMoveDistance(){
        if (getWorld().getObjects(Lettuce.class).size()<5)
            return 3;
            else return 5;
    }

    public void tryToEatLettuce()
    {
        int count =0;
        if (canSee(Lettuce.class))
        {
            eat(Lettuce.class);
            count ++;
            reference.add(count);
            
            if (getWorld().getObjects(Lettuce.class).size()==0)
                Greenfoot.stop();
            if (getWorld().getObjects(Lettuce.class).size()==3) {
                 Snake snake = new Snake();
                 getWorld().addObject(snake, 117, 162);
            }
 
        }
    } 
    private void tryToEatBug() {

        if (canSee(Bug.class)) {

            Bug theBug = (Bug)getOneObjectAtOffset(0,0,Bug.class);

            theBug.incrementHitCount();

       }

    } 
}
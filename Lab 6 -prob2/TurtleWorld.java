import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

public class TurtleWorld extends World
{
    /**
     * Create the turtle world. Our world has a size 
     * of 560x460 cells, where every cell is just 1 pixel.
     */
    public TurtleWorld() 
    { 
        super(600, 480, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Turtle turtle = new Turtle();
		int a = Greenfoot.getRandomNumber(getWidth());
        int b = Greenfoot.getRandomNumber(getHeight());
		addObject(turtle, a, b);
        //Change the TurtleWorld prepare() method to randomly place a random number of lettuce
        //find random num of lettuce, use Greenfoot.getRandomNumber(num), num is upper limit, and is exclusive
        //have an array of lettuce objects,
        //have a loop the assign two random numbers for location between 0 and 600 and 9 and 480
        //until the random num is hit
        int numoflet = Greenfoot.getRandomNumber(10);
        Lettuce [] lettucearray = new Lettuce[numoflet];
        //Lettuce lettuce = new Lettuce();
        
        for (int i=0; i < numoflet; i++)
        {
            int num1 = Greenfoot.getRandomNumber(601);
            int num2 = Greenfoot.getRandomNumber(481);
            lettucearray[i] = new Lettuce();
            addObject(lettucearray[i], num1, num2);
        }
       
        /*
        addObject(lettuce, 455, 411);
        Lettuce lettuce2 = new Lettuce();
        addObject(lettuce2, 415, 394);
        Lettuce lettuce3 = new Lettuce();
        addObject(lettuce3, 215, 276);
        Lettuce lettuce4 = new Lettuce();
        addObject(lettuce4, 139, 116);
        Lettuce lettuce5 = new Lettuce();
        addObject(lettuce5, 459, 87);
        Lettuce lettuce6 = new Lettuce();
        addObject(lettuce6, 517, 211);
        Lettuce lettuce7 = new Lettuce();
        addObject(lettuce7, 530, 299);
        Lettuce lettuce8 = new Lettuce();
        addObject(lettuce8, 284, 373);
        Lettuce lettuce9 = new Lettuce();
        addObject(lettuce9, 123, 277);
        Lettuce lettuce10 = new Lettuce();
        addObject(lettuce10, 103, 407);
        Lettuce lettuce11 = new Lettuce();
        addObject(lettuce11, 201, 433);
        */
        Bug bug = new Bug();
        int a = Greenfoot.getRandomNumber(getWidth());
        int b = Greenfoot.getRandomNumber(getHeight());
		addObject(bug, a, b);
        Snake snake = new Snake();
		int c = Greenfoot.getRandomNumber(getWidth());
        int d = Greenfoot.getRandomNumber(getHeight());
		addObject(snake, c, d);
        Snake snake2 = new Snake();
        int h = Greenfoot.getRandomNumber(getWidth());
        int i = Greenfoot.getRandomNumber(getHeight());
		addObject(snake, h, i);
    }
}
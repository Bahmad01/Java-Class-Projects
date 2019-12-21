/*

find 2 random values to represent 2 dice rolled
the target roll is those 2 random numbers added together
if sum (target roll) is equal to 7 then player wins
else keep rolling until user gets a 7 or the sum of their target roll
If user gets a 7 before they get their original roll then they lose
else if they get their original roll before rolling a 7 then they wins


*/

public class Craps
{
public static void main(String[]args){
int sum = 0;
int randomnum1 = (int )(Math.random() * 6 + 1);
int randomnum2 = (int )(Math.random() * 6 + 1);
int targetRoll = randomnum1+randomnum2;
	System.out.println("Target Roll:" + randomnum1 + " + " + randomnum2 + " = " + targetRoll);
if(targetRoll == 7){
	System.out.println("You won on the first roll!");
}
else{
	while(sum!=7 && sum!=targetRoll)
	{
	int randomnum3 = (int )(Math.random() * 6 + 1);
	int randomnum4 = (int )(Math.random() * 6 + 1);
	sum= randomnum3+randomnum4;
	System.out.println("You Rolled:" + randomnum3 + " + " + randomnum4 + " = " + sum);
	}
	if(sum == 7)
	{
		System.out.println("CRAPS! You lost.");
	}
	else
		System.out.println("You rolled your target. You won!");
}
}
}
import java.util.Scanner;

public class ProblemJ1_2012 {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		/**System.out.println((SpeedCar<=SpeedLimit)? "Congratulations, you are within the speed limit!" :
		(SpeedCar-SpeedLimit<=20)? "You are speeding and your fine is $100" : 
			(SpeedCar-SpeedLimit<=30)? "You are speeding and your fine is $270" :
				"You are speeding and your fine is $500");*/
		
		
		System.out.print("Enter the speed limit here: ");
		int SpeedLimit = thing.nextInt();
		
		while(SpeedLimit<0 || SpeedLimit>500){
			System.out.println("Please enter the correct speed of the car!");
			System.out.print("Enter the correct speed limit here: ");
			SpeedLimit = thing.nextInt();
		}
		
		System.out.print("Enter the speed of the car here: ");
		int SpeedCar = thing.nextInt();
		int f;
			while(SpeedCar<0 || SpeedCar>500){
				System.out.println("Please enter the correct speed of the car!");
				System.out.print("Enter the speed of the car here: ");
				SpeedCar = thing.nextInt();
			}
		
		
		
		
		
		f = 100;
		
		if(SpeedCar<=SpeedLimit)
			System.out.println("Congratulations, you are within the speed limit!");
		else if(SpeedCar-SpeedLimit<=20)
			System.out.println("You are speeding and your fine is $" + f);
		else if(SpeedCar-SpeedLimit<=30){
			f = 270;
			System.out.println("You are speeding and your fine is $" + f);
		}
		else{
			f = 500;
			System.out.println("You are speeding and your fine is $" + f);
		}
	}
}

package random.model;

import java.util.Random;
import java.util.Scanner;

import sun.applet.Main;

public class RandomTest {
	public static void playGame() {
		Random random = new Random();
		int computerNumber = random.nextInt(101);//a-b+1
		System.out.println("may da ra so");
		int yourNumber,count = 0;
		do {
			count++;
			System.out.println("what is your number?");
			yourNumber = new Scanner(System.in).nextInt();
			if(yourNumber > computerNumber) {
				System.out.println("your number bigger computer number");
			}
			else if(yourNumber < computerNumber) {
				System.out.println("your number smaller computer number");
			}
			else if(yourNumber < computerNumber) {
				System.out.println("Congratulation");
				break;
			}
			if(count == 6) {
				System.out.println("you lose");
				break;
			}
		}while(count <= 6);
	}
	public static void main(String[] args) {
		while(true) {
			playGame();
			System.out.println("chơi tiếp k: c/k");
			String str = new Scanner(System.in).nextLine();
			if(str.equalsIgnoreCase("k")) {
				break;
			}
			
		}
	}
}

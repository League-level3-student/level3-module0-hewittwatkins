package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	public static void main(String[] args) {
		
		
        // 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];

        // 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}
		Robot.setWindowSize(400, 400);

        // 4. make each robot start at the bottom of the screen, side by side, facing up
		int num = 0;
		for (Robot i: robots) {
			i.moveTo(0 + (num*50), 350);
			num++;
		}
		
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
		for (Robot i: robots) {
			Random rand = new Random();
			int randInt1 = rand.nextInt(50);
			i.move(randInt1);;
			num++;
		}
		
		
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
		
		boolean reachedTop = false;
		int winnerIndex;
		while (reachedTop == false) {
			for (Robot i: robots) {
				Random rand = new Random();
				int randInt1 = rand.nextInt(50);
				i.move(randInt1);;
				num++;
				if (i.getY() >= 400) {
					reachedTop = true;
					winnerIndex = i;
					i.sparkle();
				}
			}
		}
    
        // 7. declare that robot the winner and throw it a party!
    
		// above ^^^^^^^
		
        // 8. try different races with different amounts of robots.
		
		// above ^^^^^^
    
        // 9. make the robots race around a circular track.
		
		// above ^^^^^^
	}
}

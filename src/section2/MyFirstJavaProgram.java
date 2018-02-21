package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot trump = new Robot();
	trump.setSpeed(1);
		trump.sparkle();
		trump.move(100);
		trump.turn(90);
		trump.hide();
	}
}

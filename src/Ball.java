import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle{
	Random random;
	int XVelocity;
	int YVelocity;
	int initialSpeed = 3;
	Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		random = new Random();
		int randomXDirection = random.nextInt(2);
		if(randomXDirection == 0) {
			randomXDirection--;
		}
		setXDirection(randomXDirection * initialSpeed);
		
		int randomYDirection = random.nextInt(2);
		if(randomYDirection == 0) {
			randomYDirection--;
		}
		setYDirection(randomYDirection * initialSpeed);
	}
	
	public void setXDirection(int randomXDirection) {
		XVelocity = randomXDirection;
	}
	
	public void setYDirection(int randomYDirection) {
		YVelocity = randomYDirection;
	}
	
	public void move() {
		x += XVelocity;
		y += YVelocity;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(x, y, width, height);
	}
}

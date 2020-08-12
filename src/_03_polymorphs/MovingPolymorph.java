package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph{

	MovingPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.YELLOW);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void update() {
		setX(getX() + randGen.nextInt(6) - 3);
		setY(getY() + randGen.nextInt(6) - 3);
		
	}


	
}

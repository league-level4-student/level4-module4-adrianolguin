package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph {

	float step = 0;
	float xoff = 0;
	float yoff = 0;
	int xConst;
	int yConst;

	int speedCoefficient;
	
	CirclePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		xConst = x;
		yConst = y;
		
		speedCoefficient = randGen.nextInt(126) + 25;
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		step += Math.PI / speedCoefficient;
		
		if(step >= Math.PI * 2) {
			step = 0;
		}
		
		xoff = (float) Math.sin(step) * getWidth();
		yoff = (float) Math.cos(step) * getHeight();

		setX((int) xoff + xConst);
		setY((int) yoff + yConst);

	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.pink);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}

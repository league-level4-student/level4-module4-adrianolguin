package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	ArrayList<Polymorph> morphs;
	Random randGen = new Random();

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();

	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		initializePolymorphs(3);
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void initializePolymorphs(int batchAmount) {
		morphs = new ArrayList<Polymorph>();
		for (int i = 0; i < batchAmount; i++) {
			morphs.add(new BluePolymorph(randGen.nextInt(900), randGen.nextInt(600), 50, 50));
			morphs.add(new RedPolymorph(randGen.nextInt(900), randGen.nextInt(600), 50, 50));
			morphs.add(new MovingPolymorph(randGen.nextInt(900), randGen.nextInt(600), 50, 50));
			int size = randGen.nextInt(26) + 25;
			morphs.add(new CirclePolymorph(randGen.nextInt(900), randGen.nextInt(600), size, size));
			morphs.add(new MousePolymorph(randGen.nextInt(900), randGen.nextInt(600), 50, 50));
		}
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		// draw polymorph
		for (Polymorph polymorph : morphs) {
			polymorph.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph polymorph : morphs) {
			polymorph.update();
		}
	}
}

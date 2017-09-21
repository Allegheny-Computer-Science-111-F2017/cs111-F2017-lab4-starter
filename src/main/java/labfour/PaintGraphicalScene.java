package labfour;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 * This class produces simple graphical output.
 * The program will display a small graphical scene.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Gregory Kapfhammer and Janyl Jumadinova and Eric Knoll
 */

public class PaintGraphicalScene extends JApplet {

  private static final int CANVAS_WIDTH = 600;
  private static final int CANVAS_HEIGHT = 400;

  /**
   * This pain method will "paint" the graphics on the screen.
   *
   * @author Janyl Jumadinova
   */

  public void paint(Graphics page) {

    // fill entire background cyan
    page.setColor(Color.cyan);
    page.fillRect(0,0,CANVAS_WIDTH, CANVAS_HEIGHT);

    // change color for the snow
    page.setColor(Color.white);

    // draw snow on the ground
    int snowOffset = 80;
    page.fillRect(0,
                  CANVAS_HEIGHT - snowOffset,
                  CANVAS_WIDTH,CANVAS_HEIGHT); // Graphics Object #1: Rectangle

    // draw sun in corner
    int sizeOfSun = 50;
    page.setColor(Color.yellow);
    page.fillOval(0,0,sizeOfSun,sizeOfSun);    // Graphics Object #2: Oval

    // draw rays from sun
    page.drawLine(70,30,100,50); // Graphics Object #3: Line
    page.drawLine(30,70,50,100);
    page.drawLine(50,50,100,100);
    page.drawLine(70,10,150,15);
    page.drawLine(10,65,6,130);

    // draw tree
    // trunk of tree
    page.setColor(Color.gray);
    page.fillRect(432,200,30,160);

    // overlapping green circles for leaves
    page.setColor(Color.green);
    page.fillOval(410,100,125,125); // top right
    page.fillOval(362,130,117,117); // bottom left
    page.fillOval(360,100,125,125); //top left
    page.fillOval(412,130,117,117); // bottom right
    page.fillOval(385,90,117,117); // top center

    // draw green arc in leaves with a custom color
    page.setColor(new Color(87,100,45));
    page.drawArc(400,160,50,50,180,95); // Graphics Object #4: Arc
    page.drawArc(445,120,50,50,268,90);

    // black hole in tree trunk
    page.setColor(Color.black);
    page.fillOval(435,270,15,25);
  }
}

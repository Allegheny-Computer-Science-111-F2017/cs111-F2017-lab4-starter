package labfour;

import java.util.Date;
import javax.swing.JFrame;

/**
 * This class uses another class to produce simple graphical output.
 * The program will display a small graphical scene.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Gregory M. Kapfhammer and Janyl Jumadinova and Eric Knoll
 */

public class DisplayGraphicalScene {

  private static final int CANVAS_WIDTH = 600;
  private static final int CANVAS_HEIGHT = 400;

  /**
   * This is the main method that constructs the PaintGraphicalScene.
   * This method will set the size of the canvas and then
   * use the PaintGraphicalScene class to paint a scene on the screen.
   */
  public static void main(String[] args) {
    JFrame window = new JFrame("Gregory M. Kapfhammer " + new Date());
    // Add the drawing canvas and do necessary things to
    // make the window appear on the screen
    window.getContentPane().add(new PaintGraphicalScene());
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // make the window visible on the computer screen
    window.setVisible(true);
    // set the size of the window that the program displays
    window.setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
  }
}


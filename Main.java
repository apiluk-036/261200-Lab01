import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Turtle bob = new Turtle();

        bob.getY();
        bob.forward(100);
        bob.right(90);
        bob.forward(100);
        bob.right(90);
        bob.forward(100);
        bob.right(90);
        bob.forward(100);
        bob.getX();

        bob.right(45);
        bob.forward(80);
        bob.right(45);
        bob.forward(100);
        bob.right(135);
        bob.forward(80);
        bob.left(45);
        bob.forward(100);

        bob.left(135);
        bob.forward(80);
        bob.left(45);
        bob.forward(100);

        bob.left(180);
        bob.forward(100);
        bob.right(90);
        bob.forward(100);
        bob.right(90);
        bob.forward(100);
        bob.right(180);
        bob.forward(100);
        bob.right(45);
        bob.forward(80);
        }

    }
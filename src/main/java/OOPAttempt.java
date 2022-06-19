import processing.core.PApplet;

public class OOPAttempt extends PApplet {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int DIAMETER = 10;
    int x = 0;
    int height = HEIGHT / 5;

    public static void main(String[] args) {
        PApplet.main("OOPAttempt",args);
    }

    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        drawcircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
        x++;
    }

    private void drawCircle4() {
        ellipse(4*x,4*height,DIAMETER,DIAMETER);
    }

    private void drawCircle3() {
        ellipse(3*x,3*height,DIAMETER,DIAMETER);
    }

    private void drawCircle2() {
        ellipse(2*x,2*height,DIAMETER,DIAMETER);
    }

    private void drawcircle1() {
        ellipse(x,height,DIAMETER,DIAMETER);
    }
}

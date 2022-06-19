import processing.core.PApplet;

public class ProceduralAttempt extends PApplet{

    private static final int width = 640;
    private static final int height = 480;
    private static final int diameter = 10;
    int space = height / 5,x=0;

    public static void main(String[] args) {
        PApplet.main("ProceduralAttempt",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void draw() {
        for (int ball = 1; ball <= 4;ball++) {
            ellipse(ball*x,ball * space,diameter,diameter);
        }
        x++;
    }
}

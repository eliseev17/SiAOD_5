import java.awt.*;

class SimpleGraphics {
    private Graphics g = null;
    private int x = 0, y = 0;

    public SimpleGraphics(Graphics g) {
        setGraphics(g);
    }

    public void setGraphics(Graphics g) {
        this.g = g;
    }

    public void goToXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void lineRel(char s, int deltaX, int deltaY) {
        g.drawLine(x, y, x + deltaX, y + deltaY);
        x += deltaX;
        y += deltaY;
    }
}
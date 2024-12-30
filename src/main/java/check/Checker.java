
package check;

public class Checker {
    public boolean hit(float x, int y, int r) {
        return inRect(x, y, r) || inTriangle(x, y, r) || inCircle(x, y, r);
    }

    private boolean inRect(float x, int y, int r) {
        return x >= 0 && y >= 0 && x <= (float) r && y <= r /2;
    }

    private boolean inTriangle(float x, int y, int r) {
        return (x >= (float) -r/2) && (y >= -r) && (2 * x + 2 * y >= -r) && x <= 0 && y <= 0;
    }

    private boolean inCircle(float x, int y, int r) {
        return (x * x + y * y) <= (float) (r * r) / 4 && x <= 0 && y >= 0;
    }
}


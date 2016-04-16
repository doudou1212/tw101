/**
 * Created by sunjing on 4/16/16.
 */
public class TriangleExercises {
    public void drawOneAsterisk() {
        System.out.println("*");
    }

    public void drawHorizontalLine (int n) {
        for (int i=0; i < n; i++) {
            System.out.print("*");
        }
    }

    public void drawVerticalLine (int n) {
        for (int i=0; i < n; i ++) {
            System.out.println("*");
        }
    }

    public void drawRightTriangle (int n) {
        for (int i=0; i < n; i++) {
            for (int j=0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

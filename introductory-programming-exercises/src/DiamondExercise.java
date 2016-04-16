/**
 * Created by sunjing on 4/16/16.
 */
public class DiamondExercise {
    public void drawIsoscelesTriangle (int n) {
        for (int i=0; i < n; i++) {
            for (int j=i+1; j < n ; j++) {
                System.out.print(" ");
            }
            for (int j=0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void drawDiamond (int n) {
        for (int i=0; i < n; i++) {
            for (int j=i+1; j < n ; j++) {
                System.out.print(" ");
            }
            for (int j=0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i= n-1; i > 0; i--) {
            for(int j=i ; j < n; j++) {
                System.out.print(" ");
            }
            for (int j=0 ; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void drawDiamondWithName (int n, String name) {
        for (int i=0; i < n-1; i++) {
            for (int j=i+1; j < n ; j++) {
                System.out.print(" ");
            }
            for (int j=0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println(name);
        for (int i= n-1; i > 0; i--) {
            for(int j=i ; j < n; j++) {
                System.out.print(" ");
            }
            for (int j=0 ; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

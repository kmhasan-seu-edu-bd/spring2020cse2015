/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.lecture3;

public class Lab1 {

    public static void main(String args[]) {
        System.out.printf("Enter the x and y coordinates of two points\n");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        double distance = p1.getDistance(p2);

        System.out.printf("Distance = %f\n", distance);

        double angle = p1.getAngle(p2);
        System.out.printf("Angle with the x-axis = %f\n", angle);

        System.out.printf("Enter the h and k value by which we want to translate p1 and p2\n");
        double h = scanner.nextDouble();
        double k = scanner.nextDouble();
        
        Point p1p = p1.translate(h, k);
        Point p2p = p2.translate(h, k);

        System.out.printf("new p1 (%f, %f)\n", p1p.x, p1p.y);
        System.out.printf("new p2 (%f, %f)\n", p2p.x, p2p.y);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.lecture3;

class Point {

    double x;
    double y;

    // constructor
    Point(double nx, double ny) {
        x = nx;
        y = ny;
    }

    double getDistance(Point b) {
        Point a = this;
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance;
    }

    double getAngle(Point b) {
        Point a = this;
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        double angleInRadian = Math.atan(dy / dx);
        double angleInDegree = Math.toDegrees(angleInRadian);
        return angleInDegree;
    }

    Point translate(double h, double k) {
        double xp = x + h;
        double yp = y + k;
        Point p = new Point(xp, yp);
        return p;
    }
}

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

        System.out.printf("Enter the h and k value by which we want to translate p1 and p2");
        // TODO add your code to do the rest
    }
}

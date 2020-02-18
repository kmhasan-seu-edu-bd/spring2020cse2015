/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.lecture3;

class Point {

    double x;
    double y;

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
        double dy = b.y - a.y;
        double dx = b.x - a.x;
        double angleInRadian = Math.atan(dy / dx);
        double angleInDegree = Math.toDegrees(angleInRadian);
        return angleInDegree;
    }

    Point translate(double h, double k) {
        double xp = x + h;
        double yp = y + k;
        Point p = new Point(xp, yp); // this is just wrong
        return p;
    }
}

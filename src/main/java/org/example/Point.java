package org.example;

public class Point {
    private final double x;
    private final double y;
    private final double z;

    public Point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public int compareTo(Point p) {
        if ((this.x == p.x) && (this.y == p.y) && (this.z == p.z))
            return 0;
        else if (this.z > p.z) {
            return 1;
        } else if (this.z < p.z) {
            return -1;
        }
        else if (this.y > p.y) {
            return 1;
        } else if (this.y < p.y) {
            return -1;
        }
        else if (this.x > p.x) {
            return 1;
        } else if (this.x < p.x) {
            return -1;
        }
        return 0;
    }
}

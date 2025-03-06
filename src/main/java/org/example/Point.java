package org.example;

public class Point {
    //instance variables:
    private int x;
    private int y;

    //constructors:
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        }

    //getter methods:
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setter methods:
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
         this.y = y;
    }

    //distance method: √ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

    // Overloading 1: (0,0) noktasına uzaklığı hesaplar
    public int distance() {
        return (int) Math.sqrt((x*x)+(y*y));
    }

    // Overloading 2: Başka bir Point nesnesine uzaklık hesaplar
    public int distance(Point p) {
        return (int) Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    // Overloading 3: Belirtilen (a,b) noktasına uzaklığı hesaplar
    public double distance(int a, int b) {
        return Math.sqrt(Math.pow(a - this.x, 2) + Math.pow(b - this.y, 2));
    }

    //Math.sqrt() → Karekök almak için kullanıldı.
    //Math.pow() → İki sayının karesini almak için kullanıldı.
}

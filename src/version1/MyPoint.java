/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;
import java.lang.*;

/**
 *
 * @author User
 */
public class MyPoint {

    private int x;
    private int y;
    MyPoint(int hor, int ver){
        x = hor;
        y = ver;
    }
    MyPoint(){x = y = 0;}
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public double getDistance(){
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); 
        return distance;
    }
    public double getDistance(int x, int y){
        double distance = Math.sqrt(Math.pow((getX() - x), 2) + Math.pow((getY() - y), 2));
        return distance;
    }
    public double getDistance(MyPoint point){
        double distance = Math.sqrt(Math.pow((getX() - point.x), 2) + Math.pow((getY() - point.y), 2));
        return distance;
    }
    public void displayPoint(){
        System.out.println(this);
    }
    public int getQuadrant(){
        int quadrant;
        if(this.x > 0){
            if(this.y > 0){
                quadrant = 1;
            }
            else if(this.y < 0){
                quadrant = 4;
            }
            else{
                quadrant = 5;
            }
        }
        else if(this.x < 0){
            if(this.y > 0){
                quadrant = 2;
            }
            else if(this.y < 0){
                quadrant = 3;
            }
            else{
                quadrant = 5;
            }
        }
        else{
            if(y != 0){
                quadrant = 6; 
            }
            else{
                quadrant = 0;
            }
        }
        return quadrant;
    }
    public double getAngle(){
        double angle = Math.abs(Math.toDegrees(Math.atan2(this.y, this.x)));
        return angle;
    }
    @Override
    public String toString(){
        return String.format("(%d,%d)",x,y);
    }
    public static void main(String[] args) {
        MyPoint point = new MyPoint(5, 3);
        MyPoint point2 = new MyPoint(4, -5);
        MyPoint point3 = new MyPoint(-3, 8);
        MyPoint point4 = new MyPoint(-4, -4);
        MyPoint point5 = new MyPoint(6, 0);
        MyPoint point6 = new MyPoint(0, 9);
        MyPoint point7 = new MyPoint(-7, 0);
        MyPoint point8 = new MyPoint(0, -8);
        MyPoint point9 = new MyPoint();
        double angle;
        double d1;
        double d2;
        double d3;
        d1 = point.getDistance();
        d2 = point3.getDistance(8,-3);
        d3 = point.getDistance(point5);
        System.out.printf("%f\n",d1);
        System.out.printf("%f\n",d2);
        System.out.printf("%f\n",d3);
        point2.displayPoint();
        point.displayPoint();
        point7.displayPoint();
        point5.displayPoint();
        angle = point.getAngle();
        System.out.printf("%f\n",angle);
        System.out.printf("%d\n",point4.getQuadrant());
        
    }
    
}

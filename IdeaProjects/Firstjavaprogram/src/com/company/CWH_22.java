package com.company;
class Cylinder{
    private  int radius;
    private  int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class CWH_22 {
    public static void main(String[] args) {
  Cylinder maths = new Cylinder();
   maths.setHeight(12);
   int h= maths.getHeight();
        System.out.println(h);

        maths.setRadius(5);
        System.out.println(maths.getRadius());

     double   volume= ((3.14)* (maths.getRadius())* (maths.getRadius())*(maths.getHeight()));
        System.out.println(volume);// PRINTING VOLUME OF CYLINDER USING THAT CLASS ONLY
    }
}

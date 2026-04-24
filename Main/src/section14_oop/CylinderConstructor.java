package section14_oop;

public class CylinderConstructor {

    private double radius;
    private double height;

    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }

    public void setRadius(double radius){
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 0;
        }
    }
    public void setHeight(double height){
        if (height > 0){
            this.height = height;
        } else{
            this.height = 0;
        }
    }

    public void setDimensions(double radius, double height){
        setRadius(radius);
        setHeight(height);
    }

    public CylinderConstructor(){
        setDimensions(0, 0);
    }

    public CylinderConstructor(double radius){
        setRadius(radius);
        setHeight(1);
    }

    public CylinderConstructor(double radius, double height){
        setRadius(radius);
        setHeight(height);
    }
}

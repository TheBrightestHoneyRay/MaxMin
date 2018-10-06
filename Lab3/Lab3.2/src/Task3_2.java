public class Task3_2 {
    final static double PI = 3.14159;
    public static abstract class Volume{
        double h, l, r; //the height and the length and the radius
        public abstract double getVolume();
        public abstract double surfaceArea();
    }

    public static class Cube extends Volume{
        public Cube(double a){
            h = a;
        }

        @Override
        public double getVolume(){
            return Math.pow(h,3);
        }

        @Override
        public double surfaceArea(){
            return 6 * Math.pow(h,2);
        }
    }

    public static class Sphere extends Volume{
        public Sphere(double a){
            r = a;
        }

        @Override
        public double getVolume(){
            return PI * Math.pow(r,3) * 4/3;
        }

        @Override
        public  double surfaceArea() {
            return 4 * PI * Math.pow(r, 2);

        }
    }

    public static class Cylinder extends Volume{
        public Cylinder(double radius, double height){
            r = radius;
            h = height;
        }

        @Override
        public double getVolume(){
            return PI*h*Math.pow(r,2);
        }

        @Override
        public double surfaceArea(){
            return (2*PI*Math.pow(r,2) + 2*PI*r*h);
        }
    }
    public static void main(String[] args){}
}

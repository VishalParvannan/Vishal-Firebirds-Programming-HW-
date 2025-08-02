public class shapes {
    
    public static void main(String[] args) {
        System.out.println(findArea(4));
        System.out.println(findArea(4, 5));
        System.out.println(findArea(4.0, 5.0));
        System.out.println(findArea(4.0));

        System.out.println(perimeter(4));
        System.out.println(perimeter(4, 5));
        System.out.println(perimeter(4, 5, 6));
        System.out.println(perimeter(4.0));

        System.out.println(findAngle(45, 35));
        System.out.println(findAngle(45.0, 35.0));


    }    

    public static double findArea(int a) {
        return Math.pow(a, 2);
    }

    public static int findArea(int a, int b) {

        return (a * b);
        
    }

    public static double findArea(double b, double h) {
        return (b * h / 2);
        
    }

    public static double findArea(double r) {
        return (Math.PI * Math.pow(r, 2));
        
    }

    public static int perimeter(int a) {
        return (a * 4);
    }

    public static int perimeter(int a, int b) {
        return ((a + b) * 2);
    }

    public static int perimeter(int a, int b, int c) {
        return (a + b + c);
    }

    public static double perimeter(double d) {
        return (Math.PI * d);
    }

    public static double findAngle(int AngleA, int AngleB) {
        return (180 - AngleA - AngleB);
    }

    public static double findAngle(double AngleA, double AngleB) {
        return Math.toRadians(180 - AngleA - AngleB);
    }
}


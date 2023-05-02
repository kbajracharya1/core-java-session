package day3;

public class StaticMethod {
    public static void main(String[] args) {
        StaticMethod staticMethod = new StaticMethod();

        int a = 3;
        int b = 4;
        staticMethod.multiply(a,b);

        float c = 3;
        float d = 4;
        staticMethod.multiply(c,d);

        double e = 3;
        double f = 4;
        staticMethod.multiply(e,f);
    }

    public/*static*/ void multiply(int a, int b){
        int c = a*b;
        System.out.println(c);
    }
    //here we need to add different data types float, int, double
    // to pass. This is called Function Overloading
    public void multiply (float a, float b){
        float c = a*b;
        System.out.println(c);
    }
    public void multiply (double a, double b){
        double c = a * b;
        System.out.println(c);
    }
}
//both class should be static if there is no objects
//called in the main class.
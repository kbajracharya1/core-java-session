package day3;

public class MethodPractice {
    public static void main(String[] args) {
        MethodPractice methodPractice = new MethodPractice();


        int a = 2;
        int b = 3;

//        int sum1 = a + b;
//        System.out.println(sum1);
//        methodPractice.addAndPrint(a, b);//function call, variable pass to the function.
        int sum1 = methodPractice.addAndReturn(a, b);//holding the value with some variable.
        System.out.println(sum1);

        int c = 4;
        int d = 5;

//        int sum2 = c + d;
//        System.out.println(sum2);
//        methodPractice.addAndPrint(c, d);//function call, variable pass to the function.
        int sum2 = methodPractice.addAndReturn(c, d);
        System.out.println(sum2);

        int e = 4;
        int f = 5;

//        int sum3 = e + f;
//        System.out.println(sum3);
//        methodPractice.addAndPrint(e, f);//function call, variable pass to the function.
        int sum3 = methodPractice.addAndReturn(e, f);
        System.out.println(sum3);

    }

    //A function that does not return anything - void.
    //java uses pass by value. so the a receives the value 2 and b receives the value 3.
    public void addAndPrint(int a, int b){//this function wont return the value due to void.
        int sum = a + b;
        System.out.println(sum);
    }

    public int addAndReturn(int a, int b){//this function will return the value, the return value should be predefined.
//        int sum = a + b;
//        return sum;
        return a + b;
    }
}

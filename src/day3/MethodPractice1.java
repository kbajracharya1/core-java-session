package day3;

public class MethodPractice1 {
    public static void main(String[] args) {
        MethodPractice1 methodPractice1 = new MethodPractice1();

        int a = 1;
        int b = 2;

        int sum1 = methodPractice1.addAndReturn(a, b);
        System.out.println(sum1);

        int c = 2;
        int d = 3;
        int sum2 = methodPractice1.addAndReturn(c, d);
        System.out.println(sum2);



    }
    public void addAndPrint(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public int addAndReturn(int a, int b){
        return a + b;

    }
}

public class Calculator {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int total = add(a,b);
        System.out.println(total);
        System.out.println("the total is" +total );
        int subtration = sub();
        System.out.println(subtration);
        mul();
        div(100,200);
    }
    public static int add(int a,int b)
    {
        int sum = a+b;
        return sum;
    }
    public static int sub()
    {
        int a= 3;
        int b=6;
        return b-a;

    }
    public static void mul()
    {
        int d =2;
        int e=2;
        int mul= d*e;
        System.out.println(mul);

    }
    public static void div(int x,int y)
    {
       // int  a= 10;
       //  a=15;
      //  int b= 10;
        int div=x/y;
        System.out.println(div);
    }
}

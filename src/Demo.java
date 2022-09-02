public class Demo
{
    public static void main(String[] args) {
        //System.out.println("Hello world");//
//        System.out.println("press 1 for sum");
//
//        System.out.println("sum "+ sum(2,3));
//      //  System.out.println("sum "+ sum(2,3));
//        System.out.println("subtraction "+diff( 4,2));
//        System.out.println(mul ( 6,7));
//        System.out.println(div(8,2));

        for(int i=0;i<=9;i++){
            if (i==5 || i==6)
                continue;
            System.out.println("i  "+i);
        }
        int j=0;
        while(j<=9){
            System.out.println("j  "+j);
            j++;
        }
       // Calcu calcu=new Calcu(2,3);


//even(5);

    }
    public static void even(int a){
        if (a%2==0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static int diff(int a , int b){
        return a-b;
    }
        public static int mul(int a , int b){
        return a*b;

    }
    public static int div(int a , int b){
        return a/b;

    }
}




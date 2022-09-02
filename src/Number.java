public class Number {
    public static void main(String[] args) {
      /*  two int numbers
                subtract a from 10
store the var a-10 =d1
            subtarct b with 10
            store the var b-10 = d2
compare the d1 and d2
                if d1 is less a is closest
                if d2 is less b is closest
                if both d1 and d2 is equal answer 0*/
int a=2;
int b=8;
int d1 = Math.abs (10 - a);
int d2 = Math.abs(10 - b);
if (d1<d2)
{
    System.out.println(a +" a is closest");
} else if (d2 < d1){
    System.out.println( b +"b is closest");

}
else
    System.out.println( "d1 and d2 are equal");



    }
}

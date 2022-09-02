public class BiggestNumber {
    public static void main(String[] args) {
  int result =  number(10,23);
        System.out.println(result);
       int res =  countingarray();
        System.out.println("res="+ res);
    }
    public static int number(int a,int b){
        if ((a>=10&&a<=20)&&(b>=10&&b<=20)){
            if (a>b){
                return a;
            }else
                return b;
        }

        else if((!(a>=10&&a<=20))&&(b>=10&&b<=10)) {
            return b;
        } else if(((a>=10&&a<=20))&&!(b>=10&&b<=10)){
            return a;
        }else
            return 0;
    }

    public static int countingarray(){
        int count=0;
        int arr[] = new int[] {1,2,3,1,1,4,1,1,1};
        for( int i=0;i<arr.length;i++){
            if (arr[i]==1){
                count=count+1;
            }

        }
        System.out.println("count=" +count);
        if(count<=5)
            System.out.println("number if ones is less then 5");
        else
            System.out.println("number of ones is grater than 5");
        return count;
    }


}


public class Factorial {
    public static void main(String[] args) {
        int n=6;
        int fact = 1, i;
        for(i=1;i<=n;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }public boolean posNeg(int a, int b, boolean negative) {
        if(negative==false){
            if((a>0&&b<0)||(b>0&&a<0)){
                return true;
            }else
            return false;
        }else {
            if(a<0&&b<0){
                return true;
            }else
                return false;
        }
    }
}

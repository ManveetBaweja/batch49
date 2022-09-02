import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int random=(int)(Math.random()*10);
        Scanner sc = new Scanner(System.in);
        boolean flag= true;
        while(flag){
            System.out.println("Guess the number");
            int anint = sc.nextInt();
            if (random == anint) {
                System.out.println("Right Guess");
                flag=false;
            }else{
                System.out.println("try again");
            }
            }

        }
    }


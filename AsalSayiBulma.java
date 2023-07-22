import java.util.Scanner;

public class AsalSayiBulma{

    static boolean isPrime(int n, int i){
        if(n==0 || n==1){
            return false;
        }
        if(n==2){
            return  true;
        }
        else{
            if(n%i==0){
                return isPrime(n,i+1);
            }
            else if(n==i){
                return true;
            }
            else{
                return isPrime(n,i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Sayıyı giriniz: ");
        n=sc.nextInt();

        if(isPrime(n,1)){
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }
    }
}
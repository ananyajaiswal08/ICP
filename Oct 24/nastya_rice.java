import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(); 
            int a=sc.nextInt(); 
            int b=sc.nextInt(); 
            int c=sc.nextInt(); 
            int d=sc.nextInt(); 
            int minG=n*(a-b);
            int maxG=n*(a+b);
            int minP=c-d;
            int maxP=c+d;
            if (maxG<minP || minG>maxP){
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
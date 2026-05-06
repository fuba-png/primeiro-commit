import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Leia n1:");
        n1 =sc.nextInt();

        System.out.println("Leia n2:");
        n2 =sc.nextInt();

        if (n1 % n2 ==0 || n2 % n1==0)
            System.out.println("Os numeros são multiplos");

        else
            System.out.println("Os numeros não são multiplos");

        sc.close();
    }
}

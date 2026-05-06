import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int h1, h2;
        int htotal;

        System.out.println("Leia Horario do inicio:");
        h1 =sc.nextInt();

        System.out.println("Leia Horario do final:");
        h2 =sc.nextInt();

        htotal = (h2 - h1);

                if (htotal <= 0)
                htotal = htotal +24;


        System.out.println ("O jogo durou " + htotal + " horas");
    }
}

package fr.m2i;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Saisissez un nombre : ");
            int n = scanner.nextInt();
            for (int i = 1; i <= 10;i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
        } catch (Exception e){
            System.out.println("Veuillez réessayer avec un nombre, si l'erreur persiste veuillez abandonner.");
        }
    }
}
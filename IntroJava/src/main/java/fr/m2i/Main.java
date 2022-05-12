package fr.m2i;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        Integer number1 = null;
        Integer number2 = null;

        while (number1 == null || number2 == null) {
            try {
                System.out.print("Entrez un premier nombre : ");
                number1 = scanner.nextInt();

                System.out.print("Entrez un deuxième nombre : ");
                number2 = scanner.nextInt();

                scanner.close();
            } catch (InputMismatchException e) {
                System.out.println("Attention ! Vous devez entrez un nombre");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Mince une erreur s'est produite :(");
                return;
            }
        }

            int addResult = calculator.addition(number1, number2);
            System.out.println("résultat de l'addition : " + addResult);

            int subResult = calculator.subtraction(number1, number2);
            System.out.println("résultat de la soustraction : " + subResult);

            int multResult = calculator.multiplication(number1, number2);
            System.out.println("résultat de la multiplication : " + multResult);

            float divResult = calculator.division(number1, number2);
            System.out.println("résultat de la division : " + divResult);

    }
}

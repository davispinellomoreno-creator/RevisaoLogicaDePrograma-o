import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      Integer num1;
        Integer num2;
        Integer num3;

//Solicite um número e mostre sua tabuada de 1 a 10.
        System.out.println("Digite um número:");
        num1 = sc.nextInt();

        System.out.println(num1 + 1);
        System.out.println(num1 + 2);
        System.out.println(num1 + 3);
        System.out.println(num1 + 4);
        System.out.println(num1 + 5);
        System.out.println(num1 + 6);
        System.out.println(num1 + 7);
        System.out.println(num1 + 8);
        System.out.println(num1 + 9);
        System.out.println(num1 + 10);
    }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      Integer num1;
        Integer num2;
        Integer num3;

//Maior de três números:Leia três números e exiba qual é o maior deles.
        System.out.println("Digite um número:");
        num1 = sc.nextInt();
        System.out.println("Digite um número:");
        num2 = sc.nextInt();
        System.out.println("Digite um número:");
        num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Este numero" + num1 +  " é o maior");

        }
        else if(num2>num1 && num2>num3){
            System.out.println("Este numero " + num2 + " é o maior");
        }
        else if(num3>num1 && num3>num2){
            System.out.println("Este numero " + num3 + " é o maior");
        }
        else{
            System.out.println("ERRO!");
        }
    }
}
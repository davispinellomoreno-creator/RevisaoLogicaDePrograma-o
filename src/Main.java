import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int num1;
      int soma = 0;


//Leia um número N e calcule a soma de todos os números pares de 1 até N.
        System.out.println("Digite um número:");
        num1 = sc.nextInt();


        for (int i = 0; i <= num1; i++){
     if(i % 2 == 0){
         soma += i;

         System.out.println("soma dos pares :" + soma);
     }
 }

    }
}
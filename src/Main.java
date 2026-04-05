import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

 Integer num1;


        System.out.println("Digite um número");
        num1 = sc.nextInt();

        if(num1 % 2 == 0){
            System.out.println("Este numero e par");

        }
        else{
            System.out.println("Este numero e ímpar");
        }
    }
}
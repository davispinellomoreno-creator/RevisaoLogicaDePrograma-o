import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int num1;
     boolean primo = true;

//Verifique se um número informado é primo ou não.
        System.out.println("Digite um número:");
        num1 = sc.nextInt();

        if(num1 < 2) {
            primo = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(num1); i++) {
                if (num1 % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

    }

}





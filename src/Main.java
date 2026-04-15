import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Inverter número
        //
        //Peça um número inteiro (ex: 1234) e mostre ele invertido (4321).

        int num1=1234;
        int invertido = 0;

        while(num1 != 0){
            int digito = num1 % 10;
            invertido = invertido * 10 + digito;
            num1 = num1/10;

        }
        System.out.println("Numero invertido :" +
                 + invertido);

    }
}





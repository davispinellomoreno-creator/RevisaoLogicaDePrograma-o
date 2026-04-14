import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Fatorial

        //Peça um número e calcule seu fatorial (ex: 5! = 120).

        int num1 = 5;
int fatorial = 1;


for(int i=num1;i>=1;i--){
        fatorial *= i;
        }
        System.out.println("Fatorial é" + fatorial );
    }
}





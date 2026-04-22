import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer senha;

        System.out.println("Digite a senha!");
        senha = sc.nextInt();
        //Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

        while ( senha == 2202) {
            if(senha == 2202) {
                System.out.println("Senha correta!");
            }
        else{
                System.out.println("Senha ivalida!");
            }
        }
    }
}





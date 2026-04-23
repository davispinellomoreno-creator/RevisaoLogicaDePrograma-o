import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer entrada;


        //Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

    while(true){
        System.out.println("Digite A senha: ");
        entrada = sc.nextInt();

        if(entrada == 2000){
            System.out.println("Senha correta");
            break;

        }
        else{
            System.out.println("Valor invalido tente novamente");

        }
    }
    sc.close();
        }
    }






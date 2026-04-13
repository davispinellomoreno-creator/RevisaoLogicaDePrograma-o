import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);


      //Contador de vogais:
        //Leia uma palavra ou frase e conte quantas vogais existem nela.
      String palavra;
      int contador = 0;

        System.out.println("Digite uma palavra");
        palavra = sc.nextLine();


      for(int i = 0;i<palavra.length();i++){
         char letra = palavra.charAt(i);

          if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'  ){
             contador++;
          }

      }
        System.out.println("A palavra escrita tem " + contador);

    }

}





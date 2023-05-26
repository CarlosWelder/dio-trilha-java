import java.util.Scanner;
import java.util.Locale;

public class trycartch{

public static void main(String[] args){


   Scanner teclado = new Scanner(System.in);

   System.out.println("Digite seu nome: ");
   String nome = teclado.next();

   System.out.println("Digite seu sobrenome: ");
   String sobrenome = teclado.next();

   System.out.println("Digite sua idade: ");
   int idade = teclado.nextInt();

   System.out.println("Digite sua Altura: ");
   double altura = teclado.nextDouble();

   System.out.println("Olá, me chamo " + nome + sobrenome);
   System.out.println("Tenho " + idade + " anos ");
   System.out.println("Minha altura é  " + altura + " cm ");
   teclado.close();

   

  

 
}
}
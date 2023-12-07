import java.util.*;
public class Expoente{
   public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: "); 
        int expoente = scan.nextInt();
        int quadrado = expoente * expoente;
        int cubo = expoente * expoente * expoente;
        System.out.println("O quadrado do "+expoente+" é: "+quadrado+"\nO cubo de "+expoente+" é: "+cubo);
   }

}

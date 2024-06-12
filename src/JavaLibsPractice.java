import java.util.Scanner;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
     String a;
     int b;
     double c;
     String x = null;
     System.out.println("De um nome ao coelho: ");
     a = entrada.nextLine();
     System.out.println("Informe o numero de pulos que o coelho deve pular: ");
     b = entrada.nextInt();
     System.out.println("Informe a distancia que o coelho deve caminhar: ");
     c = entrada.nextDouble();
     entrada.nextLine();
     System.out.println("escolha se o coelho deve comer a cenoura ou entrar na casinha: ");
     x = entrada.nextLine();
     System.out.println(" ");
     
     System.out.println("O "+a+" deu "+b+" pulinhos, dando o total de uma distancia de "+(c*b)+" metros e depois deve "+x);
     
     
     
    }   
}
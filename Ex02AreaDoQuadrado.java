import java.util.Scanner;
public class Ex02AreaDoQuadrado {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Digite o valor do quadrado: ");
        double lado = scanner.nextDouble ();
        double area = lado * lado;
        System.out.print("Digite a area do quadrado é:" + area);
        scanner.close();
        
}

}
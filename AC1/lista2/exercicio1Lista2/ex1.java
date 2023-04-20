package AC1.lista2.exercicio1Lista2;

import java.util.Scanner;

public class ex1 {
    public static void main (String [] args){
        int op = 0;
        int num1;
        int num2;

        calculadora c = new calculadora();

        Scanner teclado = new Scanner(System.in);

        while(op != 5){
            System.out.println("Menu: ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multipicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            op = Integer.parseInt(teclado.nextLine());

            switch(op){
                
                case 1://somar
                System.out.printf("Digite um número: ");
                num1 = teclado.nextInt();

                System.out.printf("Digite outro número: ");
                num2 = teclado.nextInt();

                System.out.println("A soma é: " + c.somar(num1, num2));
                break;

                case 2://subtrair
                System.out.printf("Digite um número: ");
                num1 = teclado.nextInt();
                
                System.out.printf("Digite outro número: ");
                num2 = teclado.nextInt();
                System.out.println("A subtração é: " + c.subtrair(num1, num2));
                break;

                case 3://multiplicar
                System.out.printf("Digite um número: ");
                num1 = teclado.nextInt();
                
                System.out.printf("Digite outro número: ");
                num2 = teclado.nextInt();
                System.out.println("A multiplicação é: " + c.multiplicar(num1, num2));
                break;

                case 4://dividir
                System.out.printf("Digite um número: ");
                num1 = teclado.nextInt();
                
                System.out.printf("Digite outro número: ");
                num2 = teclado.nextInt();
                System.out.println("A divisão é: " + c.dividir(num1, num2));
                break;

                case 5://sair
                System.out.println("O sistema será fechado");
                break;

                default:
                System.out.println("Opção Inválida!");
            }
        }
    }
}

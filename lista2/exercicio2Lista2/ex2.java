package lista2.exercicio2Lista2;

import java.util.Scanner;

public class ex2 {
    public static void main (String[] args){
        int op = 0;

        apolice a = new apolice();

        Scanner teclado = new Scanner(System.in);

        while(op != 3){
            System.out.println("Menu: ");
            System.out.println("1 - Criar apólice");
            System.out.println("2 - Ver dados apólice");
            System.out.println("3 - Sair");
            op = Integer.parseInt(teclado.nextLine());

            switch(op){
                case 1://criar
                System.out.println("Qual o número da apólice: ");
                a.setNumero(teclado.nextInt());

                System.out.println("Nome: ");
                a.setNome(teclado.nextLine());

                System.out.println("Qual sua idade: ");
                a.setIdade(Integer.parseInt(teclado.nextLine()));

                System.out.println("Qual caractere do sexo: ");
                a.setSexo(teclado.nextLine().charAt(0));

                System.out.println("Qual valor do automóvel: ");
                a.setValorAutomovel(teclado.nextInt());
                break;

                case 2://ver dados
                System.out.println(a.imprimir());
                break;

                case 3://sair
                System.out.println("O sistema será fechado");
                break;

                default:
                System.out.println("Opção inválida!");
            }
        }
    }
    
}

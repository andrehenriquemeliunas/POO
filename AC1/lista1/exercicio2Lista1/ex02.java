package AC1.lista1.exercicio2Lista1;

import java.util.Scanner;

public class ex02 {
    public static void main (String[] args){
        int opcao = 0;
        aluno a = new aluno();

        Scanner teclado = new Scanner(System.in);
        while (opcao != 3){
            System.out.println("Menu: ");
            System.out.println("1 - Criar Aluno");
            System.out.println("2 - Mostrar Aluno");
            System.out.println("3 - Sair");
            System.out.println("Escolha a opção desejada:");
            opcao = Integer.parseInt(teclado.nextLine());
            
            switch(opcao){
                case 1:
                //1 - Criar Aluno
                System.out.println("Digite o RA: ");
                a.setRa(teclado.nextLine());

                System.out.println("Digite o nome:");
                a.setNome(teclado.nextLine());

                System.out.println("Digite a nota da AC1:");
                a.setAc1(Float.parseFloat(teclado.nextLine()));

                System.out.println("Digite a nota da AC2:");
                a.setAc2(Float.parseFloat(teclado.nextLine()));

                System.out.println("Digite a nota da AG:");
                a.setAg(Float.parseFloat(teclado.nextLine()));

                System.out.println("Digite a nota da AF:");
                a.setAf(Float.parseFloat(teclado.nextLine()));

                break;
                case 2:// 2 -  Mostrar Aluno
                System.out.println(a.imprimir());
                break;
                
                case 3://3 - Sair
                System.out.println("O sistema será fechado");
                break;

                default:
                System.out.println("Opção Inválida");
            }
        }

        teclado.close();
    }
}
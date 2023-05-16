package atv_heranca1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

        int opcao = 0;
        Scanner ler = new Scanner(System.in);

        while (opcao != 3) {

            System.out.println("\nMenu");
            System.out.println("1 - Inserir Funcionario");
            System.out.println("2 - Exibir Funcionario");
            System.out.println("3 - Sair");
            System.out.print("Digite a opcao Desejada: ");
            opcao = ler.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n------Cadastro de Funcionario------");
                    System.out.println("\nFuncionario Horista/Mensalista");
                    System.out.println("1 - Horista");
                    System.out.println("2 - Mensalista");
                    System.out.print("Digite a opcao desejada: ");
                    opcao = ler.nextInt();
                switch (opcao) {
                    case 1 ->                         {
                            System.out.print("\nNumero Cracha: ");
                            int numeroCracha = ler.nextInt();
                            System.out.print("Nome: ");
                            String nome = ler.next();
                            System.out.print("Setor: ");
                            String setor = ler.next();
                            System.out.print("Funcao: ");
                            String funcao = ler.next();
                            System.out.print("Quantidade de Horas Trabalhadas: ");
                            int qtdHora = ler.nextInt();
                            System.out.print("Valor Horas Trabalhadas: ");
                            double valorHora = ler.nextDouble();
                            funcionarioH fHorista = new funcionarioH(numeroCracha, nome, setor, funcao, qtdHora, valorHora);
                            listaFuncionarios.add(fHorista);
                        }
                    case 2 ->                         {
                            System.out.print("\nNumero Cracha: ");
                            int numeroCracha = ler.nextInt();
                            System.out.print("Nome: ");
                            String nome = ler.next();
                            System.out.print("Setor: ");
                            String setor = ler.next();
                            System.out.print("Funcao: ");
                            String funcao = ler.next();
                            System.out.print("Salario: ");
                            double salario = ler.nextDouble();
                            funcionarioM fMensalista = new funcionarioM(numeroCracha, nome, setor, funcao, salario);
                            listaFuncionarios.add(fMensalista);
                        }
                    default -> System.out.println("\nDigite uma opcao valida!!!");
                }

                    break;



                case 2:
                    System.out.println("\nFuncionarios");
                    listaFuncionarios.forEach(funcionario -> {
                        System.out.println(funcionario.toString());
                });


            }

        }

    }
    
}

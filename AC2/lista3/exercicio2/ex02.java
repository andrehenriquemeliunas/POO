package AC2.lista3.exercicio2;

import java.util.Scanner;
import java.util.ArrayList;

public class ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao = 0;
        while (opcao != 6) {
            System.out.println("\nMenu:");
            System.out.println("1 - Criar Pessoa");
            System.out.println("2 - Criar Automóvel");
            System.out.println("3 - Transferir Automóvel");
            System.out.println("4 - Mostrar Todas as Pessoas");
            System.out.println("5 - Mostrar automóvel da pessoa");
            System.out.println("6 - Sair");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                
                    System.out.print("Digite o código da pessoa: ");
                    int codigo = teclado.nextInt();
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = teclado.next();
                    Pessoa pessoa = new Pessoa(codigo, nome);
                    pessoas.add(pessoa);
                break;
                case 2:

                    System.out.print("Digite a marca do automóvel: ");
                    String marca = teclado.next();
                    System.out.print("Digite o modelo do automóvel: ");
                    String modelo = teclado.next();
                    Automovel automovel = new Automovel(marca, modelo);

                    System.out.println("Selecione a pessoa para associar o automóvel:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println((i + 1) + " - " + pessoas.get(i).getNome());
                    }
                    int indexPessoa = teclado.nextInt() - 1;
                    pessoas.get(indexPessoa).inserirAutomovel(automovel);

                break;

                case 3:

                    System.out.println("Selecione a pessoa de origem:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println((i + 1) + " - " + pessoas.get(i).getNome());
                    }
                    int indexPessoaOrigem = teclado.nextInt() - 1;

                    Pessoa pessoaOrigem = pessoas.get(indexPessoaOrigem);

                    System.out.println("Selecione o automóvel a ser transferido:");
                    ArrayList<Automovel> automoveisOrigem = pessoaOrigem.getAutomoveis();
                    for (int i = 0; i < automoveisOrigem.size(); i++) {
                        System.out.println((i + 1) + " - " + automoveisOrigem.get(i).imprimir());
                    }
                    int indexAutomovel = teclado.nextInt() - 1;

                    Automovel automovelTransferido = automoveisOrigem.get(indexAutomovel);

                    System.out.println("Selecione a pessoa de destino:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        if (i != indexPessoaOrigem) {
                            System.out.println((i + 1) + " - " + pessoas.get(i).getNome());
                        }
                    }
                    int indexPessoaDestino = teclado.nextInt() - 1;

                    Pessoa pessoaDestino = pessoas.get(indexPessoaDestino);
                    pessoaOrigem.removerAutomovel(indexAutomovel);
                    pessoaDestino.inserirAutomovel(automovelTransferido);
                break;

                case 4:

                    for (Pessoa p : pessoas) {
                        System.out.println(p.imprimirCompleto());
                    }
                break;

                case 5:

                    System.out.println("Selecione a pessoa:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println((i + 1) + " - " + pessoas.get(i).getNome());
                    }
                    int indexPessoaAutomoveis = teclado.nextInt() - 1;

                    Pessoa pessoaAutomoveis = pessoas.get(indexPessoaAutomoveis);

                    ArrayList<Automovel> automoveis = pessoaAutomoveis.getAutomoveis();
                    System.out.println("Automóveis da pessoa:");
                    for (int i = 0; i < automoveis.size(); i++) {
                        System.out.println((i + 1) + " - " + automoveis.get(i).imprimir());
                    }
                break;

                case 6: 
                System.out.println("Programa encerrado.");
                break;

                default:
                System.out.println("Opção inválida.");

            }
        }

        teclado.close();
    }
}

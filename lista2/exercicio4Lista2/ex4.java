package lista2.exercicio4Lista2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int op = 0;
		int codigo;
		String nome;
		double percentualComissao, valorVenda, desconto;
		
		vendedor v = new vendedor();

		while (op != 3) {
			System.out.println("Digite o numero para selecionar");
			System.out.println("1 - Cadastrar Vendedor");
			System.out.println("2 - Calcular Comissão");
			System.out.println("3 - Sair");
			op = teclado.nextInt();

			switch (op){
			case 1:
				System.out.println("Digite o codigo do vendedor: ");
				codigo = teclado.nextInt();
				System.out.println("Digite o nome do vendedor: ");
				nome = teclado.next();
				System.out.println("Digite o percentual da comissâo do vendedor: ");
				percentualComissao = teclado.nextDouble();
				v = new vendedor(codigo, nome, percentualComissao);
				break;
			case 2:
				System.out.println("Digite o valor da venda: ");
				valorVenda = teclado.nextDouble();
				System.out.println("Digite o valor do desconto: ");
				desconto = teclado.nextDouble();
				System.out.println(v.imprimir(valorVenda, desconto));
				break;
			case 3:
				System.out.println("O sistema será fechado");
				break;
			default: 
				System.out.println("Opção inválida!");
				
			}
		}

	}
}

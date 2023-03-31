package lista1.exercicio3Lista1;

import java.util.Scanner;

public class ex3 {

    public static void main (String[] args){
        int op = 0;
        char vinculo;
        funcionario f = new funcionario();

        Scanner teclado = new Scanner(System.in);

        while(op != 4){
            System.out.println("Menu: ");
            System.out.println("1 - Criar funcionário");
            System.out.println("2 - Mostrar folha de pagamento");
            System.out.println("3 - Alterar remuneração ");
            System.out.println("4 - Sair");
            op = Integer.parseInt(teclado.nextLine());

            switch(op){
                case 1://Criar funcionário
                System.out.printf("Digite o número do seu crachá: ");
                f.setCracha(teclado.nextLine());

                System.out.printf("Digite seu nome: ");
                f.setNome(teclado.nextLine());

                System.out.printf("Qual seu tipo de vínculo: ");
                vinculo = teclado.nextLine().charAt(0);
                f.setTipoVinculo(teclado.nextLine().charAt(0));

                if(vinculo == 'H'){
                    System.out.printf("Quanto vale sua hora: ");
                    f.setValorHora(Float.parseFloat(teclado.nextLine()));

                    System.out.printf("Quantas horas trabalha por dia: ");
                    f.setQtdeHora(Float.parseFloat(teclado.nextLine()));
                }else{
                    System.out.printf("Qual seu salário: ");
                    f.setSalario(Float.parseFloat(teclado.nextLine()));
                }

                System.out.printf("Valor do desconto: ");
                f.setValorDesconto(Float.parseFloat(teclado.nextLine()));
                break;

                case 2://mostrar folha de pagamento
                System.out.println(f.imprimir());
                break;

                case 3://Alterar remuneração
                System.out.printf("Qual seu tipo de vínculo: ");
                vinculo = teclado.nextLine().charAt(0);
                f.setTipoVinculo(teclado.nextLine().charAt(0));

                if(vinculo == 'H'){
                    System.out.printf("Quanto vale sua hora: ");
                    f.setValorHora(Float.parseFloat(teclado.nextLine()));

                    System.out.printf("Quantas horas trabalha por dia: ");
                    f.setQtdeHora(Float.parseFloat(teclado.nextLine()));
                }else{
                    System.out.printf("Qual seu salário: ");
                    f.setSalario(Float.parseFloat(teclado.nextLine()));
                }
                break;

                case 4://sair
                System.out.println("O sistema será fechado");
                break;

                default:
                System.out.println("Opção inválida!");
            }
        }
    }
    
}

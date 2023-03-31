package lista2.exercicio2Lista2;

public class apolice {
    private Integer numero;
    private String nome;
    private Integer idade;
    private char sexo;
    private double valorAutomovel;

    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }
    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public double calcularValor(){
        if(sexo == 'M' && idade <= 25){
            double calcularValor = (valorAutomovel * 10) / 100;
            return calcularValor;
        }else if(sexo == 'M' && idade > 25){
            double calcularValor = (valorAutomovel * 5) / 100;
            return calcularValor;
        }else{
            double calcularValor = (valorAutomovel * 2) / 100;
            return calcularValor;
        }
    }

    public String imprimir(){
        return "Número: " + numero +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nSexo: " + sexo +
                "\nValor Automável: " + valorAutomovel +
                "\nValor Apólice: " + calcularValor();
    }
}

package atv_heranca1;

public class funcionarioH extends funcionario {
    private int qtdHoras;
    private double valorHora;

    public funcionarioH() {
    }

    public funcionarioH(int numeroCracha, String nome, String setor, String funcao, int qtdHora, double valorHora) {
        setnumeroCracha(numeroCracha);
        setNome(nome);
        setSetor(setor);
        setFuncao(funcao);
        this.qtdHoras = qtdHora;
        this.valorHora = valorHora;

    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {

        return "\nN do Cracha: " + getnumeroCracha()
                + "\nNome: " + getNome()
                + "\nSetor: " + getSetor()
                + "\nFuncao: " + getSetor()
                + "\nQuantidade de Horas Trabalhadas: " + qtdHoras + "H"
                + "\nValor Pago por Hora Trabalhada: " + valorHora + " R$";

    }
}

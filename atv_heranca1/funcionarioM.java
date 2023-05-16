package atv_heranca1;

public class funcionarioM extends funcionario {
    private double salario;

    public funcionarioM() {
    }

    public funcionarioM(int numeroCracha, String nome, String setor, String funcao,double salario) {
        setnumeroCracha(numeroCracha);
        setNome(nome);
        setSetor(setor);
        setFuncao(funcao);
        this.salario = salario;
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString(){
         return "\nN do Cracha:" + getnumeroCracha() +
                "\nNome: "+ getNome()+
                "\nSetor: "+ getSetor()+
                "\nFuncao: "+ getSetor()+
                "\nSalario: "+ salario+" R$" ;
    }
}

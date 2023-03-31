package lista1.exercicio3Lista1;

public class funcionario {
    private String Cracha;
    private String Nome;
    private char TipoVinculo;
    private float ValorHora;
    private float QtdeHora;
    private float Salario;
    private float ValorDesconto;

    //cracha
    public void setCracha (String Cracha){
        this.Cracha = Cracha;
    }
    public String getCracha (){
        return Cracha;
    }
    //vinculo
    public void setTipoVinculo (char TipoVinculo){
        this.TipoVinculo= TipoVinculo;
    }
    public char getTipoVinculo (){
        return TipoVinculo;
    }
    //nome
    public void setNome (String Nome){
        this.Nome = Nome;
    }
    public String getNome (){
        return Nome;
    }
    //vlaor hora
    public void setValorHora (Float ValorHora){
        this.ValorHora = ValorHora;
    }
    public Float getValorHora (){
        return ValorHora;
    }
    //quantidade de hora
    public void setQtdeHora (Float QtdeHora){
        this.QtdeHora = QtdeHora;
    }
    public Float getQtdeHora (){
        return QtdeHora;
    }
    //quantidade de hora
    public void setSalario (Float Salario){
        this.Salario = Salario;
    }
    public Float getSalario (){
        return Salario;
    }
    //quantidade de hora
    public void setValorDesconto (Float ValorDesconto){
        this.ValorDesconto = ValorDesconto;
    }
    public Float getValorDesconto (){
        return ValorDesconto;
    }

    //calcular valor do salario
    public float calcularValorSalario(){
        //to do -> se tipo de vinculo = H, mostrar valorhora * qtdeHora, else mostrar salario
        if(getTipoVinculo() == 'H'){
            float calculaSalario = (ValorHora * QtdeHora);
            return calculaSalario;
        }else{
            float calculaSalario = Salario;
            return calculaSalario;
        }
    }

    public float valorReceber(){
        //to do -> Salario menos desconto
        if(getTipoVinculo() != 'H'){
            float valorReceber = (Salario - ValorDesconto);
            return valorReceber;
        }else{
            float valorReceber = ((ValorHora * QtdeHora) - ValorDesconto);
            return valorReceber;
        }
        
    }

    //mostra pro usuário
    public String imprimir(){
        return "Crachá: " + Cracha +
                "\nNome: " + Nome +
                "\nTipo de Vínculo: " + TipoVinculo +
                "\nSalário: " + calcularValorSalario() +
                "\nDesconto: " + ValorDesconto +
                "\nValor a receber: " + valorReceber();
    }

}

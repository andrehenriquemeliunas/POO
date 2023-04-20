package AC1.lista1.exercicio2Lista1;

public class aluno {
    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float af;
    private float ag;
    

    public void setRa (String ra){
        this.ra = ra;
    }
    public String getRa (){
        return ra;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome (){
        return nome;
    }

    public void setAc1 (float ac1){
        this.ac1 = ac1;
    }
    public Float getAc1 (){
        return ac1;
    }

    public void setAc2 (float ac2){
        this.ac2 = ac2;
    }
    public Float getAc2 (){
        return ac2;
    }

    public void setAf (float af){
        this.af = af;
    }
    public Float getAf (){
        return af;
    }

    public void setAg (float ag){
        this.ag = ag;
    }
    public Float getAg (){
        return ag;
    }

    public double getCalcularMedia(){
        double getCalcularMedia = (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
        return getCalcularMedia;
    }

    public String verificarAprovacao(){
        if(getCalcularMedia() >= 5){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
    
    public String imprimir(){
        return "RA: " + ra +
                "\nNome: " + nome + 
                "\nAC1: " + ac1 +
                "\nAC2: " + ac2 +
                "\nAF: " + af +
                "\nAG:" + ag +
                "\nMédia: " + getCalcularMedia() +
                "\nSituação: " + verificarAprovacao();
    }
}

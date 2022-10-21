import java.util.Date;

public class Empregado {
    protected String nome;
    protected Date datanasc;
    public String getnome(String novoNome){
        this.nome = novoNome;
        return nome;
    }
    public Date getDate(){
        return datanasc;
    }
    public void setDataNasc(Date novaDataNasc){
        this.datanasc = novaDataNasc;
    }
}

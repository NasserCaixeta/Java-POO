package Empresa;

public class Funcionario {
    String nome;
    String Genero;
    int saldo;
    int qnt_tarefas_exec;
    public void executar_tarefa(){
        qnt_tarefas_exec++;
        saldo = saldo +5;
    }
    public void obter_valor(){
        System.out.print("O valor do seu saldo é" + saldo);
    }
    public void sacar_valor(int valor_sacado){
        if (valor_sacado < saldo){
            System.out.print("Não foi possível realizar o saque (Valor inválido)");
        }
        saldo = saldo - valor_sacado;
    }
    public void fornecer_dados(String nome, String genero){
        System.out.print("Seu nome é :"+nome +", Seu gênero é"+ genero);
    }
}

package Empresa;

public class Gerente extends Funcionario{
    @Override
    public void executar_tarefa() {
        saldo = saldo +5;
        super.executar_tarefa();
    }
    public void treinamento_func(int qnt_func_part){
        saldo = saldo +(qnt_func_part*10);
    }
}

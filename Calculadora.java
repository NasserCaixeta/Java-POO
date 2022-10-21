package Academia;

public class Calculadora {
    int resultado = 0;
    public void somar(int val1){
        resultado = resultado + val1;
    }
    public void subtrair(int val1){
        resultado = resultado - val1;
    }
    public void multiplicar(int val1){
        resultado = resultado *val1;
    }
    public void dividir(int val1){
        if (val1 ==0){
            System.out.print("Não foi possível entender seu número.");

        }
        else resultado = resultado/val1;
    }
    public void zerar (int val1){
        resultado = resultado *0;
    }
    public void exibir(int resultado){
        System.out.print("Seu resultado é: ."+ resultado);
    }
}

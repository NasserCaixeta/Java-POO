package Academia;

import static java.lang.Float.parseFloat;
    public class Aluno {

        String nome;
        String sobrenome;
        int idade;
        float altura;
        float peso;
        //peso em kg
        public void comer(int comer, float peso) {
            if (comer == 1) {
                peso = peso + 0.05f;
            }
            if (comer == 2) {
                peso = peso + 0.1f;
            }
            if (comer == 3) {
                peso = peso + 0.2f;
            } else System.out.print("Não foi possível entender seu número.");
        }
        public void treinar(float peso, int intensidade) {
            if (intensidade == 1) {
                peso = peso - 0.150f;
            } else if (intensidade == 2) {
                peso = peso - 0.1f;
            } else if (intensidade == 3) {
                peso = peso + 0.05f;
            } else System.out.print("Não foi possível entender seu número.");
        }
        public void exibir(float imc, float peso, float altura){
            imc = peso / (altura * altura);
            if (imc <= 16) {
                System.out.print("Olá" + nome + sobrenome + ", sua altura e peso são respectivamente: " + altura + peso + "Seu Imc é: " + imc + ",logo, você está na categoria de baixo peso grau 3!");
            } else if (imc <= 16.99) {
                System.out.print("Olá" + nome + sobrenome + ", sua idade, altura e peso são respectivamente: " + idade + altura + peso + "Seu Imc é: " + imc + ", logo, você está na categoria de baixo peso grau 2!");
            } else if (imc <= 18.49) {

                System.out.print("Olá" + nome + sobrenome + ", sua idade, altura e peso são respectivamente: " + idade + altura + peso + "Seu Imc é: " + imc + ", logo, você está na categoria de baixo peso grau 1!");
            } else if (imc <= 24.99) {
                System.out.print("Olá" + nome + sobrenome + ", sua idade, altura e peso são respectivamente: " + idade + altura + peso + "Seu Imc é: " + imc + ", logo, você está na categoria de Peso Ideal!");
            } else if (imc <= 29.99) {
                System.out.print("Olá" + nome + sobrenome + ", sua idade, altura e peso são respectivamente: " + idade + altura + peso + "Seu Imc é: " + imc + ", logo, você está na categoria Sobrepeso!");
            } else if (imc <= 34.99) {
                System.out.print("Olá" + nome + sobrenome + ", sua idade, altura e peso são respectivamente: " + idade + altura + peso + "Seu Imc é: " + imc + ", logo, você está na categoria de Obesidade Grau 1!");
            } else if (imc <= 39.99) {
                System.out.print("Olá" + nome + sobrenome + ", sua idade, altura e peso são respectivamente: " + idade + altura + peso + "Seu Imc é: " + imc + ", logo, você está na categoria de Obesidade Grau 2!");
            } else if (imc <= 40) {
                System.out.print("Olá" + nome + sobrenome + ", sua idade, altura e peso são respectivamente: " + idade + altura + peso + "Seu Imc é: " + imc + ", logo, você está na categoria de Obsidade Grau 3!");
            }
        }
    }

    /*public class Calculadora {
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
                System.out.print("Não foi possível entender seu

                        número.");

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
}*/

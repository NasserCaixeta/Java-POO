package com.company;

public class Elevador {
    int andar_atual;
    int total_andares;
    int capacidade_elevador;
    int pessoas_no_momento;

    private void inicializa(int capacidade_elevador, int total_andares) {
        andar_atual = 0;
        pessoas_no_momento = 0;
    }

    private void entra() {
        if (pessoas_no_momento == capacidade_elevador) {
            System.out.print("Alerta de capacidade máxima!");
        }
        pessoas_no_momento++;
    }

    private void sai() {
        if (pessoas_no_momento == 0) {
            System.out.print("Alerta de capacidade mínima!");
        }
        pessoas_no_momento--;
    }
    private void sobe(){
        if (andar_atual == total_andares){
            System.out.print("Alerta ultimo andar alcançado!");
        }
        andar_atual++;
    }
    private void desce(){
        if (andar_atual == total_andares){
            System.out.print("Alerta ultimo andar alcançado!");
        }
        andar_atual--;
    }
    private void exibir_andar(){
        System.out.print("Você está no andar: " + andar_atual);
    }
}

package br.edu.unibratec;

/**
 * Created by gustavo.tenorio on 12/06/2016.
 */
public class Botao implements Dispositivo {
    Dispositivo dispositivo;

    public void Acionar(){
        Iniciar();
     }
    @Override
    public void Iniciar(){
        System.out.println("\n Botão acionado... Iniciando");
    }
    @Override
    public void Desligar() {
        System.out.println("\n Botão acionado... Desligando");
    }
}

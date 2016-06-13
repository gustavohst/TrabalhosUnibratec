package br.edu.unibratec;

/**
 * Created by gustavo.tenorio on 12/06/2016.
 */
public class Sistema implements Dispositivo {
    @Override
    public void Iniciar() {
        System.out.println("\n Sistema ligando...");
    }

    @Override
    public void Desligar() {
        System.out.println("\n Sistema desligando...");
    }
}

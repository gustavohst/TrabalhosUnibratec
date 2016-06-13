package br.edu.unibratec;

/**
 * Created by gustavo.tenorio on 12/06/2016.
 */
public class Funcionario implements FuncaoFuncionario {
    @Override
    public void EmitirDocumentacao() {
        System.out.println("\n Emitindo documentação...");
    }
    @Override
    public void AcessarSistemaFiscal() {
        System.out.println("\n Acessando sistema fiscal...");
    }
}

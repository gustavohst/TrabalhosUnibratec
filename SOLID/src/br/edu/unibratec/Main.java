package br.edu.unibratec;

public class Main {

    public static void main(String[] args) {
        // Chamada para calculo de nota fiscal
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.calculaNotaFiscal();
        // Chamada para calculo de recibo
        Recibo recibo = new Recibo();
        recibo.calculaRecibo();
        // Chamada para validação de inadimplente
        Inadimplente inadimplente = new Inadimplente();
        inadimplente.validaInadimplente();
        // Imprimindo arquivos
        ArquivoProvisorio arquivoProvisorio = new ArquivoProvisorio();
        ArquivoZebra arquivoZebra = new ArquivoZebra();
        arquivoProvisorio.Gerar();
        arquivoZebra.Gerar();
        //Atividades dos empregados / Gerente / Funcionario
        Gerente gerente = new Gerente();
        gerente.GerirPagamento();
        Funcionario funcionario = new Funcionario();
        funcionario.AcessarSistemaFiscal();
        funcionario.EmitirDocumentacao();
        // Tratando o sistema Iniciar ou Desligar
        Botao botao = new Botao();
        botao.Acionar();
        Sistema sistema = new Sistema();
        sistema.Iniciar();
    }
}

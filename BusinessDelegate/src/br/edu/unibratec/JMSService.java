package br.edu.unibratec;

/**
 * Created by gustavo.tenorio on 12/06/2016.
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("processando a tarefa do JMS Service");
    }
}
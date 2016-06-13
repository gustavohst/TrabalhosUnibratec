package br.edu.unibratec;

/**
 * Created by gustavo.tenorio on 12/06/2016.
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
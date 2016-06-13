package br.edu.unibratec;

/**
 * Created by gustavo.tenorio on 12/06/2016.
 */
public class FrontController {

    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("Usuário autorizado com sucesso.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Pagina requerida: " + request);
    }

    public void dispatchRequest(String request){
        //Log por requisicao
        trackRequest(request);

        //Autenticação do usuário
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
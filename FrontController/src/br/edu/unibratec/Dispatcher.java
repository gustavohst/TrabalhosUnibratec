package br.edu.unibratec;

/**
 * Created by gustavo.tenorio on 12/06/2016.
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("Estudante")){
            studentView.show();
        }
        else{
            homeView.show();
        }
    }
}

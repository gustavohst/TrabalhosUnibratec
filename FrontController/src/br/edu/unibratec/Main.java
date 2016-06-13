package br.edu.unibratec;

public class Main {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("Home");
        frontController.dispatchRequest("Estudante");
    }
}

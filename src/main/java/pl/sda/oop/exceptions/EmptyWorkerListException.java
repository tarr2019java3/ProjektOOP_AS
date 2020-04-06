package pl.sda.oop.exceptions;

public class EmptyWorkerListException extends Exception {
    public EmptyWorkerListException() {
    }

    public EmptyWorkerListException(String message) {
        super(message);
    }
    public void getMessage(String s){
        System.out.println(s);
    }
}

package pl.sda.oop.exceptions;

public class IncorrectWorkerIndexException extends Exception {
    public IncorrectWorkerIndexException() {
    }

    public IncorrectWorkerIndexException(String message) {
        super(message);
    }

    public void getMessage(String s) {
        System.out.println(s);
    }
}

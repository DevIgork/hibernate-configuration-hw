package mate.academy.exeption;

public class DataProcessingException extends RuntimeException {

    public DataProcessingException(String message,Throwable ex) {
        super(message, ex);
    }

}
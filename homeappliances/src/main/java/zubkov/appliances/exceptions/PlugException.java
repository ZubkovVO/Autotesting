package zubkov.appliances.exceptions;

/**
 * При попытке повторно включить или выключить прибор, сработает соответствующее исключение
 */
public class PlugException extends Exception {

    public PlugException() {
    }

    public PlugException(String message) {
        super(message);
    }
}

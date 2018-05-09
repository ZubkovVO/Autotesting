package zubkov.appliances.exceptions;

/**
 * Когда при подключении устройства будет превышен порог мощности, сработает исключение
 */
public class OverPowerException extends Exception{

    public OverPowerException() {
    }

    public OverPowerException(String message) {
        super(message);
    }
}

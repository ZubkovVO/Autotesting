package zubkov.appliances.exceptions;

/**
 * При отсутствии элмента согласно заданным параметрам, выдается соответствующее сообщение об ошибке
 */
public class NoApplianceFoundException extends Exception {

    public NoApplianceFoundException() {
    }

    public NoApplianceFoundException(String message) {
        super(message);
    }
}

package gb.ru;

public class MyArraySizeException extends MyArrayException {


    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(String message, String discription) {
        super(message, discription);
    }
}

package gb.ru;

public abstract class MyArrayException extends Exception{
    private String discription;

    public String getDiscription() {
        return discription;
    }


    public MyArrayException(String message) {
        super(message);
    }

    public MyArrayException(String message, String discription) {
        super(message);
        this.discription = discription;
    }
}

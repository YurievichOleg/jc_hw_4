package gb.ru;

public class MyArrayDataException extends NumberFormatException {
    String discription;
    int numStr;
    int num;

    public String getDiscription() {
        return discription;
    }

    public int getNumStr() {
        return numStr;
    }

    public int getNum() {
        return num;
    }

    public MyArrayDataException(String discription,int numStr, int num) {
        this.discription = discription;
        this.numStr = numStr;
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return String.format("%s [%d][%d]",discription, getNumStr(), getNum());
    }
}

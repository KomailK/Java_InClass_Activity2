public class OutOfRangeException extends Exception {

    public OutOfRangeException() {
        this("Input value has to be between the specified range of values");
    }

    public OutOfRangeException(String msg) {
        super(msg);
    }

}
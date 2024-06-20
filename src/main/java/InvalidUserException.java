public class InvalidUserException extends Exception {
    String msg;
    public InvalidUserException(String msg){
        super(msg);
    }
}

/**
 * @author Sergey Klunniy
 */
public class DataProcessingException extends RuntimeException {
    private String string;

    public DataProcessingException(String string) {
        this.string = string;
    }
}

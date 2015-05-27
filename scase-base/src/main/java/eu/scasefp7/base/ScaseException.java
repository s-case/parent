package eu.scasefp7.base;

public class ScaseException extends RuntimeException {

    private static final long serialVersionUID = 5046401925166235497L;

    private String fieldName;

    protected ScaseException() {}

    public ScaseException( String message ) {
        super( message );
    }

    public ScaseException(Throwable throwable){
        super(throwable);
    }

    public ScaseException(String message, Throwable throwable){
        super(message, throwable);
    }

    public ScaseException( String message, String fieldName ) {
        this( message );
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}

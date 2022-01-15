package Database;

public class BadRequest {
    String Error;
    Integer HTMLCode;

    // Empty Constructor
    public BadRequest() {
    }

    // Parameters Constructor
    public BadRequest(String error, Integer HTMLCode) {
        Error = error;
        this.HTMLCode = HTMLCode;
    }

    // Getters & Setters
    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }

    public Integer getHTMLCode() {
        return HTMLCode;
    }

    public void setHTMLCode(Integer HTMLCode) {
        this.HTMLCode = HTMLCode;
    }
}

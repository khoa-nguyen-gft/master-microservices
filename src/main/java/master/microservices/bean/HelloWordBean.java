package master.microservices.bean;

public class HelloWordBean {
    private String message;

    
    public HelloWordBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}

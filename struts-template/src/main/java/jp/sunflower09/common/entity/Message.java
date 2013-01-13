package jp.sunflower09.common.entity;

import java.io.Serializable;

public class Message implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 5002188874523760705L;

    Integer id;

    String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

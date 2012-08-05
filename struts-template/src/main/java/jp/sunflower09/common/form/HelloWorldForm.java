package jp.sunflower09.common.form;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm {
    /**
     * 
     */
    private static final long serialVersionUID = -5545207105503522444L;

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

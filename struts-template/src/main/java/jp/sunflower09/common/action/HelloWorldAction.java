package jp.sunflower09.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.sunflower09.common.form.HelloWorldForm;
import jp.sunflower09.common.service.MyService;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldAction extends Action {

    @Autowired
    MyService service;

    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        HelloWorldForm helloWorldForm = (HelloWorldForm) form;
        helloWorldForm.setMessage(service.sayHello());

        return mapping.findForward("success");
    }

}

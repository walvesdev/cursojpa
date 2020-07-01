 
package com.wastecnologia.curso.jsf.service;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.inject.Named;

@Named
public class LogListener implements ActionListener{

        @Override
        public void processAction(ActionEvent event) throws AbortProcessingException {
                       System.out.println("botao clicado!" + event.getComponent().getId());
        }
        
}

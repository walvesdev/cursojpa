package com.wastecnologia.curso.jsf.controller;

import java.io.Serializable;
import javax.faces.component.html.HtmlInputText;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("teste")
@ViewScoped
public class TesteBean implements Serializable{      
        
        private HtmlInputText campo;
        
        private String nome;

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public HtmlInputText getCampo() {
                return campo;
        }

        public void setCampo(HtmlInputText campo) {
                this.campo = campo;
        }
        
        
        
        public void ClickTeste(){
                
                this.campo.setDisabled(true);
                System.out.println(nome);
        }
}

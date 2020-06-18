/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wastecnologia.curso.jsf.models;

/**
 *
 * @author willian
 */
public class Produto {
        
        private String nome;
        private String fabricante;
        private String preco;

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getFabricante() {
                return fabricante;
        }

        public void setFabricante(String fabricante) {
                this.fabricante = fabricante;
        }

        public String getPreco() {
                return preco;
        }

        public void setPreco(String preco) {
                this.preco = preco;
        }
        
        
}

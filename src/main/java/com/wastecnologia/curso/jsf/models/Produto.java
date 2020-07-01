/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wastecnologia.curso.jsf.models;

import java.util.Objects;

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

        @Override
        public int hashCode() {
                int hash = 3;
                hash = 37 * hash + Objects.hashCode(this.nome);
                hash = 37 * hash + Objects.hashCode(this.fabricante);
                hash = 37 * hash + Objects.hashCode(this.preco);
                return hash;
        }

        @Override
        public boolean equals(Object obj) {
                if (this == obj) {
                        return true;
                }
                if (obj == null) {
                        return false;
                }
                if (getClass() != obj.getClass()) {
                        return false;
                }
                final Produto other = (Produto) obj;
                if (!Objects.equals(this.nome, other.nome)) {
                        return false;
                }
                if (!Objects.equals(this.fabricante, other.fabricante)) {
                        return false;
                }
                if (!Objects.equals(this.preco, other.preco)) {
                        return false;
                }
                return true;
        }
        
        
}

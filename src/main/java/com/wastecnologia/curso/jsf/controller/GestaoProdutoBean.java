/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wastecnologia.curso.jsf.controller;

import com.wastecnologia.curso.jsf.models.Produto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author willian
 */
@Named("gestaoProduto")
@ViewScoped
public class GestaoProdutoBean implements Serializable {

        private Produto produto;
        private List<Produto> produtos;

        public GestaoProdutoBean() {
                this.produto = new Produto();
                this.produtos = new ArrayList<Produto>();
        }

        public void addProdutoLista() {
                this.produtos.add(produto);
                this.produto = new Produto();

        }

        public Produto getProduto() {
                return produto;
        }

        public void setProduto(Produto produto) {
                this.produto = produto;
        }

        public List<Produto> getProdutos() {
                return produtos;
        }

        public void setProdutos(List<Produto> produtos) {
                this.produtos = produtos;
        }

}

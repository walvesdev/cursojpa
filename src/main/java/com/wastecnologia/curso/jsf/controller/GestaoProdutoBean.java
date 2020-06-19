package com.wastecnologia.curso.jsf.controller;

import com.wastecnologia.curso.jsf.models.Produto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("gestaoProduto")
@ViewScoped
public class GestaoProdutoBean implements Serializable {

        private Produto produto;
        private List<Produto> produtos;
        private Produto produtoSelecionado;

        public GestaoProdutoBean() {
                this.produto = new Produto();
                this.produtos = new ArrayList<Produto>();
        }

        @PostConstruct
        public void init() {
                System.out.println("inicio bean");
        }

        @PreDestroy
        public void destroy() {
                System.out.println("Fim bean");
        }

        public void excluir() {
                System.out.println(this.produtoSelecionado.getFabricante());
                this.produtos.remove(this.produtoSelecionado);
        }

        public String obterAjuda() {
                if (produtos.isEmpty()) {
                        return "AjudaGestaoProdutos?faces-redirect=true";
                } else {
                        return "AjudaGestaoProdutosTelefone?faces-redirect=true";
                }
        }

        public void verificarInclusao(ActionEvent event) {
                if ("".equals(this.produto.getFabricante())) {
                        this.produto.setFabricante("sem fabricante");
                }
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

        public Produto getProdutoSelecionado() {
                return produtoSelecionado;
        }

        public void setProdutoSelecionado(Produto produtoSelecionado) {
                this.produtoSelecionado = produtoSelecionado;
        }

}

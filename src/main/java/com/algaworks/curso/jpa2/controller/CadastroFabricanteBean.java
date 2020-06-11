package com.algaworks.curso.jpa2.controller;

import com.algaworks.curso.jpa2.models.Fabricante;
import com.algaworks.curso.jpa2.service.CadastrofabricanteService;
import com.algaworks.curso.jpa2.service.NegocioException;
import com.algaworks.curso.jpa2.util.jsf.FacesUtil;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Willian
 */
@Named
@ViewScoped
public class CadastroFabricanteBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
    private CadastrofabricanteService service;
    private Fabricante fabricante;

    @PostConstruct
    public void Init() {
        this.limpar();
    }

    public void salvar(){
        try {
            this.service.salvar(fabricante);
            FacesUtil.addSuccessMessage("Fabricante salvo com sucesso!!");
            this.limpar();
        } catch (NegocioException e) {            
            FacesUtil.addErrorMessage(e.getMessage());
            this.limpar();
        }
    }
    
    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    private void limpar() {
        this.fabricante = new Fabricante();
    }

}

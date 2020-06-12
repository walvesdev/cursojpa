package com.algaworks.curso.jpa2.service;

import com.algaworks.curso.jpa2.dao.FabricanteDAO;
import com.algaworks.curso.jpa2.models.Fabricante;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author Willian
 */
public class CadastrofabricanteService implements Serializable {

    public CadastrofabricanteService() {
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Inject
    private FabricanteDAO dao;

    public void salvar(Fabricante fabricante) throws NegocioException {

        if (fabricante.getNome() == null || fabricante.getNome().trim().equals("")) {
            throw new NegocioException("O nome do fabricante deve ser informado!!");
        }

        this.dao.salvar(fabricante);
    }
}

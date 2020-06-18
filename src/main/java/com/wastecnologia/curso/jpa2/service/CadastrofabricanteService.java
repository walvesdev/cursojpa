package com.wastecnologia.curso.jpa2.service;

import com.wastecnologia.curso.jpa2.dao.FabricanteDAO;
import com.wastecnologia.curso.jpa2.models.Fabricante;
import javax.inject.Inject;
import java.io.Serializable;

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

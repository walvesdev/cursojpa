/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wastecnologia.curso.jpa2.dao;

import com.wastecnologia.curso.jpa2.models.Fabricante;
import javax.inject.Inject;
import java.io.Serializable;
import javax.persistence.EntityManager;

/**
 *
 * @author Willian
 */
public class FabricanteDAO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager em;

    public void salvar(Fabricante fabricante) {

        em.getTransaction().begin();
        em.persist(fabricante);        
        em.getTransaction().commit();
        em.close();
    }
}

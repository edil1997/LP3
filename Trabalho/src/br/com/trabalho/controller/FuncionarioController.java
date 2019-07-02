package br.com.trabalho.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.service.spi.ServiceException;

import br.com.trabalho.model.Funcionario;

public class FuncionarioController {
	private Funcionario funcionario;
    private EntityManagerFactory emf;
    private EntityManager em;

    public FuncionarioController(Funcionario funcionario) {
            this.funcionario = funcionario;
    }

    public String EntidadeGerenciadora() {

            try {
                    emf = Persistence.createEntityManagerFactory("empresa");
                    em = emf.createEntityManager();
                    em.getTransaction().begin();
                    em.persist(funcionario);
                    em.getTransaction().commit();

                    em.close();
                    emf.close();
                    return "Usuario Cadastrado";

            } catch (ServiceException se) {
                    return "Usuario nao foi cadastrado. \n ERRO: " + se.getMessage();
            }
    }
	}


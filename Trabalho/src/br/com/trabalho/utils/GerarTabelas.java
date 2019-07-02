package br.com.trabalho.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabelas {

        /**
         * M�todo principal
         */
        public static void main(String[] args) {

                EntityManagerFactory factory = Persistence.createEntityManagerFactory("empresa");

                factory.close();

        }
}

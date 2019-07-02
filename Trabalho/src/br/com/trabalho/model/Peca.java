package br.com.trabalho.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Peca {

        
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer id;
        
        private String descricaoPeca;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getDescricaoPeca() {
                return descricaoPeca;
        }

        public void setDescricaoPeca(String descricaoPeca) {
                this.descricaoPeca = descricaoPeca;
        }
        
        
        
}
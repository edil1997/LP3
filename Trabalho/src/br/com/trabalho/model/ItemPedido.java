package br.com.trabalho.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemPedido{

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer id;
        
        private String descricaoItemPedido;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getDescricaoItemPedido() {
                return descricaoItemPedido;
        }

        public void setDescricaoItemPedido(String descricaoItemPedido) {
                this.descricaoItemPedido = descricaoItemPedido;
        }
        
        
}

package models.service;

import javax.persistence.Query;
import models.entity.Medicamento;
import play.db.jpa.JPA;
import java.util.List;

/**
 * Created by Telmo Dias on 06/10/2016.
 */
public interface MedicamentoService {

    static List<Medicamento> find () {
        Query q = JPA.em()
                .createNamedQuery("Medicamento.list", Medicamento.class);
        return q.getResultList();
    }

    static Medicamento getPorChave (int id) {
        Query q = JPA.em()
                .createNamedQuery("Medicamento.getPorChave", Medicamento.class)
                .setParameter("id",id);
        return (Medicamento) q.getSingleResult();
    }

    static List<Medicamento> getPorNome (String nome) {
        Query q = JPA.em()
                .createNamedQuery("Medicamento.getNome", Medicamento.class)
                .setParameter("nome", "%" + nome + "%");
        return q.getResultList();
    }

    static void save (Medicamento medicamento) {
        JPA.em().persist(medicamento);
    }

    static void delete (Medicamento medicamento) {
        JPA.em().remove(medicamento);
    }

}
package br.edu.ifpb.ads.pos.soap.trip.agencia.dao;

import br.edu.ifpb.ads.pos.soap.trip.agencia.Contrato;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 02/10/2017, 10:59:44
 */
@Stateless
public class ContratoDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvarContrato(Contrato c) {
        entityManager.persist(c);
    }

    public void atualizarContrato(Contrato c) {
        entityManager.merge(c);
    }

    public void deletarContrato(Contrato c) {
        Contrato merge = entityManager.merge(c);
        entityManager.remove(merge);
    }

    public Contrato buscarContrato(int id) {
        return entityManager.find(Contrato.class, id);
    }

    public Contrato[] listarContratos() {
        List<Contrato> resultList = entityManager
                .createQuery("SELECT c FROM Contrato c ORDER BY c.id", Contrato.class)
                .getResultList();
        System.out.println(resultList.toString());
        return resultList.toArray(new Contrato[]{});
    }
}

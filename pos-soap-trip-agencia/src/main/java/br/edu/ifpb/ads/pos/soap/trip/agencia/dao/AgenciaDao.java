package br.edu.ifpb.ads.pos.soap.trip.agencia.dao;

import br.edu.ifpb.ads.pos.soap.trip.agencia.Agencia;
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
public class AgenciaDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvarAgencia(Agencia a) {
        entityManager.persist(a);
    }

    public void atualizarAgencia(Agencia a) {
        entityManager.merge(a);
    }

    public void deletarAgencia(Agencia a) {
        Agencia merge = entityManager.merge(a);
        entityManager.remove(merge);
    }

    public Agencia buscarAgencia(int id) {
        return entityManager.find(Agencia.class, id);
    }

    public Agencia[] listarAgencias() {
        List<Agencia> resultList = entityManager.createQuery("SELECT a FROM Agencia a ORDER BY a.id", Agencia.class)
                .getResultList();
        System.out.println(resultList.toString());
        return resultList.toArray(new Agencia[]{});
    }
}

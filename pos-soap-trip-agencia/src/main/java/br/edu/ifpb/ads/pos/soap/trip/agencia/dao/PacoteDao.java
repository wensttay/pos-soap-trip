package br.edu.ifpb.ads.pos.soap.trip.agencia.dao;

import br.edu.ifpb.ads.pos.soap.trip.agencia.Pacote;
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
public class PacoteDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvarPacote(Pacote p) {
        entityManager.persist(p);
    }

    public void atualizarPacote(Pacote p) {
        entityManager.merge(p);
    }

    public void deletarPacote(Pacote p) {
        Pacote merge = entityManager.merge(p);
        entityManager.remove(merge);
    }

    public Pacote buscarPacote(int id) {
        return entityManager.find(Pacote.class, id);
    }

    public Pacote[] listarPacotes() {
        List<Pacote> resultList = entityManager
                .createQuery("SELECT p FROM Pacote p ORDER BY p.id", Pacote.class)
                .getResultList();
        System.out.println(resultList.toString());
        return resultList.toArray(new Pacote[]{});
    }
}

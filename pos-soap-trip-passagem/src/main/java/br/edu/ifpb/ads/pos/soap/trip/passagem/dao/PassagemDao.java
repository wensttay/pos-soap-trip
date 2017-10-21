package br.edu.ifpb.ads.pos.soap.trip.passagem.dao;

import br.edu.ifpb.ads.pos.soap.trip.passagem.Passagem;
import br.edu.ifpb.ads.pos.soap.trip.passagem.VooEmb;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 17/10/2017, 10:43:55
 */
@Stateless
public class PassagemDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvarPassagem(Passagem p) {
        entityManager.persist(p);
    }

    public void atualizarPassagem(Passagem p) {
        entityManager.merge(p);
    }

    public void deletarPassagem(Passagem p) {
        Passagem merge = entityManager.merge(p);
        entityManager.remove(merge);
    }

    public Passagem buscarPassagem(int id) {
        return entityManager.find(Passagem.class, id);
    }

    public Passagem buscarPassagem(String code) {
        return entityManager
                .createQuery("SELECT p FROM Passagem p WHERE p.code = :codeValue", Passagem.class)
                .setParameter("codeValue", code)
                .getSingleResult();
    }

    public Passagem[] listarPassagem() {
        List<Passagem> resultList = entityManager.createQuery("SELECT p FROM Passagem p", Passagem.class)
                .getResultList();
        System.out.println(resultList.toString());
        return resultList.toArray(new Passagem[]{});
    }

    public Passagem[] buscarPassagemByVooCode(String vooCode) {
        List<Passagem> resultList = entityManager
                .createQuery("SELECT p FROM Passagem p WHERE p.voo.vooEmb.code = :vooCodeValue ORDER BY p.id",
                        Passagem.class)
                .setParameter("vooCodeValue", vooCode)
                .getResultList();
        System.out.println(resultList.toString());
        return resultList.toArray(new Passagem[]{});
    }
}

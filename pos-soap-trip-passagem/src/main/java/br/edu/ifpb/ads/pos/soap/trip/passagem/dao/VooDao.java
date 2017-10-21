package br.edu.ifpb.ads.pos.soap.trip.passagem.dao;

import br.edu.ifpb.ads.pos.soap.trip.passagem.Voo;
import br.edu.ifpb.ads.pos.soap.trip.passagem.VooEmb;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 17/10/2017, 10:43:44
 */
@Stateless
public class VooDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvarVoo(Voo v) {
        entityManager.persist(v);
    }

    public void atualizarVoo(Voo v) {
        entityManager.merge(v);
    }

    public void deletarVoo(Voo v) {
        Voo merge = entityManager.merge(v);
        entityManager.remove(merge);
    }

    public Voo buscarVoo(int id) {
        return entityManager.find(Voo.class, id);
    }

    public Voo[] listarVoo() {
        List<Voo> resultList = entityManager.createQuery("SELECT v FROM Voo v ORDER BY v.id", Voo.class)
                .getResultList();
        System.out.println(resultList.toString());
        return resultList.toArray(new Voo[]{});
    }
    
    public VooEmb buscarVooEmb(String code) {
        return entityManager
                .createQuery("SELECT v.vooEmb FROM Voo v WHERE v.vooEmb.code = :codeValue", VooEmb.class)
                .setParameter("codeValue", code)
                .getSingleResult();
    }

    public VooEmb[] listarVooEmb() {
        List<VooEmb> resultList = entityManager.createQuery("SELECT v.vooEmb FROM Voo v ORDER BY v.id", VooEmb.class).getResultList();
        System.out.println(resultList.toString());
        return resultList.toArray(new VooEmb[]{});
    }
    
    public VooEmb[] buscarVooEmbByVooCode(String vooCode) {
        List<VooEmb> resultList = entityManager
                .createQuery("SELECT v.vooEmb FROM Voo v WHERE v.vooEmb.code = :vooCode ORDER BY v.id",
                        VooEmb.class)
                .setParameter("vooCode", vooCode)
                .getResultList();                
        System.out.println(resultList.toString());
        return resultList.toArray(new VooEmb[]{});
    }
}

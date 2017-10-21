package br.edu.ifpb.ads.pos.soap.trip.hotel.dao;

import br.edu.ifpb.ads.pos.soap.trip.hotel.Hotel;
import br.edu.ifpb.ads.pos.soap.trip.hotel.Quarto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 19/10/2017, 14:36:07
 */
@Stateless
public class QuartoDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvarQuarto(Quarto q) {
        entityManager.persist(q);
    }

    public void atualizarQuarto(Quarto q) {
        entityManager.merge(q);
    }

    public void deletarQuarto(Quarto q) {
        Quarto merge = entityManager.merge(q);
        entityManager.remove(merge);
    }

    public Quarto buscarQuarto(int id) {
        return entityManager.find(Quarto.class, id);
    }

    public Quarto[] listarQuartos() {
        List<Quarto> resultList = entityManager.createQuery("SELECT q FROM Quarto q ORDER BY q.id", Quarto.class)
                .getResultList();
        System.out.println(resultList.toString());
        return resultList.toArray(new Quarto[]{});
    }

    public Quarto[] buscarQuartoByHotelNome(String hotelNome) {
        List<Quarto> resultList = entityManager
                .createQuery("SELECT q FROM Quarto q WHERE q.hotel.hotelEmb.nome = :hotelNomeValue ORDER BY q.id",
                        Quarto.class)
                .setParameter("hotelNomeValue", hotelNome)
                .getResultList();
        System.out.println(resultList.toString());
        return resultList.toArray(new Quarto[]{});
    }
}

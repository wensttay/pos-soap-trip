package br.edu.ifpb.ads.pos.soap.trip.hotel.dao;

import br.edu.ifpb.ads.pos.soap.trip.hotel.Hotel;
import br.edu.ifpb.ads.pos.soap.trip.hotel.Reserva;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 17/10/2017, 02:31:19
 */
@Stateless
public class ReservaDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvarReserva(Reserva r) {
        entityManager.persist(r);
    }

    public void atualizarReserva(Reserva r) {
        entityManager.merge(r);
    }

    public void deletarReserva(Reserva r) {
        Reserva merge = entityManager.merge(r);
        entityManager.remove(merge);
    }

    public Reserva buscarReserva(int id) {
        return entityManager.find(Reserva.class, id);
    }

    public Reserva[] listarReservas() {
        List<Reserva> resultList = entityManager.createQuery("SELECT r FROM Reserva r ORDER BY r.id", Reserva.class)
                .getResultList();
        System.out.println(resultList.toString());
        return resultList.toArray(new Reserva[]{});
    }
}

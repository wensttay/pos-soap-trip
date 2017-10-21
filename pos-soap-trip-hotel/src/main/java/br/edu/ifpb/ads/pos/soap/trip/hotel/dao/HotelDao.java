package br.edu.ifpb.ads.pos.soap.trip.hotel.dao;

import br.edu.ifpb.ads.pos.soap.trip.hotel.Hotel;
import br.edu.ifpb.ads.pos.soap.trip.hotel.HotelEmb;
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
public class HotelDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void salvarHotel(Hotel h) {
        entityManager.persist(h);
    }

    public void atualizarHotel(Hotel h) {
        entityManager.merge(h);
    }

    public void deletarHotel(Hotel h) {
        Hotel merge = entityManager.merge(h);
        entityManager.remove(merge);
    }

    public Hotel buscarHotel(int id) {
        return entityManager.find(Hotel.class, id);
    }

    public Hotel[] listarHoteis() {
        List<Hotel> resultList = entityManager
                .createQuery("SELECT h FROM Hotel h ORDER BY h.id", Hotel.class)
                .getResultList();
        System.out.println(resultList.toString());
        return resultList.toArray(new Hotel[]{});
    }

    public HotelEmb[] listarHoteisEmb() {
        List<HotelEmb> resultList = entityManager
                .createQuery("SELECT h.hotelEmb FROM Hotel h ORDER BY h.id", HotelEmb.class)
                .getResultList();
        System.out.println(resultList.toString());
        return resultList.toArray(new HotelEmb[]{});
    }

    public HotelEmb buscarHotelEmb(String nome) {
        return entityManager
                .createQuery("SELECT h.hotelEmb FROM Hotel h WHERE nome = :nomeValue", HotelEmb.class)
                .setParameter("nomeValue", nome).getSingleResult();
    }
}

package br.edu.ifpb.ads.pos.soap.trip.hotel.service;

import br.edu.ifpb.ads.pos.soap.trip.hotel.Hotel;
import br.edu.ifpb.ads.pos.soap.trip.hotel.HotelEmb;
import br.edu.ifpb.ads.pos.soap.trip.hotel.dao.HotelDao;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 02/10/2017, 11:02:25
 */
@WebService
public class Hoteis {

    @EJB
    private HotelDao hotelDao;

    public void salvarHotel(Hotel h) {
        hotelDao.salvarHotel(h);
    }

    public void atualizarHotel(Hotel h) {
        hotelDao.atualizarHotel(h);
    }

    public void deletarHotel(Hotel h) {
        hotelDao.deletarHotel(h);
    }

    public Hotel buscarHotel(int id) {
        return hotelDao.buscarHotel(id);
    }

    public Hotel[] listarHoteis() {
        return hotelDao.listarHoteis();
    }
    
    public HotelEmb buscarHotelEmb(String nome) {
        return hotelDao.buscarHotelEmb(nome);
    }

    public HotelEmb[] listarHoteisEmb() {
        return hotelDao.listarHoteisEmb();
    }
    
}

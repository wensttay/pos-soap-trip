package br.edu.ifpb.ads.pos.soap.trip.hotel.service;

import br.edu.ifpb.ads.pos.soap.trip.hotel.Hotel;
import br.edu.ifpb.ads.pos.soap.trip.hotel.Quarto;
import br.edu.ifpb.ads.pos.soap.trip.hotel.dao.QuartoDao;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 19/10/2017, 14:36:16
 */
@WebService
public class Quartos {
    
    @EJB
    private QuartoDao quartoDao;

    public void salvarQuarto(Quarto q) {
        quartoDao.salvarQuarto(q);
    }

    public void atualizarQuarto(Quarto q) {
        quartoDao.atualizarQuarto(q);
    }

    public void deletarQuarto(Quarto q) {
        quartoDao.deletarQuarto(q);
    }

    public Quarto buscarQuarto(int id) {
        return quartoDao.buscarQuarto(id);
    }

    public Quarto[] listarQuarto() {
        return quartoDao.listarQuartos();
    }
    
    public Quarto[] buscarByHotelNome(String hotelNome){
        return quartoDao.buscarQuartoByHotelNome(hotelNome);
    }
    
}

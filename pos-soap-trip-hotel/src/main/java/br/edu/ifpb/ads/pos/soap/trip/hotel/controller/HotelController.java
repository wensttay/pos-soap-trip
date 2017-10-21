package br.edu.ifpb.ads.pos.soap.trip.hotel.controller;

import br.edu.ifpb.ads.pos.soap.trip.hotel.Hotel;
import br.edu.ifpb.ads.pos.soap.trip.hotel.dao.HotelDao;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 18/10/2017, 17:09:03
 */
@ViewScoped
@ManagedBean
public class HotelController implements Serializable {

    private Hotel hotel;
    private boolean editing;

    @EJB
    private HotelDao hd;

    public HotelController() {
        hotel = new Hotel();
        editing = false;
    }

    public Hotel[] listarHoteis() {
        try {
            return hd.listarHoteis();
        } catch (EJBException ex) {
        }
        return new Hotel[0];
    }

    public String salvarHotel() {
        try {
            hd.salvarHotel(hotel);
        } catch (EJBException ex) {
        }
        hotel = new Hotel();
        return "hoteis.xhtml?faces-redirect=true";
    }

    public String atualizarHotel() {
        try {
            hd.atualizarHotel(hotel);
        } catch (EJBException ex) {
        }
        hotel = new Hotel();
        editing = false;
        return "hoteis.xhtml?faces-redirect=true";
    }

    public String deletarHotel(Hotel h) {
        try {
            hd.deletarHotel(h);
        } catch (EJBException ex) {
        }

        if (editing == true && h.getId() == hotel.getId()) {
            editing = false;
            hotel = new Hotel();
        }
        
        return "hoteis.xhtml?faces-redirect=true";
    }
    
    public void setEditCliente(Hotel h){
        this.hotel = h;
        editing = true;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public boolean isEditing() {
        return editing;
    }

    public void setEditing(boolean editing) {
        this.editing = editing;
    }

}

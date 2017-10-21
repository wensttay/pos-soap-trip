package br.edu.ifpb.ads.pos.soap.trip.hotel.controller;

import br.edu.ifpb.ads.pos.soap.trip.hotel.Hotel;
import br.edu.ifpb.ads.pos.soap.trip.hotel.Quarto;
import br.edu.ifpb.ads.pos.soap.trip.hotel.dao.HotelDao;
import br.edu.ifpb.ads.pos.soap.trip.hotel.dao.QuartoDao;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 19/10/2017, 14:35:36
 */
@ViewScoped
@ManagedBean
public class QuartoController {

    @EJB
    private QuartoDao qd;
    @EJB
    private HotelDao hd;
    private Quarto quarto;
    private int hotelId;
    private boolean editing;

    public QuartoController() {
        this.quarto = new Quarto();
        this.editing = false;
    }

    public String salvarQuarto() {
        try {
            Hotel h = hd.buscarHotel(hotelId);
            quarto.setHotel(h);
            qd.salvarQuarto(quarto);
        } catch (EJBException ex) {
        }

        this.quarto = new Quarto();
        return "quartos.xhtml?faces-redirect=true";
    }

    public String atualizarQuarto() {
        try {
            Hotel h = hd.buscarHotel(hotelId);
            quarto.setHotel(h);
            qd.atualizarQuarto(quarto);
        } catch (EJBException ex) {
        }

        this.editing = false;
        this.quarto = new Quarto();
        return "quartos.xhtml?faces-redirect=true";
    }

    public String deletarQuarto(Quarto q) {
        try {
            qd.deletarQuarto(q);
        } catch (EJBException ex) {
        }
        
        if (editing == true && q.getId() == quarto.getId()) {
            this.editing = false;
            this.quarto = new Quarto();
        }
        return "quartos.xhtml?faces-redirect=true";
    }

    public Quarto[] listarQuartos() {
        try {
            return qd.listarQuartos();
        } catch (EJBException ex) {
        }
        return new Quarto[0];
    }

    public Hotel[] listarHoteis() {
        try {
            return hd.listarHoteis();
        } catch (EJBException ex) {
        }
        return new Hotel[0];
    }

    public void setEditQuarto(Quarto q) {
        this.hotelId = q.getHotel().getId();
        this.editing = true;
        this.quarto = q;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public boolean isEditing() {
        return editing;
    }

    public void setEditing(boolean editing) {
        this.editing = editing;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

}

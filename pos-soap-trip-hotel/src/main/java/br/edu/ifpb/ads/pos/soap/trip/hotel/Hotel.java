package br.edu.ifpb.ads.pos.soap.trip.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 02/10/2017, 10:55:27
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "nome" })})
public class Hotel implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Embedded
    private HotelEmb hotelEmb;
    
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Quarto> quartos;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Reserva> reservas;

    public Hotel() {
        hotelEmb = new HotelEmb();
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Reserva> getReservas() {
        return Collections.unmodifiableList(reservas);
    }

    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }
    
    public List<Quarto> getQuartos() {
        return Collections.unmodifiableList(quartos);
    }

    public void addQuarto(Quarto quarto) {
        this.quartos.add(quarto);
    }

    public HotelEmb getHotelEmb() {
        return hotelEmb;
    }

    public void setHotelEmb(HotelEmb hotelEmb) {
        this.hotelEmb = hotelEmb;
    }
    
    @Override
    public String toString() {
        return "Hotel{" + "id=" + id + ", hotelEmb=" + hotelEmb + ", quartos=" + quartos + ", reservas=" + reservas + '}';
    }

}

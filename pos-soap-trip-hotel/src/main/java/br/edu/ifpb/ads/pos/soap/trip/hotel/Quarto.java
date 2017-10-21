package br.edu.ifpb.ads.pos.soap.trip.hotel;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 19/10/2017, 14:25:17
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Quarto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(nullable = false)
    private int numero;
    @Column(precision = 11, scale = 2)
    private BigDecimal diaria;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotelId", nullable = false)
    private Hotel hotel;

    public Quarto() {
    }

    public Quarto(int numero, BigDecimal diaria, Hotel hotel) {
        this.numero = numero;
        this.diaria = diaria;
        this.hotel = hotel;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    
    public BigDecimal getDiaria() {
        return diaria;
    }

    public void setDiaria(BigDecimal diaria) {
        this.diaria = diaria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Quarto Numero: " + numero + " ("+ hotel.getHotelEmb().getNome() + ") - Diaria: " + diaria;
    }
    
}

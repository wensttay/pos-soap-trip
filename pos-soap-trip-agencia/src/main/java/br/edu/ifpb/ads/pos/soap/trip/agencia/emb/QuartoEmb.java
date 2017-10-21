package br.edu.ifpb.ads.pos.soap.trip.agencia.emb;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 17/10/2017, 11:07:44
 */
@Embeddable
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class QuartoEmb implements Serializable {
    
    private int quartoId;
    private String hotelNome;
    private String endereco;
    @Column(precision = 11, scale = 2)
    private BigDecimal diaria; 

    public QuartoEmb() {
    }

    public QuartoEmb(br.edu.ifpb.ads.pos.soap.trip.hotel.ws.Quarto quarto,
            br.edu.ifpb.ads.pos.soap.trip.hotel.ws.Hotel hotel) {
        
        this.quartoId = quarto.getId();
        this.hotelNome = hotel.getHotelEmb().getNome();
        this.endereco = hotel.getHotelEmb().getEndereco();
        this.diaria = quarto.getDiaria();
    }

    public int getQuartoId() {
        return quartoId;
    }

    public void setQuartoId(int quartoId) {
        this.quartoId = quartoId;
    }

    public String getHotelNome() {
        return hotelNome;
    }

    public void setHotelNome(String hotelNome) {
        this.hotelNome = hotelNome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public BigDecimal getDiaria() {
        return diaria;
    }

    public void setDiaria(BigDecimal diaria) {
        this.diaria = diaria;
    }

    @Override
    public String toString() {
        return "{" + "hotel=" + hotelNome + ", endereco=" + endereco + ", diaria=" + diaria + '}';
    }
    
    

}

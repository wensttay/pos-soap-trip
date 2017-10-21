package br.edu.ifpb.ads.pos.soap.trip.hotel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 17/10/2017, 01:54:09
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Reserva implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @JoinColumn(name = "quarto_id", nullable = false)
    private Quarto quarto;
    private Date inicio;
    private Date termino;
    
    @Embedded
    private ClienteEmb clienteEmb;

    public Reserva() {
    }

    public Reserva(Quarto quarto, Date inicio, Date termino, ClienteEmb clienteEmb) {
        this.quarto = quarto;
        this.inicio = inicio;
        this.termino = termino;
        this.clienteEmb = clienteEmb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getTermino() {
        return termino;
    }

    public void setTermino(Date termino) {
        this.termino = termino;
    }

    public ClienteEmb getClienteEmb() {
        return clienteEmb;
    }

    public void setClienteEmb(ClienteEmb clienteEmb) {
        this.clienteEmb = clienteEmb;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", inicio=" + inicio + ", termino=" + termino + ", clienteEmb=" + clienteEmb + '}';
    }
    
}

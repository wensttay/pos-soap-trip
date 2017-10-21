package br.edu.ifpb.ads.pos.soap.trip.agencia;

import br.edu.ifpb.ads.pos.soap.trip.agencia.emb.ClienteEmb;
import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
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
 * @date 17/10/2017, 11:10:16
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Contrato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int id;
    @Embedded
    private ClienteEmb clienteEmb;

    @ManyToOne
    @JoinColumn(nullable = false, name = "pacote_id")
    private Pacote pacote;

    public Contrato() {
        pacote = new Pacote();
        clienteEmb = new ClienteEmb();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClienteEmb getClienteEmb() {
        return clienteEmb;
    }

    public void setClienteEmb(ClienteEmb clienteEmb) {
        this.clienteEmb = clienteEmb;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    @Override
    public String toString() {
        return "Contrato{" + "id=" + id + ", clienteEmb=" + clienteEmb + ", pacote=" + pacote + '}';
    }

}

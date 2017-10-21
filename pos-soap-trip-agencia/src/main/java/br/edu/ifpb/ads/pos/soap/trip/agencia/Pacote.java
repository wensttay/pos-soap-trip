package br.edu.ifpb.ads.pos.soap.trip.agencia;

import br.edu.ifpb.ads.pos.soap.trip.agencia.emb.QuartoEmb;
import br.edu.ifpb.ads.pos.soap.trip.agencia.emb.PassagemEmb;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
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
 * @date 17/10/2017, 02:42:20
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Pacote implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(unique = true)
    private String nome;
    @Column(precision = 11, scale = 2)
    private Double precoTotal;
    @Embedded
    private QuartoEmb quartoEmb;
    @Embedded
    private PassagemEmb passagemEmb;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agenciaId", nullable = false)
    public Agencia agencia;

    public Pacote() {
        quartoEmb = new QuartoEmb();
        passagemEmb = new PassagemEmb();
        agencia = new Agencia();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public QuartoEmb getQuartoEmb() {
        return quartoEmb;
    }

    public void setQuartoEmb(QuartoEmb quartoEmb) {
        this.quartoEmb = quartoEmb;
    }

    public PassagemEmb getPassagemEmb() {
        return passagemEmb;
    }

    public void setPassagemEmb(PassagemEmb passagemEmb) {
        this.passagemEmb = passagemEmb;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", Preco=" + precoTotal + ", "
                + "Hotel=" + quartoEmb.getHotelNome() + ", "
                + "Destino=" + passagemEmb.getVooEmb().getDestino() + " ("
                + passagemEmb.getVooEmb().getCompania() + "), "
                + "Agencia=" + agencia.getNome();
    }

}

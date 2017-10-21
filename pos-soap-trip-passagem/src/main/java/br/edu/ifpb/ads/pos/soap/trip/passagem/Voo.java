package br.edu.ifpb.ads.pos.soap.trip.passagem;

import java.io.Serializable;
import java.util.ArrayList;
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
 * @date 17/10/2017, 02:41:39
 */

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "code" })})
public class Voo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Embedded
    private VooEmb vooEmb;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "voo", cascade = CascadeType.ALL)
    private List<Passagem> passagems;

    public Voo() {
        vooEmb = new VooEmb();
        passagems = new ArrayList<>();
    }

    public Voo(VooEmb vooEmb, List<Passagem> passagems) {
        this.vooEmb = vooEmb;
        this.passagems = passagems;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Passagem> getPassagems() {
        return passagems;
    }

    public void setPassagems(List<Passagem> passagems) {
        this.passagems = passagems;
    }

    public VooEmb getVooEmb() {
        return vooEmb;
    }

    public void setVooEmb(VooEmb vooEmb) {
        this.vooEmb = vooEmb;
    }

    @Override
    public String toString() {
        return vooEmb.toString();
    }

}

    package br.edu.ifpb.ads.pos.soap.trip.cliente;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 02/10/2017, 10:12:46
 */
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "cpf" }) })
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Embedded
    private ClienteEmb clienteEmb;
    
    @Column(precision = 11, scale = 2)
    private BigDecimal renda;

    public Cliente() {
        clienteEmb = new ClienteEmb();
    }

    public Cliente(String cpf, String nome, BigDecimal renda) {
        clienteEmb = new ClienteEmb(cpf, nome);
        this.renda = renda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return clienteEmb.getCpf();
    }

    public void setCpf(String cpf) {
        clienteEmb.setCpf(cpf);
    }

    public String getNome() {
        return clienteEmb.getNome();
    }

    public void setNome(String nome) {
        clienteEmb.setNome(nome);
    }

    public BigDecimal getRenda() {
        return renda;
    }

    public void setRenda(BigDecimal renda) {
        this.renda = renda;
    }

    public ClienteEmb getClienteEmb() {
        return clienteEmb;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", clienteEmb=" + clienteEmb + ", renda=" + renda + '}';
    }
    
}

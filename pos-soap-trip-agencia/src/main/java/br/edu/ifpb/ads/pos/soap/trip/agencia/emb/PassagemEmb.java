package br.edu.ifpb.ads.pos.soap.trip.agencia.emb;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 17/10/2017, 11:07:57
 */
@Embeddable
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PassagemEmb implements Serializable {
    
    @Column(nullable = false, name = "passagem_code")
    private String code;
    @Column(nullable = false)
    private String cadeira;
    @Column(precision = 11, scale = 2, nullable = false)
    private Double preco;
    @Embedded
    private VooEmb vooEmb;

    public PassagemEmb() {
    }

    public PassagemEmb(br.edu.ifpb.ads.pos.soap.trip.voo.ws.VooEmb vooEmb,
            br.edu.ifpb.ads.pos.soap.trip.passagem.ws.Passagem passagem) {
        
        this.code = passagem.getCode();
        this.cadeira = passagem.getCadeira();
        this.preco = passagem.getPreco();
        this.vooEmb = new VooEmb(vooEmb);
    }
    
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public VooEmb getVooEmb() {
        return vooEmb;
    }

    public void setVooEmb(VooEmb vooEmb) {
        this.vooEmb = vooEmb;
    }

    @Override
    public String toString() {
        return "{" + "code=" + code + ", cadeira=" + cadeira + ", preco=" + preco  + vooEmb + '}';
    }

}


package br.edu.ifpb.ads.pos.soap.trip.passagem.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de vooEmb complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="vooEmb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compania" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saida" type="{http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/}timestamp" minOccurs="0"/>
 *         &lt;element name="chegada" type="{http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/}timestamp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vooEmb", propOrder = {
    "code",
    "destino",
    "compania",
    "saida",
    "chegada"
})
public class VooEmb {

    protected String code;
    protected String destino;
    protected String compania;
    protected Timestamp saida;
    protected Timestamp chegada;

    /**
     * Obtém o valor da propriedade code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define o valor da propriedade code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtém o valor da propriedade destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define o valor da propriedade destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtém o valor da propriedade compania.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompania() {
        return compania;
    }

    /**
     * Define o valor da propriedade compania.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompania(String value) {
        this.compania = value;
    }

    /**
     * Obtém o valor da propriedade saida.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getSaida() {
        return saida;
    }

    /**
     * Define o valor da propriedade saida.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setSaida(Timestamp value) {
        this.saida = value;
    }

    /**
     * Obtém o valor da propriedade chegada.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getChegada() {
        return chegada;
    }

    /**
     * Define o valor da propriedade chegada.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setChegada(Timestamp value) {
        this.chegada = value;
    }

}

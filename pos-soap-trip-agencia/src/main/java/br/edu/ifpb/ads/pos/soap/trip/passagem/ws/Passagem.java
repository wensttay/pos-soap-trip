
package br.edu.ifpb.ads.pos.soap.trip.passagem.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de passagem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="passagem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cadeira" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preco" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="voo" type="{http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/}voo" minOccurs="0"/>
 *         &lt;element name="clienteEmb" type="{http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/}clienteEmb" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passagem", propOrder = {
    "id",
    "code",
    "cadeira",
    "preco",
    "voo",
    "clienteEmb"
})
public class Passagem {

    protected int id;
    protected String code;
    protected String cadeira;
    protected Double preco;
    protected Voo voo;
    protected ClienteEmb clienteEmb;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

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
     * Obtém o valor da propriedade cadeira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadeira() {
        return cadeira;
    }

    /**
     * Define o valor da propriedade cadeira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadeira(String value) {
        this.cadeira = value;
    }

    /**
     * Obtém o valor da propriedade preco.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * Define o valor da propriedade preco.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreco(Double value) {
        this.preco = value;
    }

    /**
     * Obtém o valor da propriedade voo.
     * 
     * @return
     *     possible object is
     *     {@link Voo }
     *     
     */
    public Voo getVoo() {
        return voo;
    }

    /**
     * Define o valor da propriedade voo.
     * 
     * @param value
     *     allowed object is
     *     {@link Voo }
     *     
     */
    public void setVoo(Voo value) {
        this.voo = value;
    }

    /**
     * Obtém o valor da propriedade clienteEmb.
     * 
     * @return
     *     possible object is
     *     {@link ClienteEmb }
     *     
     */
    public ClienteEmb getClienteEmb() {
        return clienteEmb;
    }

    /**
     * Define o valor da propriedade clienteEmb.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteEmb }
     *     
     */
    public void setClienteEmb(ClienteEmb value) {
        this.clienteEmb = value;
    }

}

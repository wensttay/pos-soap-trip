
package br.edu.ifpb.ads.pos.soap.trip.reserva.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de reserva complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="reserva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quarto" type="{http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/}quarto" minOccurs="0"/>
 *         &lt;element name="inicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="termino" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="clienteEmb" type="{http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/}clienteEmb" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserva", propOrder = {
    "id",
    "quarto",
    "inicio",
    "termino",
    "clienteEmb"
})
public class Reserva {

    protected int id;
    protected Quarto quarto;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inicio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar termino;
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
     * Obtém o valor da propriedade quarto.
     * 
     * @return
     *     possible object is
     *     {@link Quarto }
     *     
     */
    public Quarto getQuarto() {
        return quarto;
    }

    /**
     * Define o valor da propriedade quarto.
     * 
     * @param value
     *     allowed object is
     *     {@link Quarto }
     *     
     */
    public void setQuarto(Quarto value) {
        this.quarto = value;
    }

    /**
     * Obtém o valor da propriedade inicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInicio() {
        return inicio;
    }

    /**
     * Define o valor da propriedade inicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInicio(XMLGregorianCalendar value) {
        this.inicio = value;
    }

    /**
     * Obtém o valor da propriedade termino.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermino() {
        return termino;
    }

    /**
     * Define o valor da propriedade termino.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermino(XMLGregorianCalendar value) {
        this.termino = value;
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

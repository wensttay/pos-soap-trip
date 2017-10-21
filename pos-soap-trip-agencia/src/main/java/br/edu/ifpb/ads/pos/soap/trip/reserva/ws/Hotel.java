
package br.edu.ifpb.ads.pos.soap.trip.reserva.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de hotel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="hotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hotelEmb" type="{http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/}hotelEmb" minOccurs="0"/>
 *         &lt;element name="quartos" type="{http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/}quarto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reservas" type="{http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/}reserva" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotel", propOrder = {
    "id",
    "hotelEmb",
    "quartos",
    "reservas"
})
public class Hotel {

    protected int id;
    protected HotelEmb hotelEmb;
    @XmlElement(nillable = true)
    protected List<Quarto> quartos;
    @XmlElement(nillable = true)
    protected List<Reserva> reservas;

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
     * Obtém o valor da propriedade hotelEmb.
     * 
     * @return
     *     possible object is
     *     {@link HotelEmb }
     *     
     */
    public HotelEmb getHotelEmb() {
        return hotelEmb;
    }

    /**
     * Define o valor da propriedade hotelEmb.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelEmb }
     *     
     */
    public void setHotelEmb(HotelEmb value) {
        this.hotelEmb = value;
    }

    /**
     * Gets the value of the quartos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quartos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuartos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quarto }
     * 
     * 
     */
    public List<Quarto> getQuartos() {
        if (quartos == null) {
            quartos = new ArrayList<Quarto>();
        }
        return this.quartos;
    }

    /**
     * Gets the value of the reservas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reserva }
     * 
     * 
     */
    public List<Reserva> getReservas() {
        if (reservas == null) {
            reservas = new ArrayList<Reserva>();
        }
        return this.reservas;
    }

}

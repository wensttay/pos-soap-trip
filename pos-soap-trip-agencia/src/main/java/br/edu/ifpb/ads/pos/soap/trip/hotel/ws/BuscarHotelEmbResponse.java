
package br.edu.ifpb.ads.pos.soap.trip.hotel.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de buscarHotelEmbResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="buscarHotelEmbResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/}hotelEmb" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarHotelEmbResponse", propOrder = {
    "_return"
})
public class BuscarHotelEmbResponse {

    @XmlElement(name = "return")
    protected HotelEmb _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link HotelEmb }
     *     
     */
    public HotelEmb getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelEmb }
     *     
     */
    public void setReturn(HotelEmb value) {
        this._return = value;
    }

}

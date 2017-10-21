
package br.edu.ifpb.ads.pos.soap.trip.reserva.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de salvar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="salvar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/}reserva" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salvar", propOrder = {
    "arg0"
})
public class Salvar {

    protected Reserva arg0;

    /**
     * Obtém o valor da propriedade arg0.
     * 
     * @return
     *     possible object is
     *     {@link Reserva }
     *     
     */
    public Reserva getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Reserva }
     *     
     */
    public void setArg0(Reserva value) {
        this.arg0 = value;
    }

}


package br.edu.ifpb.ads.pos.soap.trip.reserva.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de quarto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="quarto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="diaria" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hotel" type="{http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/}hotel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quarto", propOrder = {
    "id",
    "numero",
    "diaria",
    "hotel"
})
public class Quarto {

    protected int id;
    protected int numero;
    protected BigDecimal diaria;
    protected Hotel hotel;

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
     * Obtém o valor da propriedade numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade diaria.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiaria() {
        return diaria;
    }

    /**
     * Define o valor da propriedade diaria.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiaria(BigDecimal value) {
        this.diaria = value;
    }

    /**
     * Obtém o valor da propriedade hotel.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * Define o valor da propriedade hotel.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
    }

}

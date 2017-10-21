
package br.edu.ifpb.ads.pos.soap.trip.cliente.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cliente complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clienteEmb" type="{http://service.cliente.trip.soap.pos.ads.ifpb.edu.br/}clienteEmb" minOccurs="0"/>
 *         &lt;element name="renda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
    "id",
    "clienteEmb",
    "renda"
})
public class Cliente {

    protected int id;
    protected ClienteEmb clienteEmb;
    protected BigDecimal renda;

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

    /**
     * Obtém o valor da propriedade renda.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRenda() {
        return renda;
    }

    /**
     * Define o valor da propriedade renda.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRenda(BigDecimal value) {
        this.renda = value;
    }

}

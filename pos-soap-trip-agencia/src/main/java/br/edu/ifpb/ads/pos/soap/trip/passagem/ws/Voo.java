
package br.edu.ifpb.ads.pos.soap.trip.passagem.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de voo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="voo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vooEmb" type="{http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/}vooEmb" minOccurs="0"/>
 *         &lt;element name="passagems" type="{http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/}passagem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voo", propOrder = {
    "id",
    "vooEmb",
    "passagems"
})
public class Voo {

    protected int id;
    protected VooEmb vooEmb;
    @XmlElement(nillable = true)
    protected List<Passagem> passagems;

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
     * Obtém o valor da propriedade vooEmb.
     * 
     * @return
     *     possible object is
     *     {@link VooEmb }
     *     
     */
    public VooEmb getVooEmb() {
        return vooEmb;
    }

    /**
     * Define o valor da propriedade vooEmb.
     * 
     * @param value
     *     allowed object is
     *     {@link VooEmb }
     *     
     */
    public void setVooEmb(VooEmb value) {
        this.vooEmb = value;
    }

    /**
     * Gets the value of the passagems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passagems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassagems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Passagem }
     * 
     * 
     */
    public List<Passagem> getPassagems() {
        if (passagems == null) {
            passagems = new ArrayList<Passagem>();
        }
        return this.passagems;
    }

}

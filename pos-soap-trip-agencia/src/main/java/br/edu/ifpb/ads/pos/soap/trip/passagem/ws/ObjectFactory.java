
package br.edu.ifpb.ads.pos.soap.trip.passagem.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.ads.pos.soap.trip.passagem.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarPassagemByCode_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "buscarPassagemByCode");
    private final static QName _BuscarPassagemByCodeResponse_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "buscarPassagemByCodeResponse");
    private final static QName _ListarPassagensResponse_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "listarPassagensResponse");
    private final static QName _BuscarPassagem_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "buscarPassagem");
    private final static QName _BuscarPassagemByVooCodeResponse_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "buscarPassagemByVooCodeResponse");
    private final static QName _ClienteEmb_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "clienteEmb");
    private final static QName _AtualizarPassagemResponse_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "atualizarPassagemResponse");
    private final static QName _Voo_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "voo");
    private final static QName _SalvarPassagemResponse_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "salvarPassagemResponse");
    private final static QName _DeletarPassagem_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "deletarPassagem");
    private final static QName _BuscarPassagemByVooCode_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "buscarPassagemByVooCode");
    private final static QName _DeletarPassagemResponse_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "deletarPassagemResponse");
    private final static QName _VooEmb_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "vooEmb");
    private final static QName _SalvarPassagem_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "salvarPassagem");
    private final static QName _ListarPassagens_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "listarPassagens");
    private final static QName _AtualizarPassagem_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "atualizarPassagem");
    private final static QName _BuscarPassagemResponse_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "buscarPassagemResponse");
    private final static QName _Passagem_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "passagem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.ads.pos.soap.trip.passagem.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AtualizarPassagem }
     * 
     */
    public AtualizarPassagem createAtualizarPassagem() {
        return new AtualizarPassagem();
    }

    /**
     * Create an instance of {@link BuscarPassagemResponse }
     * 
     */
    public BuscarPassagemResponse createBuscarPassagemResponse() {
        return new BuscarPassagemResponse();
    }

    /**
     * Create an instance of {@link Passagem }
     * 
     */
    public Passagem createPassagem() {
        return new Passagem();
    }

    /**
     * Create an instance of {@link ListarPassagens }
     * 
     */
    public ListarPassagens createListarPassagens() {
        return new ListarPassagens();
    }

    /**
     * Create an instance of {@link SalvarPassagem }
     * 
     */
    public SalvarPassagem createSalvarPassagem() {
        return new SalvarPassagem();
    }

    /**
     * Create an instance of {@link VooEmb }
     * 
     */
    public VooEmb createVooEmb() {
        return new VooEmb();
    }

    /**
     * Create an instance of {@link BuscarPassagemByVooCode }
     * 
     */
    public BuscarPassagemByVooCode createBuscarPassagemByVooCode() {
        return new BuscarPassagemByVooCode();
    }

    /**
     * Create an instance of {@link DeletarPassagemResponse }
     * 
     */
    public DeletarPassagemResponse createDeletarPassagemResponse() {
        return new DeletarPassagemResponse();
    }

    /**
     * Create an instance of {@link DeletarPassagem }
     * 
     */
    public DeletarPassagem createDeletarPassagem() {
        return new DeletarPassagem();
    }

    /**
     * Create an instance of {@link SalvarPassagemResponse }
     * 
     */
    public SalvarPassagemResponse createSalvarPassagemResponse() {
        return new SalvarPassagemResponse();
    }

    /**
     * Create an instance of {@link Voo }
     * 
     */
    public Voo createVoo() {
        return new Voo();
    }

    /**
     * Create an instance of {@link AtualizarPassagemResponse }
     * 
     */
    public AtualizarPassagemResponse createAtualizarPassagemResponse() {
        return new AtualizarPassagemResponse();
    }

    /**
     * Create an instance of {@link BuscarPassagem }
     * 
     */
    public BuscarPassagem createBuscarPassagem() {
        return new BuscarPassagem();
    }

    /**
     * Create an instance of {@link BuscarPassagemByVooCodeResponse }
     * 
     */
    public BuscarPassagemByVooCodeResponse createBuscarPassagemByVooCodeResponse() {
        return new BuscarPassagemByVooCodeResponse();
    }

    /**
     * Create an instance of {@link ClienteEmb }
     * 
     */
    public ClienteEmb createClienteEmb() {
        return new ClienteEmb();
    }

    /**
     * Create an instance of {@link BuscarPassagemByCodeResponse }
     * 
     */
    public BuscarPassagemByCodeResponse createBuscarPassagemByCodeResponse() {
        return new BuscarPassagemByCodeResponse();
    }

    /**
     * Create an instance of {@link ListarPassagensResponse }
     * 
     */
    public ListarPassagensResponse createListarPassagensResponse() {
        return new ListarPassagensResponse();
    }

    /**
     * Create an instance of {@link BuscarPassagemByCode }
     * 
     */
    public BuscarPassagemByCode createBuscarPassagemByCode() {
        return new BuscarPassagemByCode();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPassagemByCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "buscarPassagemByCode")
    public JAXBElement<BuscarPassagemByCode> createBuscarPassagemByCode(BuscarPassagemByCode value) {
        return new JAXBElement<BuscarPassagemByCode>(_BuscarPassagemByCode_QNAME, BuscarPassagemByCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPassagemByCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "buscarPassagemByCodeResponse")
    public JAXBElement<BuscarPassagemByCodeResponse> createBuscarPassagemByCodeResponse(BuscarPassagemByCodeResponse value) {
        return new JAXBElement<BuscarPassagemByCodeResponse>(_BuscarPassagemByCodeResponse_QNAME, BuscarPassagemByCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPassagensResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "listarPassagensResponse")
    public JAXBElement<ListarPassagensResponse> createListarPassagensResponse(ListarPassagensResponse value) {
        return new JAXBElement<ListarPassagensResponse>(_ListarPassagensResponse_QNAME, ListarPassagensResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "buscarPassagem")
    public JAXBElement<BuscarPassagem> createBuscarPassagem(BuscarPassagem value) {
        return new JAXBElement<BuscarPassagem>(_BuscarPassagem_QNAME, BuscarPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPassagemByVooCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "buscarPassagemByVooCodeResponse")
    public JAXBElement<BuscarPassagemByVooCodeResponse> createBuscarPassagemByVooCodeResponse(BuscarPassagemByVooCodeResponse value) {
        return new JAXBElement<BuscarPassagemByVooCodeResponse>(_BuscarPassagemByVooCodeResponse_QNAME, BuscarPassagemByVooCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteEmb }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "clienteEmb")
    public JAXBElement<ClienteEmb> createClienteEmb(ClienteEmb value) {
        return new JAXBElement<ClienteEmb>(_ClienteEmb_QNAME, ClienteEmb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "atualizarPassagemResponse")
    public JAXBElement<AtualizarPassagemResponse> createAtualizarPassagemResponse(AtualizarPassagemResponse value) {
        return new JAXBElement<AtualizarPassagemResponse>(_AtualizarPassagemResponse_QNAME, AtualizarPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Voo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "voo")
    public JAXBElement<Voo> createVoo(Voo value) {
        return new JAXBElement<Voo>(_Voo_QNAME, Voo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "salvarPassagemResponse")
    public JAXBElement<SalvarPassagemResponse> createSalvarPassagemResponse(SalvarPassagemResponse value) {
        return new JAXBElement<SalvarPassagemResponse>(_SalvarPassagemResponse_QNAME, SalvarPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "deletarPassagem")
    public JAXBElement<DeletarPassagem> createDeletarPassagem(DeletarPassagem value) {
        return new JAXBElement<DeletarPassagem>(_DeletarPassagem_QNAME, DeletarPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPassagemByVooCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "buscarPassagemByVooCode")
    public JAXBElement<BuscarPassagemByVooCode> createBuscarPassagemByVooCode(BuscarPassagemByVooCode value) {
        return new JAXBElement<BuscarPassagemByVooCode>(_BuscarPassagemByVooCode_QNAME, BuscarPassagemByVooCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "deletarPassagemResponse")
    public JAXBElement<DeletarPassagemResponse> createDeletarPassagemResponse(DeletarPassagemResponse value) {
        return new JAXBElement<DeletarPassagemResponse>(_DeletarPassagemResponse_QNAME, DeletarPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VooEmb }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "vooEmb")
    public JAXBElement<VooEmb> createVooEmb(VooEmb value) {
        return new JAXBElement<VooEmb>(_VooEmb_QNAME, VooEmb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "salvarPassagem")
    public JAXBElement<SalvarPassagem> createSalvarPassagem(SalvarPassagem value) {
        return new JAXBElement<SalvarPassagem>(_SalvarPassagem_QNAME, SalvarPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPassagens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "listarPassagens")
    public JAXBElement<ListarPassagens> createListarPassagens(ListarPassagens value) {
        return new JAXBElement<ListarPassagens>(_ListarPassagens_QNAME, ListarPassagens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "atualizarPassagem")
    public JAXBElement<AtualizarPassagem> createAtualizarPassagem(AtualizarPassagem value) {
        return new JAXBElement<AtualizarPassagem>(_AtualizarPassagem_QNAME, AtualizarPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "buscarPassagemResponse")
    public JAXBElement<BuscarPassagemResponse> createBuscarPassagemResponse(BuscarPassagemResponse value) {
        return new JAXBElement<BuscarPassagemResponse>(_BuscarPassagemResponse_QNAME, BuscarPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Passagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "passagem")
    public JAXBElement<Passagem> createPassagem(Passagem value) {
        return new JAXBElement<Passagem>(_Passagem_QNAME, Passagem.class, null, value);
    }

}

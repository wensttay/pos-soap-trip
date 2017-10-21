
package br.edu.ifpb.ads.pos.soap.trip.voo.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.ads.pos.soap.trip.voo.ws package. 
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

    private final static QName _DeletarResponse_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "deletarResponse");
    private final static QName _ClienteEmb_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "clienteEmb");
    private final static QName _Voo_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "voo");
    private final static QName _Atualizar_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "atualizar");
    private final static QName _AtualizarResponse_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "atualizarResponse");
    private final static QName _Buscar_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "buscar");
    private final static QName _BuscarResponse_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "buscarResponse");
    private final static QName _VooEmb_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "vooEmb");
    private final static QName _Salvar_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "salvar");
    private final static QName _ListarResponse_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "listarResponse");
    private final static QName _SalvarResponse_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "salvarResponse");
    private final static QName _Listar_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "listar");
    private final static QName _Deletar_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "deletar");
    private final static QName _Passagem_QNAME = new QName("http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", "passagem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.ads.pos.soap.trip.voo.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Passagem }
     * 
     */
    public Passagem createPassagem() {
        return new Passagem();
    }

    /**
     * Create an instance of {@link Deletar }
     * 
     */
    public Deletar createDeletar() {
        return new Deletar();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link SalvarResponse }
     * 
     */
    public SalvarResponse createSalvarResponse() {
        return new SalvarResponse();
    }

    /**
     * Create an instance of {@link Salvar }
     * 
     */
    public Salvar createSalvar() {
        return new Salvar();
    }

    /**
     * Create an instance of {@link VooEmb }
     * 
     */
    public VooEmb createVooEmb() {
        return new VooEmb();
    }

    /**
     * Create an instance of {@link BuscarResponse }
     * 
     */
    public BuscarResponse createBuscarResponse() {
        return new BuscarResponse();
    }

    /**
     * Create an instance of {@link Buscar }
     * 
     */
    public Buscar createBuscar() {
        return new Buscar();
    }

    /**
     * Create an instance of {@link Atualizar }
     * 
     */
    public Atualizar createAtualizar() {
        return new Atualizar();
    }

    /**
     * Create an instance of {@link AtualizarResponse }
     * 
     */
    public AtualizarResponse createAtualizarResponse() {
        return new AtualizarResponse();
    }

    /**
     * Create an instance of {@link Voo }
     * 
     */
    public Voo createVoo() {
        return new Voo();
    }

    /**
     * Create an instance of {@link ClienteEmb }
     * 
     */
    public ClienteEmb createClienteEmb() {
        return new ClienteEmb();
    }

    /**
     * Create an instance of {@link DeletarResponse }
     * 
     */
    public DeletarResponse createDeletarResponse() {
        return new DeletarResponse();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "deletarResponse")
    public JAXBElement<DeletarResponse> createDeletarResponse(DeletarResponse value) {
        return new JAXBElement<DeletarResponse>(_DeletarResponse_QNAME, DeletarResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Voo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "voo")
    public JAXBElement<Voo> createVoo(Voo value) {
        return new JAXBElement<Voo>(_Voo_QNAME, Voo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Atualizar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "atualizar")
    public JAXBElement<Atualizar> createAtualizar(Atualizar value) {
        return new JAXBElement<Atualizar>(_Atualizar_QNAME, Atualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "atualizarResponse")
    public JAXBElement<AtualizarResponse> createAtualizarResponse(AtualizarResponse value) {
        return new JAXBElement<AtualizarResponse>(_AtualizarResponse_QNAME, AtualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "buscar")
    public JAXBElement<Buscar> createBuscar(Buscar value) {
        return new JAXBElement<Buscar>(_Buscar_QNAME, Buscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "buscarResponse")
    public JAXBElement<BuscarResponse> createBuscarResponse(BuscarResponse value) {
        return new JAXBElement<BuscarResponse>(_BuscarResponse_QNAME, BuscarResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Salvar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "salvar")
    public JAXBElement<Salvar> createSalvar(Salvar value) {
        return new JAXBElement<Salvar>(_Salvar_QNAME, Salvar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "salvarResponse")
    public JAXBElement<SalvarResponse> createSalvarResponse(SalvarResponse value) {
        return new JAXBElement<SalvarResponse>(_SalvarResponse_QNAME, SalvarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deletar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.passagem.trip.soap.pos.ads.ifpb.edu.br/", name = "deletar")
    public JAXBElement<Deletar> createDeletar(Deletar value) {
        return new JAXBElement<Deletar>(_Deletar_QNAME, Deletar.class, null, value);
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

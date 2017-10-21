
package br.edu.ifpb.ads.pos.soap.trip.reserva.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.ads.pos.soap.trip.reserva.ws package. 
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

    private final static QName _FazerRezerva_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "fazerRezerva");
    private final static QName _HotelEmb_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "hotelEmb");
    private final static QName _Listar_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "listar");
    private final static QName _Quarto_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "quarto");
    private final static QName _Deletar_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "deletar");
    private final static QName _Salvar_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "salvar");
    private final static QName _ListarResponse_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "listarResponse");
    private final static QName _SalvarResponse_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "salvarResponse");
    private final static QName _Atualizar_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "atualizar");
    private final static QName _AtualizarResponse_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "atualizarResponse");
    private final static QName _Buscar_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "buscar");
    private final static QName _BuscarResponse_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "buscarResponse");
    private final static QName _DeletarResponse_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "deletarResponse");
    private final static QName _FazerRezervaResponse_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "fazerRezervaResponse");
    private final static QName _ClienteEmb_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "clienteEmb");
    private final static QName _Reserva_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "reserva");
    private final static QName _Hotel_QNAME = new QName("http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", "hotel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.ads.pos.soap.trip.reserva.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Deletar }
     * 
     */
    public Deletar createDeletar() {
        return new Deletar();
    }

    /**
     * Create an instance of {@link Quarto }
     * 
     */
    public Quarto createQuarto() {
        return new Quarto();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link FazerRezerva }
     * 
     */
    public FazerRezerva createFazerRezerva() {
        return new FazerRezerva();
    }

    /**
     * Create an instance of {@link HotelEmb }
     * 
     */
    public HotelEmb createHotelEmb() {
        return new HotelEmb();
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
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link Reserva }
     * 
     */
    public Reserva createReserva() {
        return new Reserva();
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
     * Create an instance of {@link FazerRezervaResponse }
     * 
     */
    public FazerRezervaResponse createFazerRezervaResponse() {
        return new FazerRezervaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FazerRezerva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "fazerRezerva")
    public JAXBElement<FazerRezerva> createFazerRezerva(FazerRezerva value) {
        return new JAXBElement<FazerRezerva>(_FazerRezerva_QNAME, FazerRezerva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelEmb }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "hotelEmb")
    public JAXBElement<HotelEmb> createHotelEmb(HotelEmb value) {
        return new JAXBElement<HotelEmb>(_HotelEmb_QNAME, HotelEmb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quarto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "quarto")
    public JAXBElement<Quarto> createQuarto(Quarto value) {
        return new JAXBElement<Quarto>(_Quarto_QNAME, Quarto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deletar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "deletar")
    public JAXBElement<Deletar> createDeletar(Deletar value) {
        return new JAXBElement<Deletar>(_Deletar_QNAME, Deletar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Salvar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "salvar")
    public JAXBElement<Salvar> createSalvar(Salvar value) {
        return new JAXBElement<Salvar>(_Salvar_QNAME, Salvar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "salvarResponse")
    public JAXBElement<SalvarResponse> createSalvarResponse(SalvarResponse value) {
        return new JAXBElement<SalvarResponse>(_SalvarResponse_QNAME, SalvarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Atualizar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "atualizar")
    public JAXBElement<Atualizar> createAtualizar(Atualizar value) {
        return new JAXBElement<Atualizar>(_Atualizar_QNAME, Atualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "atualizarResponse")
    public JAXBElement<AtualizarResponse> createAtualizarResponse(AtualizarResponse value) {
        return new JAXBElement<AtualizarResponse>(_AtualizarResponse_QNAME, AtualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "buscar")
    public JAXBElement<Buscar> createBuscar(Buscar value) {
        return new JAXBElement<Buscar>(_Buscar_QNAME, Buscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "buscarResponse")
    public JAXBElement<BuscarResponse> createBuscarResponse(BuscarResponse value) {
        return new JAXBElement<BuscarResponse>(_BuscarResponse_QNAME, BuscarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "deletarResponse")
    public JAXBElement<DeletarResponse> createDeletarResponse(DeletarResponse value) {
        return new JAXBElement<DeletarResponse>(_DeletarResponse_QNAME, DeletarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FazerRezervaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "fazerRezervaResponse")
    public JAXBElement<FazerRezervaResponse> createFazerRezervaResponse(FazerRezervaResponse value) {
        return new JAXBElement<FazerRezervaResponse>(_FazerRezervaResponse_QNAME, FazerRezervaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteEmb }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "clienteEmb")
    public JAXBElement<ClienteEmb> createClienteEmb(ClienteEmb value) {
        return new JAXBElement<ClienteEmb>(_ClienteEmb_QNAME, ClienteEmb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "reserva")
    public JAXBElement<Reserva> createReserva(Reserva value) {
        return new JAXBElement<Reserva>(_Reserva_QNAME, Reserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.hotel.trip.soap.pos.ads.ifpb.edu.br/", name = "hotel")
    public JAXBElement<Hotel> createHotel(Hotel value) {
        return new JAXBElement<Hotel>(_Hotel_QNAME, Hotel.class, null, value);
    }

}

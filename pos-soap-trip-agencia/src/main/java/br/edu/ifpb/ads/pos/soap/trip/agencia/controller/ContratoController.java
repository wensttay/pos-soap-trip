package br.edu.ifpb.ads.pos.soap.trip.agencia.controller;

import br.edu.ifpb.ads.pos.soap.trip.agencia.Contrato;
import br.edu.ifpb.ads.pos.soap.trip.agencia.Pacote;
import br.edu.ifpb.ads.pos.soap.trip.agencia.dao.ContratoDao;
import br.edu.ifpb.ads.pos.soap.trip.agencia.dao.PacoteDao;
import br.edu.ifpb.ads.pos.soap.trip.agencia.emb.ClienteEmb;
import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Cliente;
import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Clientes;
import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ClientesService;
import br.edu.ifpb.ads.pos.soap.trip.reserva.ws.Reservas;
import br.edu.ifpb.ads.pos.soap.trip.reserva.ws.ReservasService;
import java.io.Serializable;
import br.edu.ifpb.ads.pos.soap.trip.reserva.ws.Timestamp;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 18/10/2017, 17:09:12
 */
@ViewScoped
@ManagedBean
public class ContratoController implements Serializable {
   
    private final Reservas reservasService;
    private final Clientes clientesService;
    @EJB
    private ContratoDao cd;
    @EJB
    private PacoteDao pd;
    private Contrato contrato;
    private boolean editing;
    private String clienteCpf;
    private int pacoteId;

    public ContratoController() {
        clientesService = new ClientesService().getClientesPort();
        reservasService = new ReservasService().getReservasPort();
        contrato = new Contrato();
        editing = false;
    }

    public String salvarContrato() {
        try {
            br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ClienteEmb ce = clientesService.buscarEmb(clienteCpf);
            contrato.setClienteEmb(new ClienteEmb(ce.getCpf(), ce.getNome()));
            
            Pacote pacote = pd.buscarPacote(pacoteId);
            contrato.setPacote(pacote);
           
            reservasService.fazerRezerva(pacote.getQuartoEmb().getQuartoId(), clienteCpf, 
                    pacote.getPassagemEmb().getVooEmb().getSaida().toString(), 
                    pacote.getPassagemEmb().getVooEmb().getChegada().toString());
            
            cd.salvarContrato(contrato);
        } catch (EJBException ex) {
        }
        return "contratos.xhtml?faces-redirect=true";
    }

    public String atualizarContrato() {
        try {
            br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ClienteEmb ce = clientesService.buscarEmb(clienteCpf);
            contrato.setClienteEmb(new ClienteEmb(ce.getCpf(), ce.getNome()));
            Pacote pacote = pd.buscarPacote(pacoteId);
            contrato.setPacote(pacote);

            cd.atualizarContrato(contrato);
        } catch (EJBException ex) {
        }

        contrato = new Contrato();
        editing = false;
        return "contratos.xhtml?faces-redirect=true";
    }

    public String deletarContrato(Contrato c) {
        try {
            cd.deletarContrato(contrato);
        } catch (EJBException ex) {
        }

        if (editing == true && c.getId() == contrato.getId()) {
            contrato = new Contrato();
            editing = false;
        }

        return "contratos.xhtml?faces-redirect=true";
    }

    public Contrato[] listarContratos() {
        try {
            return cd.listarContratos();
        } catch (EJBException ex) {
        }
        return new Contrato[0];
    }

    public Pacote[] listarPacotes() {
        try {
            return pd.listarPacotes();
        } catch (EJBException ex) {
        }
        return new Pacote[0];
    }

    public Cliente[] listarClientes() {
        try {
            return clientesService.listar().toArray(new Cliente[]{});
        } catch (EJBException ex) {
        }
        return new Cliente[0];
    }

    public void setEditarContrato(Contrato c) {
        this.contrato = c;
        this.clienteCpf = c.getClienteEmb().getCpf();
        this.pacoteId = c.getPacote().getId();
        this.editing = true;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public boolean isEditing() {
        return editing;
    }

    public void setEditing(boolean editing) {
        this.editing = editing;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public int getPacoteId() {
        return pacoteId;
    }

    public void setPacoteId(int pacoteId) {
        this.pacoteId = pacoteId;
    }

}

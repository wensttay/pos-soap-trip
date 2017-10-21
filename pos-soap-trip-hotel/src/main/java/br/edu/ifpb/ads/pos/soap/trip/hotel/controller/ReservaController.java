package br.edu.ifpb.ads.pos.soap.trip.hotel.controller;

import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Cliente;
import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Clientes;
import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ClientesService;
import br.edu.ifpb.ads.pos.soap.trip.hotel.ClienteEmb;
import br.edu.ifpb.ads.pos.soap.trip.hotel.Quarto;
import br.edu.ifpb.ads.pos.soap.trip.hotel.Reserva;
import br.edu.ifpb.ads.pos.soap.trip.hotel.dao.QuartoDao;
import br.edu.ifpb.ads.pos.soap.trip.hotel.dao.ReservaDao;
import java.io.Serializable;
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
public class ReservaController implements Serializable {

    private final Clientes clientesService;
    @EJB
    private ReservaDao rd;
    @EJB
    private QuartoDao qd;
    private Reserva reserva;
    private boolean editing;
    private String clienteCpf;
    private int quartoId;
    

    public ReservaController() {
        clientesService = new ClientesService().getClientesPort();
        reserva = new Reserva();
        editing = false;
    }

    public String salvarReserva() {
        try {
            br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ClienteEmb ce = clientesService.buscarEmb(clienteCpf);
            reserva.setClienteEmb(new ClienteEmb(ce.getCpf(), ce.getNome()));
            Quarto quarto = qd.buscarQuarto(quartoId);
            reserva.setQuarto(quarto);
            
            rd.salvarReserva(reserva);
        } catch (EJBException ex) {
        }
        return "reservas.xhtml?faces-redirect=true";
    }

    public String atualizarReserva() {
        try {
            br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ClienteEmb ce = clientesService.buscarEmb(clienteCpf);
            reserva.setClienteEmb(new ClienteEmb(ce.getCpf(), ce.getNome()));
            Quarto quarto = qd.buscarQuarto(quartoId);
            reserva.setQuarto(quarto);
            
            rd.atualizarReserva(reserva);
        } catch (EJBException ex) {
        }

        reserva = new Reserva();
        editing = false;
        return "reservas.xhtml?faces-redirect=true";
    }

    public String deletarReserva(Reserva r) {
        try {
            rd.deletarReserva(r);
        } catch (EJBException ex) {
        }

        if (editing == true && r.getId() == reserva.getId()) {
            reserva = new Reserva();
            editing = false;
        }
        
        return "reservas.xhtml?faces-redirect=true";
    }
    
    public Reserva[] listarReservas(){
        try {
            return rd.listarReservas();
        } catch (EJBException ex) {
        }
        return new Reserva[0];
    }
    
    public Quarto[] listarQuartos(){
        try {
            return qd.listarQuartos();
        } catch (EJBException ex) {
        }
        return new Quarto[0];
    }
    
    public Cliente[] listarClientes(){
        try {
            return clientesService.listar().toArray(new Cliente[]{});
        } catch (EJBException ex) {
        }
        return new Cliente[0];
    }
    
    public void setEditarReserva(Reserva r){
        this.reserva = r;
        this.clienteCpf = r.getClienteEmb().getCpf();
        this.quartoId = r.getQuarto().getId();
        this.editing = true;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
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

    public int getQuartoId() {
        return quartoId;
    }

    public void setQuartoId(int quartoId) {
        this.quartoId = quartoId;
    }
    

}

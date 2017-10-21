package br.edu.ifpb.ads.pos.soap.trip.hotel.service;

import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ClienteEmb;
import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Clientes;
import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ClientesService;
import br.edu.ifpb.ads.pos.soap.trip.hotel.Quarto;
import br.edu.ifpb.ads.pos.soap.trip.hotel.Reserva;
import br.edu.ifpb.ads.pos.soap.trip.hotel.dao.QuartoDao;
import br.edu.ifpb.ads.pos.soap.trip.hotel.dao.ReservaDao;
import java.sql.Timestamp;
import java.util.Date;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 17/10/2017, 02:36:21
 */
@WebService
public class Reservas {

    @EJB
    private ReservaDao reservaDao;
    @EJB
    private QuartoDao quartoDao;
    
    private Clientes clientes;

    public Reservas() {
        clientes = new ClientesService().getClientesPort();
    }

    public void salvar(Reserva r) {
        reservaDao.salvarReserva(r);
    }

    public void atualizar(Reserva r) {
        reservaDao.atualizarReserva(r);
    }

    public void deletar(Reserva r) {
        reservaDao.deletarReserva(r);
    }

    public Reserva buscar(int id) {
        return reservaDao.buscarReserva(id);
    }

    public Reserva[] listar() {
        return reservaDao.listarReservas();
    }

    public void fazerRezerva(int quartoId, String clienteCpf, String inicio, String termino) {
        ClienteEmb cE = clientes.buscarEmb(clienteCpf);
        Quarto quarto = quartoDao.buscarQuarto(quartoId);
        br.edu.ifpb.ads.pos.soap.trip.hotel.ClienteEmb clienteEmb = 
                new br.edu.ifpb.ads.pos.soap.trip.hotel.ClienteEmb();
        
        clienteEmb.setCpf(cE.getCpf());
        clienteEmb.setNome(cE.getNome());
        reservaDao.salvarReserva(
                new Reserva(
                        quarto, 
                        new Date(Timestamp.valueOf(inicio).getTime()), 
                        new Date(Timestamp.valueOf(termino).getTime()), 
                        clienteEmb));
    }

}

package br.edu.ifpb.ads.pos.soap.trip.cliente.service;

import br.edu.ifpb.ads.pos.soap.trip.cliente.Cliente;
import br.edu.ifpb.ads.pos.soap.trip.cliente.ClienteEmb;
import br.edu.ifpb.ads.pos.soap.trip.cliente.dao.ClientesDao;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 02/10/2017, 10:34:58
 */
@WebService
public class Clientes {

    @EJB
    private ClientesDao clientesDao;

    public void salvar(Cliente c) {
        System.out.println("Salvar um Cliente");
        clientesDao.salvarCliente(c);
    }

    public void atualizar(Cliente c) {
        System.out.println("Atualizar um Cliente");
        clientesDao.atualizarCliente(c);
    }

    public void deletar(Cliente c) {
        System.out.println("Deletar um Cliente");
        clientesDao.deletarCliente(c);
    }
    
     public Cliente buscar(int id) {
         System.out.println("Buscar um Cliente");
        return clientesDao.buscarCliente(id);
    }

    public Cliente[] listar() {
        System.out.println("Listar Clientes");
        return clientesDao.listarCliente();
    }
    
    public ClienteEmb buscarEmb(String cpf) {
        System.out.println("Buscar um ClienteEmb");
        return clientesDao.buscarClienteEmb(cpf);
    }

    public ClienteEmb[] listarEmb() {
        System.out.println("Listar ClientesEmb");
        return clientesDao.listarClienteEmb();
    }

}

package br.edu.ifpb.ads.pos.soap.trip.cliente.controller;

import br.edu.ifpb.ads.pos.soap.trip.cliente.Cliente;
import br.edu.ifpb.ads.pos.soap.trip.cliente.dao.ClientesDao;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.swing.JOptionPane;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 18/10/2017, 14:57:45
 */
@ViewScoped
@ManagedBean
public class ClienteController implements Serializable {

    @EJB
    private ClientesDao cd;
    
    private Cliente cliente;
    private boolean editing;

    public ClienteController() {
        cliente = new Cliente();
        editing = false;
    }

    public Cliente[] listarClientes() {
        return cd.listarCliente();
    }

    public String salvarCliente() {
        try {
            cd.salvarCliente(cliente);
        } catch (EJBException ex) {
        }
        cliente = new Cliente();
        return "index.xhtml?faces-redirect=true";
    }

    public String atualizarCliente() {
        try {
            cd.atualizarCliente(cliente);
        } catch (EJBException ex) {
        }
        cliente = new Cliente();
        editing = false;
        return "index.xhtml?faces-redirect=true";
    }

    public String deletarCliente(Cliente c) {
        try {
            cd.deletarCliente(c);
        } catch (EJBException ex) {
        }
        
        if (editing == true && c.getId() == cliente.getId()) {
            cliente = new Cliente();
            editing = false;
        }
        
        return "index.xhtml?faces-redirect=true";
    }

    public void setEditCliente(Cliente cliente) {
        this.cliente = cliente;
        editing = true;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEditing() {
        return editing;
    }

    public void setEditing(boolean editing) {
        this.editing = editing;
    }

}

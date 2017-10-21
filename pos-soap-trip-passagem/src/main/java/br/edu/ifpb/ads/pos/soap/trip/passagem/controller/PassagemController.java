package br.edu.ifpb.ads.pos.soap.trip.passagem.controller;

import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Cliente;
import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.Clientes;
import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ClientesService;
import br.edu.ifpb.ads.pos.soap.trip.cliente.ws.ClienteEmb;
import br.edu.ifpb.ads.pos.soap.trip.passagem.Passagem;
import br.edu.ifpb.ads.pos.soap.trip.passagem.Voo;
import br.edu.ifpb.ads.pos.soap.trip.passagem.dao.PassagemDao;
import br.edu.ifpb.ads.pos.soap.trip.passagem.dao.VooDao;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 19/10/2017, 23:39:26
 */
@ViewScoped
@ManagedBean
public class PassagemController implements Serializable {

    @EJB
    private PassagemDao pd;
    @EJB
    private VooDao vd;

    private Passagem passagem;
    private boolean editing;
    private int vooId;
    private String clienteCpf;
    private Clientes clientes;

    public PassagemController() {
        clientes = new ClientesService().getClientesPort();
        passagem = new Passagem();
        editing = false;
    }

    public String salvarPassagem() {
        try {
            Voo voo = vd.buscarVoo(vooId);
            passagem.setVoo(voo);

            ClienteEmb emb = clientes.buscarEmb(clienteCpf);
            passagem.setClienteEmb(new br.edu.ifpb.ads.pos.soap.trip.passagem.ClienteEmb(emb.getCpf(),
                    emb.getNome()));

            pd.salvarPassagem(passagem);
        } catch (EJBException ex) {
        }
        passagem = new Passagem();
        return "passagens.xhtml?faces-redirect=true";
    }

    public String atualizarPassagem() {
        try {
            Voo voo = vd.buscarVoo(vooId);
            passagem.setVoo(voo);

            ClienteEmb emb = clientes.buscarEmb(clienteCpf);
            passagem.setClienteEmb(new br.edu.ifpb.ads.pos.soap.trip.passagem.ClienteEmb(emb.getCpf(),
                    emb.getNome()));

            pd.atualizarPassagem(passagem);
        } catch (EJBException ex) {
        }

        this.editing = false;
        passagem = new Passagem();
        return "passagens.xhtml?faces-redirect=true";
    }

    public String deletarPassagem(Passagem p) {
        try {
            pd.deletarPassagem(p);
        } catch (EJBException ex) {
        }

        if (editing == true && p.getId() == passagem.getId()) {
            this.editing = false;
            passagem = new Passagem();
        }
        return "passagens.xhtml?faces-redirect=true";
    }

    public Passagem[] listarPassagens() {
        try {
            return pd.listarPassagem();
        } catch (EJBException ex) {
        }
        return new Passagem[0];
    }

    public Voo[] listarVoos() {
        try {
            return vd.listarVoo();
        } catch (EJBException ex) {
        }
        return new Voo[0];
    }

    public ClienteEmb[] listarClientes() {
        try {
            return clientes.listarEmb()
                    .toArray(new ClienteEmb[]{});
        } catch (EJBException ex) {
        }
        return new ClienteEmb[0];
    }

    public void setEditingPassagem(Passagem p) {
        this.passagem = p;
        this.vooId = p.getVoo().getId();
        this.clienteCpf = p.getClienteEmb().getCpf();
        this.editing = true;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public boolean isEditing() {
        return editing;
    }

    public void setEditing(boolean editing) {
        this.editing = editing;
    }

    public int getVooId() {
        return vooId;
    }

    public void setVooId(int vooId) {
        this.vooId = vooId;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

}

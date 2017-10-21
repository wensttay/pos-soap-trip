package br.edu.ifpb.ads.pos.soap.trip.agencia.controller;

import br.edu.ifpb.ads.pos.soap.trip.agencia.Agencia;
import br.edu.ifpb.ads.pos.soap.trip.agencia.dao.AgenciaDao;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 20/10/2017, 10:30:29
 */
@ViewScoped
@ManagedBean
public class AgenciaController implements Serializable {
    
    @EJB
    private AgenciaDao ad;

    private Agencia agencia;
    private boolean editing;
    
    public AgenciaController() {
        agencia = new Agencia();
        editing = false;
    }

    public String salvarAgencia() {
        try {
            ad.salvarAgencia(agencia);
        } catch (EJBException ex) {
        }
        agencia = new Agencia();
        return "agencias.xhtml?faces-redirect=true";
    }

    public String atualizarAgencia() {
        try {
            ad.atualizarAgencia(agencia);
        } catch (EJBException ex) {
        }
        
        this.editing = false;
        agencia = new Agencia();
        return "agencias.xhtml?faces-redirect=true";
    }

    public String deletarAgencia(Agencia a) {
        try {
            ad.deletarAgencia(a);
        } catch (EJBException ex) {
        }

        if (editing == true && a.getId() == agencia.getId()) {
            this.editing = false;
            agencia = new Agencia();
        }
        return "agencias.xhtml?faces-redirect=true";
    }

    public Agencia[] listarAgencias() {
        try {
            return ad.listarAgencias();
        } catch (EJBException ex) {
        }
        return new Agencia[0];
    }
    

    public void setEditingAgencia(Agencia a) {
        this.agencia = a;
        this.editing = true;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public boolean isEditing() {
        return editing;
    }

    public void setEditing(boolean editing) {
        this.editing = editing;
    }

}

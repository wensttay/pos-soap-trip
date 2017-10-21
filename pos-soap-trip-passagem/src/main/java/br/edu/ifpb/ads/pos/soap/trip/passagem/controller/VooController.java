package br.edu.ifpb.ads.pos.soap.trip.passagem.controller;

import br.edu.ifpb.ads.pos.soap.trip.passagem.Voo;
import br.edu.ifpb.ads.pos.soap.trip.passagem.dao.VooDao;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 19/10/2017, 23:40:24
 */
@ViewScoped
@ManagedBean
public class VooController implements Serializable {

    @EJB
    private VooDao vd;

    private Voo voo;
    private boolean editing;
    
    public VooController() {
        voo = new Voo();
        editing = false;
    }

    public String salvarVoo() {
        try {
            vd.salvarVoo(voo);
        } catch (EJBException ex) {
        }
        voo = new Voo();
        return "voos.xhtml?faces-redirect=true";
    }

    public String atualizarVoo() {
        try {
            vd.atualizarVoo(voo);
        } catch (EJBException ex) {
        }
        
        this.editing = false;
        voo = new Voo();
        return "voos.xhtml?faces-redirect=true";
    }

    public String deletarVoo(Voo v) {
        try {
            vd.deletarVoo(v);
        } catch (EJBException ex) {
        }

        if (editing == true && v.getId() == voo.getId()) {
            this.editing = false;
            voo = new Voo();
        }
        return "voos.xhtml?faces-redirect=true";
    }

    public Voo[] listarVoos() {
        try {
            return vd.listarVoo();
        } catch (EJBException ex) {
        }
        return new Voo[0];
    }
    

    public void setEditingVoo(Voo v) {
        this.voo = v;
        this.editing = true;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public boolean isEditing() {
        return editing;
    }

    public void setEditing(boolean editing) {
        this.editing = editing;
    }

}

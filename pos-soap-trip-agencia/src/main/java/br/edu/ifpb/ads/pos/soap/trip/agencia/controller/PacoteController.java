package br.edu.ifpb.ads.pos.soap.trip.agencia.controller;

import br.edu.ifpb.ads.pos.soap.trip.agencia.Agencia;
import br.edu.ifpb.ads.pos.soap.trip.agencia.Pacote;
import br.edu.ifpb.ads.pos.soap.trip.agencia.dao.AgenciaDao;
import br.edu.ifpb.ads.pos.soap.trip.agencia.dao.PacoteDao;
import br.edu.ifpb.ads.pos.soap.trip.agencia.emb.PassagemEmb;
import br.edu.ifpb.ads.pos.soap.trip.agencia.emb.QuartoEmb;
import br.edu.ifpb.ads.pos.soap.trip.hotel.ws.Hoteis;
import br.edu.ifpb.ads.pos.soap.trip.hotel.ws.HoteisService;
import br.edu.ifpb.ads.pos.soap.trip.hotel.ws.Hotel;
import br.edu.ifpb.ads.pos.soap.trip.hotel.ws.Quarto;
import br.edu.ifpb.ads.pos.soap.trip.passagem.ws.Passagem;
import br.edu.ifpb.ads.pos.soap.trip.passagem.ws.Passagens;
import br.edu.ifpb.ads.pos.soap.trip.passagem.ws.PassagensService;
import br.edu.ifpb.ads.pos.soap.trip.quarto.ws.Quartos;
import br.edu.ifpb.ads.pos.soap.trip.quarto.ws.QuartosService;
import br.edu.ifpb.ads.pos.soap.trip.voo.ws.Voos;
import br.edu.ifpb.ads.pos.soap.trip.voo.ws.VoosService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 20/10/2017, 10:30:44
 */
@ViewScoped
@ManagedBean
public class PacoteController implements Serializable {

    @EJB
    private PacoteDao pd;
    @EJB
    private AgenciaDao ad;

    private Passagens passagens;
    private Hoteis hoteis;
    private Voos voos;
    private Quartos quartos;

    private boolean editing;
    private Pacote pacote;

    private int agenciaId;
    private int quartoId;
    private String passagemCode;
    private List<QuartoEmb> quartoEmbs;
    private List<PassagemEmb> passagemEmbs;

    public PacoteController() {
        passagens = new PassagensService().getPassagensPort();
        quartos = new QuartosService().getQuartosPort();
        hoteis = new HoteisService().getHoteisPort();
        voos = new VoosService().getVoosPort();
        editing = false;
        pacote = new Pacote();
        quartoEmbs = new ArrayList<>();
        passagemEmbs = new ArrayList<>();
    }

    public String salvarPacote() {
        try {
            Agencia a = ad.buscarAgencia(agenciaId);
            pacote.setAgencia(a);
            pacote.setQuartoEmb(findQuartoEmb(quartoId));
            pacote.setPassagemEmb(findPassagemEmb(passagemCode));
            pd.salvarPacote(pacote);
        } catch (EJBException ex) {
        }
        this.pacote = new Pacote();
        return "pacotes.xhtml?faces-redirect=true";
    }

    private PassagemEmb findPassagemEmb(String code) throws EJBException {
        for (PassagemEmb passagemEmb : passagemEmbs) {
            if (passagemEmb.getCode().equals(code)) {
                return passagemEmb;
            }
        }
        throw new EJBException();
    }

    private QuartoEmb findQuartoEmb(int id) throws EJBException {
        for (QuartoEmb quartoEmb : quartoEmbs) {
            if (quartoEmb.getQuartoId() == id) {
                return quartoEmb;
            }
        }
        throw new EJBException();
    }

    public String atualizarPacote() {
        try {
            Agencia a = ad.buscarAgencia(agenciaId);
            pacote.setAgencia(a);
            pacote.setQuartoEmb(findQuartoEmb(quartoId));
            pacote.setPassagemEmb(findPassagemEmb(passagemCode));
            pd.atualizarPacote(pacote);
        } catch (EJBException ex) {
        }
        this.editing = false;
        this.pacote = new Pacote();
        return "pacotes.xhtml?faces-redirect=true";
    }

    public String deletarPacote(Pacote p) {
        try {
            pd.deletarPacote(p);
        } catch (EJBException ex) {
        }

        if (editing == true && p.getId() == pacote.getId()) {
            this.editing = false;
            this.pacote = new Pacote();
        }

        return "pacotes.xhtml?faces-redirect=true";
    }

    public void setEditingPacote(Pacote p) {
        this.pacote = p;
        this.agenciaId = p.getAgencia().getId();
        this.passagemCode = p.getPassagemEmb().getCode();
        this.quartoId = p.getQuartoEmb().getQuartoId();
        this.editing = true;
    }

    public Agencia[] listarAgencias() {
        try {
            return ad.listarAgencias();
        } catch (EJBException ex) {
        }
        return new Agencia[0];
    }

    public Pacote[] listarPacotes() {
        try {
            return pd.listarPacotes();
        } catch (EJBException ex) {
        }
        return new Pacote[0];
    }

    public PassagemEmb[] listarPassagensEmb() {

        passagemEmbs = new ArrayList<>();

        List<br.edu.ifpb.ads.pos.soap.trip.voo.ws.VooEmb> vooEmbs = voos.listar();
        for (br.edu.ifpb.ads.pos.soap.trip.voo.ws.VooEmb vooEmb : vooEmbs) {
            List<Passagem> pas = passagens.buscarPassagemByVooCode(vooEmb.getCode());
            for (Passagem pa : pas) {
                passagemEmbs.add(new PassagemEmb(vooEmb, pa));
            }

        }

        return passagemEmbs.toArray(new PassagemEmb[]{});
    }

    public QuartoEmb[] listarQuartosEmb() {
        quartoEmbs = new ArrayList<>();
        
        List<Hotel> hotelList = hoteis.listarHoteis();

        for (Hotel hotel : hotelList) {
            List<Quarto> quartoList = hotel.getQuartos();
            for (Quarto quarto : quartoList) {
                System.out.println("UM QUARTO");
                quartoEmbs.add(new QuartoEmb(quarto, hotel));
            }
        }

        return quartoEmbs.toArray(new QuartoEmb[]{});
    }

    public boolean isEditing() {
        return editing;
    }

    public void setEditing(boolean editing) {
        this.editing = editing;
    }

    public int getAgenciaId() {
        return agenciaId;
    }

    public void setAgenciaId(int agenciaId) {
        this.agenciaId = agenciaId;
    }

    public int getQuartoId() {
        return quartoId;
    }

    public void setQuartoId(int quartoId) {
        this.quartoId = quartoId;
    }

    public String getPassagemCode() {
        return passagemCode;
    }

    public void setPassagemCode(String passagemCode) {
        this.passagemCode = passagemCode;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }
    
    

}

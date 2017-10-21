package br.edu.ifpb.ads.pos.soap.trip.passagem.service;

import br.edu.ifpb.ads.pos.soap.trip.passagem.Passagem;
import br.edu.ifpb.ads.pos.soap.trip.passagem.dao.PassagemDao;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 17/10/2017, 10:44:14
 */
@WebService
public class Passagens {

    @EJB
    private PassagemDao passagemDao;

    public void salvarPassagem(Passagem p) {
        passagemDao.salvarPassagem(p);
    }

    public void atualizarPassagem(Passagem p) {
        passagemDao.atualizarPassagem(p);
    }

    public void deletarPassagem(Passagem p) {
        passagemDao.deletarPassagem(p);
    }

    public Passagem buscarPassagem(int id) {
        return passagemDao.buscarPassagem(id);
    }
    
    public Passagem buscarPassagemByCode(String code) {
        return passagemDao.buscarPassagem(code);
    }
    
    public Passagem[] buscarPassagemByVooCode(String code) {
        return passagemDao.buscarPassagemByVooCode(code);
    }

    public Passagem[] listarPassagens() {
        return passagemDao.listarPassagem();
    }
    
}

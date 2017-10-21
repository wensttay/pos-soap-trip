package br.edu.ifpb.ads.pos.soap.trip.passagem.service;

import br.edu.ifpb.ads.pos.soap.trip.passagem.Voo;
import br.edu.ifpb.ads.pos.soap.trip.passagem.VooEmb;
import br.edu.ifpb.ads.pos.soap.trip.passagem.dao.VooDao;
import javax.ejb.EJB;
import javax.jws.WebService;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 17/10/2017, 10:44:26
 */
@WebService
public class Voos {

    @EJB
    private VooDao vooDao;

    public void salvar(Voo v) {
        vooDao.salvarVoo(v);
    }

    public void atualizar(Voo v) {
        vooDao.atualizarVoo(v);
    }

    public void deletar(Voo v) {
        vooDao.deletarVoo(v);
    }

    public VooEmb buscar(String code) {
        return vooDao.buscarVooEmb(code);
    }

    public VooEmb[] listar() {
        return vooDao.listarVooEmb();
    }
   
}

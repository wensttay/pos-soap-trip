package br.edu.ifpb.ads.pos.soap.trip.cliente.dao;

import br.edu.ifpb.ads.pos.soap.trip.cliente.Cliente;
import br.edu.ifpb.ads.pos.soap.trip.cliente.ClienteEmb;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 02/10/2017, 10:25:10
 */
@Stateless
public class ClientesDao {

    @PersistenceContext
    private EntityManager entityManager;
    
    public void salvarCliente(Cliente c){
        entityManager.persist(c);
    }
    
    public void atualizarCliente(Cliente c){
        entityManager.merge(c);
    }
    
    public void deletarCliente(Cliente c){
        Cliente merge = entityManager.merge(c);
        entityManager.remove(merge);
    }
    
    public Cliente buscarCliente(int id){
        return entityManager.find(Cliente.class, id);
    }
    
    public ClienteEmb buscarClienteEmb(String cpf){
        List<Cliente> resultList = entityManager
                .createQuery("SELECT c FROM Cliente c WHERE c.clienteEmb.cpf = :cpfvalue", Cliente.class)
                .setParameter("cpfvalue", cpf)
                .getResultList();
        
        return resultList.isEmpty() ? null : resultList.get(0).getClienteEmb();
    }
    
    
    public Cliente[] listarCliente(){
        List<Cliente> resultList = entityManager.createQuery("SELECT c FROM Cliente c order by c.id", Cliente.class)
                .getResultList();
        return resultList.toArray(new Cliente[]{});
    }
    
    public ClienteEmb[] listarClienteEmb(){
        Cliente[] listarCliente = listarCliente();
        ClienteEmb[] clienteEmbs = new ClienteEmb[listarCliente.length];
        
        for (int i = 0; i < listarCliente.length; i++) {
            clienteEmbs[i] = listarCliente[i].getClienteEmb();
        }
        
        return clienteEmbs;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import DAO.clienteDao;
import DAO.clienteDaoImplement;
import Modelo.Cliente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author said
 */
@ManagedBean
@ViewScoped
public class clienteBean {

    private List<Cliente> listaClientes;
    private Cliente cliente;

    public clienteBean() {
        
    }



    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
        public List<Cliente> getListaClientes() {
            clienteDao cDao= new clienteDaoImplement();
            listaClientes=cDao.listarClientes();
            return listaClientes;
    }
        
        //se ocupa solo para inicializar a un cliente
        public void prepararCliente(){
        cliente= new Cliente();
        }
        
        public void nuevoCliente(){
        clienteDao cDao= new clienteDaoImplement();
        cDao.nuevoCliente(cliente);
        }
    
        public void modificarCliente(){
        clienteDao cDao= new clienteDaoImplement();
        cDao.modificarCliente(cliente);
        cliente= new Cliente();
        }
        
        public void eliminarCliente(){
        clienteDao cDao= new clienteDaoImplement();
        cDao.eliminarCliente(cliente);
        cliente= new Cliente();
        }
}

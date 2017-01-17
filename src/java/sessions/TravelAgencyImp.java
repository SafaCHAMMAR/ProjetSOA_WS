/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

/**
 *
 * @author safa
 */
import entities.Admin;
import entities.Client;
import entities.Reservation;
import entities.Vol;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
@Stateless
public class TravelAgencyImp implements ITravelAgency{
    @PersistenceContext(unitName = "Travel_AgencyPU")
    private EntityManager em;
    
    @Override
    public void addAdmin(Admin a) {
        em.persist(a);
    }

    @Override
    public List<Admin> getAllAdmin() {
        Query req=em.createQuery("select a from Admin a ");
        return req.getResultList();
    }
    @Override
     public boolean existAdmin(String login,String pwd){
         Query req=em.createNamedQuery("Admin.findByLoginPwd").setParameter("login",login).setParameter("pwd", pwd);//em.createQuery("select a from Admin a  where a.login = 'safa' ");
        if(req.getResultList().size()>0){
           return true; 
        }
        else return false;
     }

    @Override
    public void addVoy(Vol v) {
        em.persist(v);
    }
    @Override
    public void addBooking(int idVl,int idClt) {
        System.out.println("idVol= "+idVl);
        Query req=em.createNamedQuery("Client.findByIdClient").setParameter("idClient",idClt);
        Client clt=(Client) req.getSingleResult();
        req=em.createNamedQuery("Vol.findByIdVol").setParameter("idVol",idVl);
        Vol v=(Vol) req.getSingleResult();
        Reservation r =new Reservation(v,clt);
       em.persist(r);
       
    }
    public List<Vol> getAllVol(){
        Query req=em.createNamedQuery("Vol.findAll");
        return req.getResultList();
    }
}

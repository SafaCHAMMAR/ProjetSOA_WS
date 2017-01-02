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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    em.persist(a);
    }

    @Override
    public List<Admin> getAllAdmin() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Query req=/*em.createNamedQuery("Admin.findByLogin").setParameter("login","safa");*/em.createQuery("select a from Admin a ");
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
        System.out.println("******voy  impl**********");
        System.out.println(v.getVilleDep());
        System.out.println(v.getVilleDest());
        System.out.println(v.getPlaceDisp());
        System.out.println(v.getPrix());
       System.out.println(v.getDateDep());
        System.out.println(v.getDateArr());
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   //Query req=em.createNamedQuery("Vol.insert").setParameter("",login).setParameter("pwd", pwd);
        em.persist(v);
    }
}

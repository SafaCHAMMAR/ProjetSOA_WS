/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Admin;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import sessions.ITravelAgency;

/**
 *
 * @author safa
 */
@WebService(serviceName = "AdminWS")
@Stateless()
public class AdminWS {

    /**
     * This is a sample web service operation
     */
    @EJB
    private ITravelAgency metier;
    
    @WebMethod
    public void addAdmin(@WebParam(name = "login") String lg,@WebParam(name = "pwd") String mdp) {
        Admin a=new Admin(lg, mdp);
        metier.addAdmin(a);
    }
    @WebMethod
    public List<Admin> listAdmin() {
        return metier.getAllAdmin();
    }
    
    @WebMethod
    public boolean existAdmin(String login,String pwd){
        return metier.existAdmin(login, pwd);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Admin;
import entities.Vol;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    @WebMethod
    public void addVol(@WebParam(name = "villeDep")String villeDep, @WebParam(name = "villeDest")String villeDest, @WebParam(name = "placeDisp")int placeDisp,@WebParam(name = "prix") int prix,@WebParam(name = "dateDep") String dateDep, @WebParam(name = "DateArr")String dateArr){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        try {
            //convertir date 
            Date dateDep2 = formatter.parse(dateDep);
            Date dateArr2 = formatter.parse(dateArr);
            java.sql.Date date_sql = new java.sql.Date(dateDep2.getTime());
            java.sql.Date date_sql2 = new java.sql.Date(dateArr2.getTime());
            //preparer l'objet a inserer dans la base 
            Vol v=new Vol(villeDep,villeDest,placeDisp,prix,date_sql,date_sql2);
            metier.addVoy(v);
        
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
}

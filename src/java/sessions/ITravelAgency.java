/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Admin;
import entities.Vol;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author safa
 */
@Local //car i s agit d un client web (si le client java @remote)
public interface ITravelAgency {
    public void addAdmin(Admin a);
    public List<Admin> getAllAdmin();
    public boolean existAdmin(String login,String pwd);
    public void addVoy(Vol v);
}

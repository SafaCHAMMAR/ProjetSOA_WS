/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author safa
 */
@Entity
@Table(name = "Admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a"),
    @NamedQuery(name = "Admin.findByIdAdmin", query = "SELECT a FROM Admin a WHERE a.idAdmin = :idAdmin"),
    @NamedQuery(name = "Admin.findByLogin", query = "SELECT a FROM Admin a WHERE a.login = :login"),
    @NamedQuery(name = "Admin.findByPwd", query = "SELECT a FROM Admin a WHERE a.pwd = :pwd"),
    @NamedQuery(name = "Admin.findByLoginPwd", query = "SELECT a FROM Admin a WHERE a.login = :login and a.pwd= :pwd")})
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAdmin")
    private Integer idAdmin;
    @Size(max = 15)
    @Column(name = "login")
    private String login;
    @Size(max = 30)
    @Column(name = "pwd")
    private String pwd;

    public Admin(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
    }

    public Admin() {
    }

    public Admin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdmin != null ? idAdmin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.idAdmin == null && other.idAdmin != null) || (this.idAdmin != null && !this.idAdmin.equals(other.idAdmin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Admin[ idAdmin=" + idAdmin + " ]";
    }
    
}

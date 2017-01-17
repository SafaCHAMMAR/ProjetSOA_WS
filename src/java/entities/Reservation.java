/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author safa
 */
@Entity
@Table(name = "Reservation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r"),
    @NamedQuery(name = "Reservation.findByIdRes", query = "SELECT r FROM Reservation r WHERE r.idRes = :idRes"),
    @NamedQuery(name = "Reservation.findByDateRes", query = "SELECT r FROM Reservation r WHERE r.dateRes = :dateRes")})
public class Reservation implements Serializable {

    public Reservation(Vol idVol, Client idClient) {
        this.idVol = idVol;
        this.idClient = idClient;
        Date actuelle = new Date();
        java.sql.Date date_sql = new java.sql.Date(actuelle.getTime());
        this.dateRes=date_sql;
    }
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRes")
    private Integer idRes;
    @Column(name = "dateRes")
    @Temporal(TemporalType.DATE)
    private Date dateRes;
    @JoinColumn(name = "idVol", referencedColumnName = "idVol")
    @ManyToOne
    private Vol idVol;
    @JoinColumn(name = "idClient", referencedColumnName = "idClient")
    @ManyToOne
    private Client idClient;

    public Reservation() {
    }

    public Reservation(Integer idRes) {
        this.idRes = idRes;
    }

    public Integer getIdRes() {
        return idRes;
    }

    public void setIdRes(Integer idRes) {
        this.idRes = idRes;
    }

    public Date getDateRes() {
        return dateRes;
    }

    public void setDateRes(Date dateRes) {
        this.dateRes = dateRes;
    }

    public Vol getIdVol() {
        return idVol;
    }

    public void setIdVol(Vol idVol) {
        this.idVol = idVol;
    }

    public Client getIdClient() {
        return idClient;
    }

    public void setIdClient(Client idClient) {
        this.idClient = idClient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRes != null ? idRes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.idRes == null && other.idRes != null) || (this.idRes != null && !this.idRes.equals(other.idRes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Reservation[ idRes=" + idRes + " ]";
    }
    
}

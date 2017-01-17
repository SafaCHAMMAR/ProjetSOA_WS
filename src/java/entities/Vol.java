/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author safa
 */
@Entity
@Table(name = "Vol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vol.findAll", query = "SELECT v FROM Vol v"),
    @NamedQuery(name = "Vol.findByIdVol", query = "SELECT v FROM Vol v WHERE v.idVol = :idVol"),
    @NamedQuery(name = "Vol.findByVilleDep", query = "SELECT v FROM Vol v WHERE v.villeDep = :villeDep"),
    @NamedQuery(name = "Vol.findByVilleDest", query = "SELECT v FROM Vol v WHERE v.villeDest = :villeDest"),
    @NamedQuery(name = "Vol.findByPlaceDisp", query = "SELECT v FROM Vol v WHERE v.placeDisp = :placeDisp"),
    @NamedQuery(name = "Vol.findByPrix", query = "SELECT v FROM Vol v WHERE v.prix = :prix"),
    @NamedQuery(name = "Vol.findByDateDep", query = "SELECT v FROM Vol v WHERE v.dateDep = :dateDep"),
    @NamedQuery(name = "Vol.findByDateArr", query = "SELECT v FROM Vol v WHERE v.dateArr = :dateArr"),
    //@NamedQuery(name = "Vol.insert", query = "insert into Vol (villeDep,villeDest,placeDisp,prix,dateDep,dateArr)values( :villeDep,:villeDest,:placeDisp,:prix,:dateDep,:dateArr)")
})
public class Vol implements Serializable {
    @Column(name = "prix")
    private Integer prix;
    @OneToMany(mappedBy = "idVol")
    private Collection<Reservation> reservationCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVol")
    private Integer idVol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(name = "villeDep")
    private String villeDep;

    public Vol(String villeDep, String villeDest, int placeDisp, Integer prix) {
        this.villeDep = villeDep;
        this.villeDest = villeDest;
        this.placeDisp = placeDisp;
        this.prix = prix;
    }
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(name = "villeDest")
    private String villeDest;
    @Basic(optional = false)
    @NotNull
    @Column(name = "placeDisp")
    private int placeDisp;
    @Column(name = "dateDep")
    @Temporal(TemporalType.DATE)
    private Date dateDep;
    @Column(name = "dateArr")
    @Temporal(TemporalType.DATE)
    private Date dateArr;

    public Vol(String villeDep, String villeDest, int placeDisp, Integer prix, Date dateDep, Date dateArr) {
        this.villeDep = villeDep;
        this.villeDest = villeDest;
        this.placeDisp = placeDisp;
        this.prix = prix;
        this.dateDep = dateDep;
        this.dateArr = dateArr;
    }

    public Vol() {
    }

    public Vol(Integer idVol) {
        this.idVol = idVol;
    }

    public Vol(Integer idVol, String villeDep, String villeDest, int placeDisp) {
        this.idVol = idVol;
        this.villeDep = villeDep;
        this.villeDest = villeDest;
        this.placeDisp = placeDisp;
    }

    public Integer getIdVol() {
        return idVol;
    }

    public void setIdVol(Integer idVol) {
        this.idVol = idVol;
    }

    public String getVilleDep() {
        return villeDep;
    }

    public void setVilleDep(String villeDep) {
        this.villeDep = villeDep;
    }

    public String getVilleDest() {
        return villeDest;
    }

    public void setVilleDest(String villeDest) {
        this.villeDest = villeDest;
    }

    public int getPlaceDisp() {
        return placeDisp;
    }

    public void setPlaceDisp(int placeDisp) {
        this.placeDisp = placeDisp;
    }


    public Date getDateDep() {
        return dateDep;
    }

    public void setDateDep(Date dateDep) {
        this.dateDep = dateDep;
    }

    public Date getDateArr() {
        return dateArr;
    }

    public void setDateArr(Date dateArr) {
        this.dateArr = dateArr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVol != null ? idVol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vol)) {
            return false;
        }
        Vol other = (Vol) object;
        if ((this.idVol == null && other.idVol != null) || (this.idVol != null && !this.idVol.equals(other.idVol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Vol[ idVol=" + idVol + " ]";
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    @XmlTransient
    public Collection<Reservation> getReservationCollection() {
        return reservationCollection;
    }

    public void setReservationCollection(Collection<Reservation> reservationCollection) {
        this.reservationCollection = reservationCollection;
    }
    
}

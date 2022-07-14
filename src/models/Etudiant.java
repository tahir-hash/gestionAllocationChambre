package models;

import java.util.Date;

public class Etudiant extends Personne {
   

    @Override
    public String toString() {
        return "Etudiant [dateNaissance=" + dateNaissance + ", email=" + email + ", matricule=" + matricule
                + ", telephone=" + telephone + "]";
    }

    private String matricule;
    private String email;
    private String telephone;
    private Date dateNaissance;
    public Etudiant()
    {
        matricule= "MAT--"+id;
    }
    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

   

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}

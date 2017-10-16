/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

/**
 *
 * @author dally
 */
public class User {
    
    //propriété
    
    private Integer numero;  //clé primaire
    private String nom;
    private String prenom;
    private String sexe;
    private Integer age;
    private Integer taille;
    private String email;
    
    //constructeur
    
    public User()
    {
        
    }
    
    //getters
    
    public Integer getNumero()
    {
        return this.numero;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
     public String getPrenom()
    {
        return this.prenom;
    }
    
    public String getSexe()
    {
        return this.sexe;
    }
    
    public Integer getAge()
    {
        return this.age;
    }
       
    public Integer getTaille()
    {
        return this.taille;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
     
     //setters
     
    public void setNumero(Integer numero)
    {
        this.numero = numero;
    }
    
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }
     
    public void setSexe(String sexe)
    {
        this.sexe = sexe;
    }
    
    public void setAge(Integer age)
    {
        this.age = age;
    }
    
    public void setTaille(Integer taille)
    {
        this.taille = taille;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    //-----------------------------------------------------
    //AFFICHAGE DU PROFIL DU USER
    //-----------------------------------------------------
    @Override
    public String toString()
    {
        String retour;
        
        retour = "Nom      : " + nom + "\n";
        retour += "Prenom      : " + prenom + "\n";
        retour += "Age      : " + age + "\n";
        retour += "Sexe      : " + sexe + "\n";
        retour += "Taille      : " + taille + "\n";
        retour += "Mail      : " + email + "\n";
        
        return retour;
    }
    
}

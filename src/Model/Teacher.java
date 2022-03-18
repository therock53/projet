/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author roc
 */
public class Teacher extends Membre{

    public Teacher(int id, String email, String fistName, String lastName, String password, Date birthDate, String pLaceOfBirth, String imageProfile, int accountStatus, String sexe) {
        super(id, email, fistName, lastName, password, birthDate, pLaceOfBirth, imageProfile, accountStatus, sexe);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setpLaceOfBirth(String pLaceOfBirth) {
        this.pLaceOfBirth = pLaceOfBirth;
    }

    public void setImageProfile(String imageProfile) {
        this.imageProfile = imageProfile;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    
    
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getpLaceOfBirth() {
        return pLaceOfBirth;
    }

    public String getImageProfile() {
        return imageProfile;
    }

    public int getAccountStatus() {
        return accountStatus;
    }

    public String getSexe() {
        return sexe;
    }
 
    
    
}

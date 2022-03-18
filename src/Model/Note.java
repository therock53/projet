/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author roc
 */
public class Note {
    int id;
    int idOfTUnit;
    int idOfStudent;
    String reclamation;
    int note;

    public Note(int note) {
        this.note = note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdOfTUnit(int idOfTUnit) {
        this.idOfTUnit = idOfTUnit;
    }

    public void setIdOfStudent(int idOfStudent) {
        this.idOfStudent = idOfStudent;
    }

    public void setReclamation(String reclamation) {
        this.reclamation = reclamation;
    }

    public void setNote(int note) {
        this.note = note;
    }

    
    
    public int getId() {
        return id;
    }

    public int getIdOfTUnit() {
        return idOfTUnit;
    }

    public int getIdOfStudent() {
        return idOfStudent;
    }

    public String getReclamation() {
        return reclamation;
    }

    public int getNote() {
        return note;
    }
    
    
}

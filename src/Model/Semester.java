/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author roc
 */
public class Semester {
    int id;
    String semesterName;

    public Semester(String semesterName) {
        this.semesterName = semesterName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    
    public int getId() {
        return id;
    }

    public String getSemesterName() {
        return semesterName;
    }
    
    
}

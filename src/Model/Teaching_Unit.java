/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author roc
 */
public class Teaching_Unit {
    int id;
    String nameOfTUnit;
    int credit;
    int coefficient;
    int idTeacher;
    int idSemester;

    public Teaching_Unit(String nameOfTUnit, int credit, int coefficient, int idTeacher, int idSemester) {
        this.nameOfTUnit = nameOfTUnit;
        this.credit = credit;
        this.coefficient = coefficient;
        this.idTeacher = idTeacher;
        this.idSemester = idSemester;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameOfTUnit(String nameOfTUnit) {
        this.nameOfTUnit = nameOfTUnit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public void setIdSemester(int idSemester) {
        this.idSemester = idSemester;
    }

    
    public int getId() {
        return id;
    }

    public String getNameOfTUnit() {
        return nameOfTUnit;
    }

    public int getCredit() {
        return credit;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public int getIdSemester() {
        return idSemester;
    }
    
    
}

package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.JudgeRole;

/**
 * Created on 08/05/2020.
 *
 * @author Vincent
 */
public class Judge {
    private int number;
    private Official official;
    private String remarks;
    private JudgeRole role;

    public Judge() {
    }

    public Judge(int number, Official official, String remarks, JudgeRole role) {
        this.number = number;
        this.official = official;
        this.remarks = remarks;
        this.role = role;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Official getOfficial() {
        return official;
    }

    public void setOfficial(Official official) {
        this.official = official;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public JudgeRole getRole() {
        return role;
    }

    public void setRole(JudgeRole role) {
        this.role = role;
    }
}

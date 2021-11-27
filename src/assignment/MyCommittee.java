
package assignment;

import java.util.ArrayList;

public class MyCommittee {
    private String username;
    private String password;
    private String name;
    private String ic;
    private String nationality;
    private String dob;
    private String gender;
    private String contactno;
    private String email;
    private String address;
    private String secQuestion;
    private String secAns;
    
    private ArrayList<Appointment> app = new ArrayList<Appointment>();

    public MyCommittee(String username, String password, String name, String ic, String nationality, String dob, String gender, String contactno, String email, String address, String secQuestion, String secAns) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.ic = ic;
        this.nationality = nationality;
        this.dob = dob;
        this.gender = gender;
        this.contactno = contactno;
        this.email = email;
        this.address = address;
        this.secQuestion = secQuestion;
        this.secAns = secAns;
    } 

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Appointment> getApp() {
        return app;
    }

    public void setApp(ArrayList<Appointment> app) {
        this.app = app;
    }

    public String getSecQuestion() {
        return secQuestion;
    }

    public void setSecQuestion(String secQuestion) {
        this.secQuestion = secQuestion;
    }

    public String getSecAns() {
        return secAns;
    }

    public void setSecAns(String secAns) {
        this.secAns = secAns;
    }

    
    
}

package main.java.services;

import main.java.models.User;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserService {
    private String username;
    private String password;
    private String actualName;
    private String nationality;
    private Date dateOfBirth;
    private String gender;
    private String contactNo;
    private String email;
    private String address;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActualName() {
        return actualName;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
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

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private Integer postcode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String city;
    private String state;

    public UserService() {

    }

    public void addUser(String username, String password, String actualName, String nationality, String dateOfBirth, String gender, String contactNo, String email, String address, String postcode, String city, String state, String role) throws IOException {
        FileWriter fileWriter = new FileWriter("src/main/java/database/UserFile.txt", true); //Set true for append mode
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(username + "," + password + "," + actualName + "," + nationality + "," + dateOfBirth + "," + gender + "," + contactNo + "," + email + "," + address + "," + postcode + "," + city + "," + state + "," + role);
        printWriter.close();
    }

    public User viewUser(String input_username) throws FileNotFoundException {
        File userFile = new File("src/main/java/database/UserFile.txt");
        Scanner sc = new Scanner(userFile);
        User userDetails = new User();

        while (sc.hasNextLine()) {
            // Data from txt file
            String row = sc.nextLine(); // file content
            String username = row.split(",")[0].replaceAll("\\s+", "");
            if (username.equals(input_username)) {
                userDetails.setUsername(row.split(",")[0].replaceAll("\\s+", ""));
                userDetails.setPassword(row.split(",")[1].replaceAll("\\s+", ""));
                userDetails.setActualName(row.split(",")[2].replaceAll("\\s+", ""));
                userDetails.setNationality(row.split(",")[3].replaceAll("\\s+", ""));
                userDetails.setDateOfBirth(row.split(",")[4].replaceAll("\\s+", ""));
                userDetails.setGender(row.split(",")[5].replaceAll("\\s+", ""));
                userDetails.setContactNo(row.split(",")[6].replaceAll("\\s+", ""));
                userDetails.setEmail(row.split(",")[7].replaceAll("\\s+", ""));
                userDetails.setAddress(row.split(",")[8].replaceAll("\\s+", ""));
                userDetails.setPostcode(row.split(",")[9].replaceAll("\\s+", ""));
                userDetails.setCity(row.split(",")[10].replaceAll("\\s+", ""));
                userDetails.setState(row.split(",")[11].replaceAll("\\s+", ""));
                userDetails.setRole(row.split(",")[12].replaceAll("\\s+", ""));
            }
        }
        return userDetails;
    }

    public List<User> viewAllPeople() throws FileNotFoundException {
        File userFile = new File("src/main/java/database/UserFile.txt");
        Scanner sc = new Scanner(userFile);
        List<User> userDetails = new ArrayList<>();

        while (sc.hasNextLine()) {
            // Data from txt file
            String row = sc.nextLine(); // file content
            String role = row.split(",")[12].replaceAll("\\s+", "");
            if (role.equals("People")) {
                User tempUser = new User();
                tempUser.setUsername(row.split(",")[0].replaceAll("\\s+", ""));
                tempUser.setPassword(row.split(",")[1].replaceAll("\\s+", ""));
                tempUser.setActualName(row.split(",")[2].replaceAll("\\s+", ""));
                tempUser.setNationality(row.split(",")[3].replaceAll("\\s+", ""));
                tempUser.setDateOfBirth(row.split(",")[4].replaceAll("\\s+", ""));
                tempUser.setGender(row.split(",")[5].replaceAll("\\s+", ""));
                tempUser.setContactNo(row.split(",")[6].replaceAll("\\s+", ""));
                tempUser.setEmail(row.split(",")[7].replaceAll("\\s+", ""));
                tempUser.setAddress(row.split(",")[8].replaceAll("\\s+", ""));
                tempUser.setPostcode(row.split(",")[9].replaceAll("\\s+", ""));
                tempUser.setCity(row.split(",")[10].replaceAll("\\s+", ""));
                tempUser.setState(row.split(",")[11].replaceAll("\\s+", ""));
                tempUser.setRole(row.split(",")[12].replaceAll("\\s+", ""));
                userDetails.add(tempUser);
            }
        }
        return userDetails;
    }
}


package assignment;

import java.util.ArrayList;

public class MyCommittee {
private String name;
    private int password;
    private ArrayList<Appointment> app = new ArrayList<Appointment>();

    public MyCommittee(String name, int password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public ArrayList<Appointment> getApp() {
        return app;
    }

    public void setApp(ArrayList<Appointment> app) {
        this.app = app;
    }
    
}

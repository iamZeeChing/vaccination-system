
package assignment;

public class Appointment {
    private Vaccine vac;
    private Day day;
    private int id;
    private int time;
    private String dose;
    private MyCommittee owner; //OO

    public Appointment(Vaccine vac, Day day, int id, int time, MyCommittee owner) {
        this.vac = vac;
        this.day = day;
        this.id = id;
        this.time = time;
        this.dose = dose;
        this.owner = owner;
    }

    public Vaccine getVac() {
        return vac;
    }

    public void setVac(Vaccine vac) {
        this.vac = vac;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public MyCommittee getOwner() {
        return owner;
    }

    public void setOwner(MyCommittee owner) {
        this.owner = owner;
    }
    
    
}

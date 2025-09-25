package L10.Models;

public class School {
    public String id;
    public String name;
    public String city;
    public String studentsCount;
    public boolean isPublic;

    public String toString(){
        return
            "School name: " + name + " -- City: " + city;
    }

}

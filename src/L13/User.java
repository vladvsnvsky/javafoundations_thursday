package L13;

import java.time.LocalDate;

public class User {
    //atribute
    String username;
    String password;
    LocalDate birthdate;

    //constructor
    public User(){
        System.out.println("Step 1");
        System.out.println("Step 2");
    }

    public User(String _username){
        username = _username;
    }

}

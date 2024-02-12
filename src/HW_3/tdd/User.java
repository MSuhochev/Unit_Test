package HW_3.tdd;


public class User {
    String name;
    String password;
    boolean isAuthenticate;
    boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isAuthenticate = isAdmin;
    }


    public void setAuthenticate(boolean authenticate) {
        isAuthenticate = authenticate;
    }

    //3.6.
    public boolean authenticate(String inputUsername, String inputPassword) {
        return name.equals(inputUsername) && password.equals(inputPassword);
    }

    public boolean isAuthenticate(){
        return isAuthenticate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        }

    public boolean isAdmin() {
        return true;
    }
}
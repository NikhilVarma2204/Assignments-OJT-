package UserCredentials;

public class Login {
    String userName= "Nikhil";
    String password = "1234";
    void LoginUser(String user,String pass){
        if(user==userName&&pass==password){
            System.out.println("LOgged In");
        }else
        System.out.println("Inavaid Details");
    }
    

}

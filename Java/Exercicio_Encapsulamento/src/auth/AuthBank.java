package auth;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class AuthBank {
    private final Map<String, Credential> credentials; // User && Pass
    private String nick;

    public String getNick() {
        return nick;
    }

    protected void setNick(String nick) {
        this.nick = nick;
    }

    public AuthBank(){
        credentials = new HashMap<>();
    }

    public void createUserBank(){
        try {
            Scanner data = new Scanner(System.in);

            System.out.print("Enter username: ");
            setNick(data.nextLine());

            System.out.print("Enter password: ");
            String pass = data.nextLine();

            AddCredential(getNick(), pass);

        } catch (Exception e) {
            System.err.println("Error creating user: " + e.getMessage());
        }
    }

    public void AddCredential(String user, String pass) {
        Credential credential = new Credential(pass);
        credentials.put(user, credential);
    }

    public Credential getCredenTial(String user) {
        return credentials.get(user);
    }

    public boolean AuthInBankService(String user, String pass){
        try {
            if (credentials.containsKey(user)){
                Credential searchCredential = credentials.get(user);
                return searchCredential.verifyPass(pass);
            } else {
                return false;
            }
        } catch (NullPointerException  e) {
            System.err.println("Error in authentication: " + e.getMessage());
            return false;
        }
    }
}

package auth;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Credential {
    private String hashPass;

    public Credential(String pass) {
        this.hashPass = CreateHashPass(pass);
    }

    public boolean verifyPass(String pass) {
        String hashDigitPass = CreateHashPass(pass);
        return hashPass.equals(hashDigitPass);
    }

    private String CreateHashPass(String pass) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(pass.getBytes());
            return Base64.getEncoder().encodeToString(bytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }
}


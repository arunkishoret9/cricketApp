package entities;

import org.springframework.stereotype.Component;
import org.jasypt.util.text.BasicTextEncryptor;

@Component
public class EncryptionUtil {

    private BasicTextEncryptor textEncryptor;

    EncryptionUtil(){
        textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("MyEncriptPassword123");
    }

    public String encrypt(String data){
    return textEncryptor.encrypt(data);
    }

    public String decrypt(String data){
        return textEncryptor.decrypt(data);
    }
}

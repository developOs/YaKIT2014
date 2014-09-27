package hashencrypt;
 
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class HashEncrypt {
 
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
    
    final String inputHash      = "fe2592b42a727e977f055947385b709cc82b16b9a87f88c6abf3900d65d0cdc3";
    final int lenPasswd         = 100000;
    final String methodHash     = "sha256";     // md5, sha1, sha256
    switch(methodHash) { 
        case "md5":
            for (int i = 0 ; i < lenPasswd; i++) {
                String inputString = Integer.toString(i);
                System.out.print("Input String: " + inputString + "\t" );
        
                String md5Hash = HashGeneratorUtils.generateMD5(inputString);
                System.out.println("MD5 Hash: \t" + md5Hash);
                if (inputHash.equals(md5Hash)) {
                    System.out.println("[УСПЕШНО]\nВведенный хэш:\t" + inputHash+ "\nНайденый хэш:\t" + md5Hash + "\nПароль:\t\t" + i);
                    break;
                }
            }
            break;
            
        case "sha1":
            for (int i = 0 ; i < 10000; i++) {
                String inputString = Integer.toString(i);
                System.out.print("Input String: " + inputString + "\t" );
                String sha1Hash = HashGeneratorUtils.generateSHA1(inputString);
                System.out.println("SHA-1 Hash: \t" + sha1Hash);
                if (inputHash.equals(sha1Hash)) {
                    System.out.println("[УСПЕШНО]\nВведенный хэш:\t" + inputHash+ "\nНайденый хэш:\t" + sha1Hash + "\nПароль:\t\t" + i);
                    break;
                }
            }
            break;
            
        case "sha256":        
            for (int i = 0 ; i < 10000; i++) {
                String inputString = Integer.toString(i);
                System.out.print("Input String: " + inputString + "\t" );    
                String sha256Hash = HashGeneratorUtils.generateSHA256(inputString);
                System.out.println("SHA-256 Hash: \t" + sha256Hash);
                if (inputHash.equals(sha256Hash)) {
                    System.out.println("[УСПЕШНО]\nВведенный хэш:\t" + inputHash+ "\nНайденый хэш:\t" + sha256Hash + "\nПароль:\t\t" + i);
                    break;
                }
            }
            break;
            
        default:
            System.out.println("Указан не правильный метод хеширования");
        }
    }
}

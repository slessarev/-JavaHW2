/**
 * task2
 */
import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;

public class task2 {

    public static void main(String[] args) {
        Path path = Path.of("file.txt");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEXT");
        }
        String result = sb.toString();
        
            if (Files.exists(path)) {
                System.out.println("Найден файл");
            }
            else {
                for (int i = 0; i<100; i++){
                try{
                    
                    Files.writeString(path, result);
                        } catch(IOException e){
                            System.out.println("Error" + e);
                        }
                }
            }    
        } 
     
}
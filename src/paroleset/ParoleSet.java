
package paroleset;

import java.io.IOException;
import model.Reader;

public class ParoleSet {

    public static void main(String[] args) throws IOException {
        
        Reader r = new Reader();
        System.out.println(r.read("src\\data\\romanzo.txt"));
        
    }
    
}

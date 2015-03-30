
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Reader {
    
    HashMap<String, Integer> m;
    int totWords, nWords;
    
    public Reader(){
        
        m = new HashMap<>();
        
    }
    
    public String read(String path) throws FileNotFoundException, IOException{
        
        File f = new File(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        String line = null;
        
        while((line = br.readLine()) != null){
            
            String [] tmp = line.split("\\s+");
            
            for (int i = 0; i < tmp.length; i++) {
                totWords++;
                if (m.get(tmp[i].toLowerCase()) == null) {
                    m.put(tmp[i].toLowerCase(), 1);
                }
                else{
                    int x = m.get(tmp[i].toLowerCase());
                    x++;
                    m.put(tmp[i].toLowerCase(), x);
                }
            }
            
        }
        
        return "Tot: " + totWords + "\n" + m.toString();
        
    }
}

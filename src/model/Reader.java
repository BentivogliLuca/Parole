
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Reader {
    
    HashSet s;
    int totWords, nWords;
    
    public Reader(){
        
        s = new HashSet();
        
    }
    
    public String read(String path) throws FileNotFoundException, IOException{
        
        File f = new File(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
        String line = null;
        
        while((line = br.readLine()) != null){
            
            String [] tmp = line.split("\\s+");
            
            for (int i = 0; i < tmp.length; i++) {
                totWords++;
                s.add(tmp[i].toLowerCase());
            }
            
        }
        
        return "Tot: " + totWords + " \nnParole: " + s.size() + "\n" + s.toString();
        
    }
    
}

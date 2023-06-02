/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hari
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     * 
     */
    public boolean verfDico (String mot,List<String> dico){
        if(dico.contains(mot)){
            return true;
        }
        return false;
    }
    public List<String> traduction (Character [] morses,char[] letter,String[] code){
        List <String> valiny = new ArrayList();
        
        return valiny;
    }
    public int nombreMotvalide (List<String> rep,List<String> dico){
        int r = 0;
        for(int i=0; i< rep.size(); i++){
            if (this.verfDico(rep.get(i), dico)) r++;
        }
        
        return r;
    }
    
    public static void main(String[] args) {
        
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                          'g', 'h', 'i', 'j', 'k', 'l',
                          'm', 'n', 'o', 'p', 'q', 'r',
                          's', 't', 'u', 'v', 'w', 'x',
                          'y', 'z', '1', '2', '3', '4',
                          '5', '6', '7', '8', '9', '0' };
        String[] code
            = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };
    }
    
    
    
}

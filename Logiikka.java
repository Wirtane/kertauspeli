package kertauspeli;

import java.util.HashMap;
import java.util.Random;

public class Logiikka {
    
    private HashMap<String, String> parit;
    private HashMap<String, String> pairs;
    
    public Logiikka(){
        this.parit = new HashMap<>();
        this.pairs = new HashMap<>();
    }
    
    public void lisaa(String avain, String arvo){
        if(!this.parit.containsKey(avain)){
            this.parit.put(avain, arvo);
        }
    }
    
    public void lisaaEnglanniksi(String arvo, String avain){
        if(!(this.pairs.containsKey(avain))){
            this.pairs.put(arvo, avain);
        }
    }
    
    public String selitysSuomeksi(String sana){
        if(!this.parit.keySet().contains(sana)){
            return "Sanalle ei ole selitystä!";
        }
        
         return this.parit.get(sana);
    }
    
    public String selitysEnglanniksi(String sana){
        if(!this.pairs.keySet().contains(sana)){
            return "Sanalle ei ole selitystä!";
        }
        
         return this.pairs.get(sana);
    }
    
    public void arvoSelityksenKieli(){
        
    }
}


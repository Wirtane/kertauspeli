package kertauspeli;

import java.util.HashMap;

public class Logiikka {
    
    private HashMap<String, String> parit;
    
    public Logiikka(){
        this.parit = new HashMap<>();
    }
    
    public void lisaa(String avain, String arvo){
        if(!this.parit.containsKey(avain)){
            this.parit.put(avain, arvo);
        }
    }
    
    public String annaSelitys(String sana){
        if(!this.parit.keySet().contains(sana)){
            return "Sanalle ei ole selitystä!";
        }
        
         return this.parit.get(sana);
    }
}

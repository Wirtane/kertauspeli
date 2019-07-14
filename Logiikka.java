package kertauspeli;

import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

public class Logiikka {
    
    private HashMap<String, String> parit;
    private HashMap<String, String> pairs;
    private ArrayList<String> avaimet;
    
    public Logiikka(){
        this.parit = new HashMap<>();
        this.pairs = new HashMap<>();
        this.avaimet = new ArrayList<>();
    }
    
    public void lisaa(String avain, String arvo){
        if(!this.parit.containsKey(avain)){
            this.parit.put(avain, arvo);
        }
        
        if(!(this.avaimet.contains(avain))){
            this.avaimet.add(avain);
        }
    }
    
    public void lisaaEnglanniksi(String avain, String arvo){
        if(!(this.pairs.containsKey(avain))){
            this.pairs.put(avain, arvo);
        }
        
        if(!(this.avaimet.contains(avain))){
            this.avaimet.add(avain);
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
    
    public String arvoSelityksenKieli(String sana){
        Random rnd = new Random();
        int luku = rnd.nextInt(2);
        
        if(luku == 0){
           return this.selitysEnglanniksi(sana);
        }else{
            return this.selitysSuomeksi(sana);
        }
    }
    
    public String haeTermi(){
        Random rnd = new Random();
        int luku = rnd.nextInt(this.parit.size());
        
        for(String termi: this.parit.keySet()){
            
        }
        return "";
    }
}


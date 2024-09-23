
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import modell.Ember;


public class FajlOlvasas {

    
    public static void main(String[] args) throws IOException{
        InputStream szoveg = FajlOlvasas.class.getClassLoader().getResourceAsStream("res/emberek.csv");
        BufferedReader br = new BufferedReader(new InputStreamReader(szoveg));
        ArrayList<Ember> emberek = new ArrayList<>();
        String sor;
        while((sor = br.readLine()) != null){
            String[] s = sor.split(";");
            String nev = s[0];
            String cim = s[1];
            Ember ember = new Ember(sor);
            emberek.add(ember);
        }
        
        System.out.println("fájl tartalma");
        for (Ember ember : emberek) {
            System.out.println(ember);
        }
        
        System.out.println("Ki lakik Bp-n?");
        int i = 0;
        while(!emberek.get(i).getCim().equals("Bp")){
            i++;
        }
        System.out.println(emberek.get(i).getNev());
    }
    
}

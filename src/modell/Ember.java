
package modell;


public class Ember {
    private String nev;
    private String cim;

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", cim=" + cim + '}';
    }
    
    public Ember(String sor){
        String[] s = sor.split(";");
        String nev = s[0];
        String cim = s[1];
    }
    
    
    public Ember(String nev,String cim){
        
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }
    
     
}

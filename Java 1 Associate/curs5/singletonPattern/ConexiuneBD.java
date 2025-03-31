package singletonPattern;

public class ConexiuneBD {
    int durata;
    String nume;
    private static ConexiuneBD conexiuneBD;

    private ConexiuneBD(){

    }
    public static ConexiuneBD getConexiuneBD(){
        if(conexiuneBD == null){
            conexiuneBD = new ConexiuneBD();
        }
        return conexiuneBD;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "ConexiuneBD{" +
                "durata=" + durata +
                ", nume='" + nume + '\'' +
                '}';
    }
}

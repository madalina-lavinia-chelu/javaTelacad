package singletonPattern;

public class Main {
    public static void main(String[] args) {
        //ConexiuneBD conexiuneBD = new ConexiuneBD(); nu funnctioneaza deoarece constructorul este privat

        ConexiuneBD conexiuneBD = ConexiuneBD.getConexiuneBD();
        conexiuneBD.setDurata(100);
        conexiuneBD.setNume("bazaMaria");

        System.out.println(conexiuneBD);

        ConexiuneBD conexiuneBD1 = ConexiuneBD.getConexiuneBD();

        System.out.println(conexiuneBD1);
        conexiuneBD1.setNume("NewDataBase");
        System.out.println(conexiuneBD1);
    }
}

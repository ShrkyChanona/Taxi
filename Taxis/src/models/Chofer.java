package models;

public class Chofer {
    private String nombre;
    private short id;
    private Taxis[] listaTaxis;
    public Chofer(byte numeroTaxis){
        listaTaxis = new Taxis[numeroTaxis];
    }

    public short getId() {
        return id;
    }
    public void setId(short id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
}

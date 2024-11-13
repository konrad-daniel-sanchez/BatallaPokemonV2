package logicaNegocio;

public abstract class Pokemon {
    private String nombre;
    private int salud;
    private int puntosDeAtaque;

    public Pokemon(String nombre, int salud, int puntosDeAtaque) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setPuntosDeAtaque(int puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }
    
    public void recibirAtaque(int ataque){
        this.salud -= ataque;
    }
}

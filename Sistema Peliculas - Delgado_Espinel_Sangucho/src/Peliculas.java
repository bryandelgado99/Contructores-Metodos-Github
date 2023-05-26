/*Hola compañeras, les recomiendo que por favor coloquen un comentario con su nombre hasta la parte que agregaron, asi
   podemos mantener un control más limpio de los cambios en los archivos Java*/
public class Peliculas {
    //Atributos
    String nombre, director, actor_principal, productora, genero, pais, taquilla;
    int anio;

    //Constructores
    public Peliculas(String nombre, String director, String actor_principal, String productora, String genero, String pais, int anio, String taquilla) {
        this.nombre = nombre;
        this.director = director;
        this.actor_principal = actor_principal;
        this.productora = productora;
        this.genero = genero;
        this.pais = pais;
        this.anio = anio;
        this.taquilla = taquilla;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor_principal() {
        return actor_principal;
    }

    public void setActor_principal(String actor_principal) {
        this.actor_principal = actor_principal;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(String taquilla) {
        this.taquilla = taquilla;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //Método para imprimir datos de las películas
    public void imprimir_Datos() {
        System.out.println("\nUsuario, su pelicula escogida es: " + this.nombre);
        System.out.println("Su director fue: " + this.director);
        System.out.println("Su actor principal fue: " + this.actor_principal);
        System.out.println("Quien produjo la pelicula fue:"  + this.productora);
        System.out.println("Su genero es: " + this.genero);
        System.out.println("Su pais es: " + this.pais);
        System.out.println("Su año de estreno fue: " + this.anio);
        System.out.println("Su taquilla fue: " + this.taquilla+ "\n");
    }
}
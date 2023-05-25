import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Creacion de isntancias
        Peliculas film1 = new Peliculas("Gigolo Por Accidente", "Mike Mitchell",
                "Rob Schneider", "Happy Madison", "Comedia",
                "Estados Unidos", 1999, "$92 millones");
        Peliculas film2 = new Peliculas("Django Desencadenado", "Quentin Tarantino",
                "Jamie Foxx", "Columbia Pictures", "Wester Drama",
                "Estados Unidos", 2012, "$425 millones");
        Peliculas film3 = new Peliculas("Rtas, ratones y rateros", "Sebastian Cordero",
                "Carlos Valencia, Marco Bustos, Simon Braurer", "Cabezahueca",
                "Drama - Crimen", "Ecuador", 1999, "$41 mil");


        //Menu Inicial
        System.out.println("---------- Bienvenido a PeliMaster! ---------");
    }
}
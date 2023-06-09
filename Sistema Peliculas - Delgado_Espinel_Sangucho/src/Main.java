import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                // Creacion de isntancias
                Peliculas film1 = new Peliculas("Gigolo Por Accidente", "Mike Mitchell",
                                "Rob Schneider", "Happy Madison", "Comedia",
                                "Estados Unidos", 1999, "$92 millones");
                Peliculas film2 = new Peliculas("Django Desencadenado", "Quentin Tarantino",
                                "Jamie Foxx", "Columbia Pictures", "Wester Drama",
                                "Estados Unidos", 2012, "$425 millones");
                Peliculas film3 = new Peliculas("Rtas, ratones y rateros", "Sebastian Cordero",
                                "Carlos Valencia, Marco Bustos, Simon Braurer", "Cabezahueca",
                                "Drama - Crimen", "Ecuador", 1999, "$41 mil");

                Peliculas film4 = new Peliculas("La La Land", "Damien Chazelle", "Emma Stone, Ryan Gosling",
                                "Summit Entertainment", "Drama - Musical", "Estados Unidos", 2016, "$447,4 millones");
                Peliculas film5 = new Peliculas("Spider-Man 2", "Sam Raimi", "Tobey Maguire",
                                "Columbia Pictures", "Accion - superheroes", "Estados Unidos", 2004, "789 millones");
                Peliculas film6 = new Peliculas("Wonder Woman)", "Patty Jenkins", "Gal Gadot", "DC Studios",
                                "Accion - Superheroes", "Estados Unidos", 2017, "822,8 millones ");
                Peliculas film7 = new Peliculas("Interestelar", "Christopher Nolan", "Matthew McConaughey",
                                "Paramount Pictures", "Ciencia Ficcion - Aventura", "Estados Unidos", 2014,
                                "701,7 millones");

                Peliculas film8 = new Peliculas("The Batman", "Matt Reeves", "Robert Pattinson",
                                "Warner Bros. Pictures",
                                "Accion - Crimen - Drama", "Estados Unidos", 2022, "$770 millones");
                Peliculas film9 = new Peliculas("Contratiempo", "Oriol Paulo", "Mario Casas", "Think Studio",
                                "Misterio - Thriller", "España", 2016, "$30 millones");
                Peliculas film10 = new Peliculas("Pinocho de Guillermo del Toro", "Guillermo del Toro", "Ewan McGregor",
                                "Netflix Animation", "Animacion - Fantasia - Musical", "Estados Unidos", 2022,
                                "$108 millones");

                Peliculas film11 = new Peliculas("Spiderman: Into the Spiderverse", "Peter Ramsey", "Shameik Moore",
                                "Sony Pictures Animation", "Animacion - Ciencia Ficción", "Estados Unidos", 2018,
                                "$375 millones");
                Peliculas film12 = new Peliculas("Doctor Strange in the Multiverse of Madness", "Sam Raimi",
                                "Benedict Cumberbatch",
                                "Marvel Studios", "Ciencia Ficción", "Estados Unidos", 2022, "$955 millones");

                System.out.println("---------- Bienvenido a PeliMaster! ---------");

                System.out.println("\n En los filmes, su rango de seleccion es 1-12.");
                System.out.print("Por favor, seleccione el numero de la pelicula a conocer: ");

                Scanner entrada = new Scanner(System.in);
                int opcion = entrada.nextInt(); // Creamos una vairble que permita ingresar en el selector

                // Creamos un switch para poder hacer el selector de filmes
                switch (opcion) {
                        case 1:
                                film1.imprimir_Datos();
                                break;
                        case 2:
                                film2.imprimir_Datos();
                                break;
                        case 3:
                                film3.imprimir_Datos();
                                break;
                        case 4:
                                film4.imprimir_Datos();
                                break;
                        case 5:
                                film5.imprimir_Datos();
                                break;
                        case 6:
                                film6.imprimir_Datos();
                                break;
                        case 7:
                                film7.imprimir_Datos();
                                break;
                        case 8:
                                film8.imprimir_Datos();
                                break;
                        case 9:
                                film9.imprimir_Datos();
                                break;
                        case 10:
                                film10.imprimir_Datos();
                                break;
                        case 11:
                                film11.imprimir_Datos();
                                break;
                        case 12:
                                film12.imprimir_Datos();
                                break;
                        default:
                                System.out.println("Filme no pertenece a la base de datos!");
                                break;
                }
        }
}
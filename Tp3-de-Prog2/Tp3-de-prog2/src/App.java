import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.IntPredicate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 1.1: Interfaces Base");

        Predicate<Integer> esPar = (numero) -> numero % 2 == 0;
        System.out.println("¿Es 4 un número par? " + esPar.test(4));

        Function<String, Integer> LongitudCadena = (cadena) -> cadena.length();
        System.out.println("La longitud de 'Hola Mundo' es: " + LongitudCadena.apply("Hola Mundo"));

        Consumer<Integer> imprimirNumero = (numero) -> System.out.println("Número: " + numero);
        imprimirNumero.accept(10);

        Supplier<Double> numeroAleatorio = () -> Math.random();
        System.out.println("Número aleatorio: " + numeroAleatorio.get());

        System.out.println("------------------------------");
        System.out.println("Ejercicio 1.2: (Ordenación con Comparator)");

        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Carlos");
        nombres.sort((a, b) -> a.length() - b.length());
        System.out.println("Nombres ordenados por length: " + nombres);

        System.out.println("------------------------------");
        System.out.println("Ejercicio 1.3: (Variantes Primitivas)");

        IntPredicate esParPrimitivo = (numero) -> numero % 2 == 0;
        System.out.println("¿Es 5 un número par? " + esParPrimitivo.test(5));

        System.out.println("------------------------------");
        System.out.println("Ejercicio 2.1:(Creación y Extracción)");

        long cantidadRestante = Stream.of(2, 5, 3, 3, 6, 2, 4)
                .distinct()
                .skip(1)
                .limit(3)
                .count();

        System.out.println("Cantidad de elementos resultantes: " + cantidadRestante);

        System.out.println("------------------------------");
        System.out.println(" Ejercicio 2.2: (Filtrado y Procesamiento Intermedio)");

        long manzanasAprobadas = Stream.of(1, 4, 2, 5, 3, 6)
                .filter(s -> s > 3)

                .peek(n -> System.out.println("Espiando elemento que pasó el filtro: " + n))

                .count();

        System.out.println("Total de elementos mayores a 3: " + manzanasAprobadas);

        System.out.println("------------------------------");
        System.out.println("Ejercicio 3.1: (Transformación con Map)");

        System.out.println("Nombres en mayúsculas:");
        Stream.of("Juan", "Maria", "Ana")
                .map(s -> s.toUpperCase())
                .forEach(nombre -> System.out.println(nombre));

        System.out.println("------------------------------");
        System.out.println("Ejercicio 3.2: (Map a tipos primitivos)");
        int sumaDeLetras = Stream.of("Juan", "Maria", "Ana")
                .mapToInt(s -> s.length())
                .sum();

        System.out.println("La suma de todas las letras es: " + sumaDeLetras);

        System.out.println("------------------------------");
        System.out.println("Ejercicio 3.3: (Aplanamiento con flatMap)");
        List<String> grupo1 = Arrays.asList("Juan", "Alejandro");
        List<String> grupo2 = Arrays.asList("Ana", "Margarita");

        List<List<String>> listaDeListas = Arrays.asList(grupo1, grupo2);

        long nombresLargos = listaDeListas.stream()
                .flatMap(lista -> lista.stream())
                .filter(nombre -> nombre.length() > 4)
                .count();

        System.out.println("Nombres con más de 4 caracteres: " + nombresLargos);
        System.out.println("------------------------------");
        System.out.println("Ejercicio 3.4 (Ordenación)");
        System.out.println("Orden Natural (Alfabético):");
        Stream.of("Zebra", "Manzana", "Gato", "Perro")
                .sorted() 
                .forEach(s -> System.out.println(s));

        System.out.println("\nOrden Personalizado (Por longitud):");
        Stream.of("Zebra", "Manzana", "Gato", "Perro")
                .sorted((a, b) -> a.length() - b.length()) 
                .forEach(s -> System.out.println(s));
        

        
        System.out.println("------------------------------");
        System.out.println("Ejercicio 4.1 (Comprobaciones lógicas)");
        boolean p1 =  Stream.of(2, 5, 7, 3, 6, 2, 3)
        .anyMatch(n -> n > 5);
        System.out.println("" + p1);

        boolean p2 = Stream.of(2, 5, 7, 3, 6, 2, 3)
        .allMatch(n -> n > 5);
        System.out.println(p2);

        boolean p3 = Stream.of(2, 5, 7, 3, 6, 2, 3)
        .noneMatch(n -> n > 5);
        System.out.println(p3);

        System.out.println("------------------------------");
        System.out.println("Ejercicio 4.2 (Búsqueda y Clase Optional)");
        Optional<Integer> primerPar = Stream.of(1, 3, 5, 8, 10, 11)
                .filter(n -> n % 2 == 0) // Filtramos buscando pares 
                .findFirst(); // Atrapamos el primero que pase el filtro 

        if (primerPar.isPresent()) { 
            System.out.println("Se encontró un par es el: " + primerPar.get()); 
        } else {
            System.out.println("La caja está vacía, no se encontraron pares.");
        }
        System.out.println("------------------------------");
        System.out.println("Ejercicio 4.3: (Reducción)");

        Optional<Integer> sumaTotal = Stream.of(10, 20, 30)
                .reduce((a, b) -> a + b); 

        System.out.println("La suma de todo el Stream es: " + sumaTotal.get());

        System.out.println("------------------------------");
        System.out.println("Ejercicio 4.4 (Reducción a Colección)");
        Stream<Integer> duplicado = Stream.of(4,5,6,4,3,2,2,9);

        List<Integer> lista = duplicado
        .distinct()
        .collect(Collectors.toList());

        System.out.println(lista);


        List<Persona> personas = List.of(
            new Persona("Jose",14506421),
            new Persona("Carlos",49293010),
            new Persona("Ezequiel",12032040 )
        );


        Map<Integer, String> mapaPersonas = personas.stream()
            .collect(Collectors.toMap(
                p -> p.getDni(),
                p -> p.getNombre() 
            ));


        Integer dniABuscar = 87654321;
        String nombreEncontrado = mapaPersonas.get(dniABuscar);

        System.out.println("Buscando DNI " + dniABuscar + ": " + nombreEncontrado);
        System.out.println("Mapa resultante: " + mapaPersonas);
            
    }
}

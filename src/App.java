import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"),
            new Persona("Maria", 30, "F"),
            new Persona("Pedro", 20, "M"),
            new Persona("Ana", 28, "F")
        );
        //1 .Busque una persona con nombre "Maria"
        //Retorne la persona si lo enocntro

        //2. Busque una persona con nombre "Diego"
        //retorne si lo encontro

        //3. Busque una persona con noombre "Ana"
        //imprima la posicion de la persona si lo entcontro

        BusquedaLineal buscador = new BusquedaLineal(personas);

        Persona maria = buscador.findByName("Maria");
        if (maria != null) {
            System.out.println("1. Encontrado: " + maria.getName() + ", " + maria.getAge() + " años");
        } else {
            System.out.println("1. Maria no fue encontrada.");
        }

        Persona diego = buscador.findByName("Diego");
        if (diego != null) {
            System.out.println("2. Diego fue encontrado.");
        } else {
            System.out.println("2. Diego no fue encontrado en la lista.");
        }

        int posicionAna = buscador.findPosByName("Ana");
        if (posicionAna != -1) {
            System.out.println("3. Ana fue encontrada en la posición: " + posicionAna);
        } else {
            System.out.println("3. Ana no se encuentra en la lista.");
        }


    }
}

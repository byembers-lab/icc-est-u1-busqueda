import java.util.List;

public class BusquedaLineal {
    private List<Persona> personas;

    public BusquedaLineal(List<Persona> personas){
        this.personas = personas;
    }

    //Busque una pesona
    //Retorne La persona so lo encontro
    //retorne NULL sino lo encuntra

    public Persona findByName(String name){
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getName().equals(name)){
                return personas.get(i);
            }
        }
        return null;
    }

    //Busque la pos de una pesona
    //Retorne la posicion dew la persona si se encontro
    //retorne -1 sino lo encuntra

    public int findPosByName(String name){
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

}

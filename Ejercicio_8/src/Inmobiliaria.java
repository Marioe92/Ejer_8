import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria {

    private String nombre;
    private String ubicacion;

    private List<Inmuable> listainmuebles = new ArrayList();

    public Inmobiliaria() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Inmuable> getListainmuebles() {
        return listainmuebles;
    }

    public void setListainmuebles(List<Inmuable> listainmuebles) {
        this.listainmuebles = listainmuebles;
    }

    public void addListaInmueble(Inmuable inmuable) {
        listainmuebles.add(inmuable);
    }

    public void delListaInmueble(Inmuable inmuable) {
        listainmuebles.remove(inmuable);
    }

    @Override
    public String toString() {
        return "Inmobiliaria{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", listainmuebles=" + listainmuebles +
                '}';
    }
}
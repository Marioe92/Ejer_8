public class Main {
    public static void main(String[] args) {

        Inmobiliaria inmobiliaria = new Inmobiliaria();
        Inmuable inmuable = new Inmuable();

        inmobiliaria.addListaInmueble(inmuable);
        inmuable.setCalle("La paz");

        inmobiliaria.delListaInmueble(inmuable);
        System.out.println("fin");

    }
}
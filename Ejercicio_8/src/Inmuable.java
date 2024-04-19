public class Inmuable {

    private String calle;
    private int metros;
    private int id;

    public Inmuable() {
    }

    public Inmuable(String calle, int metros, int id) {
        this.calle = calle;
        this.metros = metros;
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Inmuable{" +
                "calle='" + calle + '\'' +
                ", metros=" + metros +
                ", id=" + id +
                '}';
    }
}

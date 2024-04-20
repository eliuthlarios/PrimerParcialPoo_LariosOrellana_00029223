public class Telefono extends ArticulosElectronicos implements Metodos{
    public String SistemaOperativoMovil;
    public String Marca;
    public int id;

    public Telefono(){}
    public Telefono(String nombre, String modelo, double precio, String sistemaOperativoMovil, String marca, int id) {
        super(nombre, modelo, precio,id);
        SistemaOperativoMovil = sistemaOperativoMovil;
        Marca = marca;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSistemaOperativoMovil() {
        return SistemaOperativoMovil;
    }

    public void setSistemaOperativoMovil(String sistemaOperativoMovil) {
        SistemaOperativoMovil = sistemaOperativoMovil;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    //metodos interface
    public void ObtenerPrecio(){
        System.out.println("El precio es ; ");


    }

    public void Descripcion(){
        System.out.println("Descripcion del Dispositivo; ");


    }
    public void tipoDeDispositivo(){
        System.out.println("Tipo de disposivo; Laptop");

    }
    public void MostrarInformacion(){
        System.out.println("Telefono{" +
                "SistemaOperativoMovil='" + SistemaOperativoMovil + '\'' +
                ", Marca='" + Marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Precio='" + Precio + '\'' +
                '}');

    }


}

public class Laptops extends ArticulosElectronicos implements Metodos{
    private String SistemaOperativo;
    private int TamanodePantalla;
    private String Marca;


    public Laptops(){

    }

    public Laptops(String nombre, String modelo, double precio, int id, String sistemaOperativo, int tamanodePantalla, String marca) {
        super(nombre, modelo, precio, id);
        SistemaOperativo = sistemaOperativo;
        TamanodePantalla = tamanodePantalla;
        Marca = marca;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }

    public int getTamanodePantalla() {
        return TamanodePantalla;
    }

    public void setTamanodePantalla(int tamanodePantalla) {
        TamanodePantalla = tamanodePantalla;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }
    public void ObtenerPrecio(){
        System.out.println("El precio es ; ");


    }

    public void Descripcion(){
        System.out.println("Descripcion del Dispositivo; ");


    }
    public void tipoDeDispositivo(){
        System.out.println("Tipo de disposivo; Laptop");

    }


    public void MostrarInformacion() {
        System.out.println("Laptops{" +
                "SistemaOperativo='" + SistemaOperativo + '\'' +
                ", TamanodePantalla=" + TamanodePantalla +
                ", Marca='" + Marca + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Precio='" + Precio + '\'' +
                '}');
    }
}

public abstract class ArticulosElectronicos {
protected String nombre;

protected String Modelo;

protected double Precio;
protected int id;


public abstract void  tipoDeDispositivo();
public abstract void MostrarInformacion();

    public ArticulosElectronicos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArticulosElectronicos(String nombre, String modelo, double precio,int id) {
        this.nombre = nombre;
        Modelo = modelo;
        Precio = precio;
        this.id=id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }
}

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import  java.util.ArrayList;
public class Main {
    static ArrayList<ArticulosElectronicos> ListaDeArticulos= new ArrayList<ArticulosElectronicos>();
    public static void main(String[] Args){menuPrincipal();
    }
    public static void menuPrincipal(){
        Scanner sn = new Scanner(System.in);

        int opcion;

        while(true){

            try{
                MostrarMenuDeOpciones();
                opcion=sn.nextInt();
                if(opcion==0){break;}

                switch (opcion){
                    case 1:
                        AgregarArticulo();

                    break;
                    case 2 :
                        ModificarArticulo();
                    break;
                    case 3 :
                        ConsultarArticulo();
                    break;

                    default:
                        System.out.println("Ingrese un dato valido");
                        break;



                }

            }catch (Exception e){
                System.out.println("Ingrese un valor adecuado");
                sn.next();

            }
        }


    }
    public static void MostrarMenuDeOpciones(){
        System.out.println("Tienda de articulos electronicos\n 1.Agregar Articulo\n 2. Modificar Articulo\n 3.Consultar articulo\n Ingrese opcion: \n 0. Salir");

    }
    public static void AgregarArticulo(){
        Scanner sn = new Scanner(System.in);
        String Nombre;
        String Modelo;
        double precio;
        String SistemaOP;
        String MArca;
        int tipo;
        System.out.println("Ingrese Nombre "); Nombre=sn.nextLine();
        System.out.println("Ingrese Modelo"); Modelo =sn.nextLine();
        System.out.println("Ingrese Id ");int id = sn.nextInt();
        System.out.println("Ingrese Precio "); precio = sn.nextDouble();sn.nextLine();
        System.out.println("Ingrese Systema Operativo "); SistemaOP=sn.nextLine();
        System.out.println("Ingrese Marca ");MArca=sn.nextLine();
        System.out.println("Ingrese tipo de dispositivo ");
        tipo=TipoDeArticulo();
        if(tipo==1){
            ArticulosElectronicos NuevoTelefono = new Telefono(Nombre,Modelo,precio, SistemaOP,MArca,id);
            ListaDeArticulos.add(NuevoTelefono);
            System.out.println("dispositivo anadido correctamente");


        }else {
            System.out.println("Ingrese Tamano de pantalla "); int Tamaño=sn.nextInt();

            ArticulosElectronicos NuevaLaptop = new Laptops(Nombre,Modelo,precio,id,SistemaOP,Tamaño,MArca);
            System.out.println("dispositivo anadido correctamente");
            ListaDeArticulos.add(NuevaLaptop);
        }





    }
    public static int TipoDeArticulo(){
        Scanner sn = new Scanner(System.in);
        int opc;
        while(true){

            try {
                System.out.println("Ingrese Tipo de articulo \n 1.Moviles \n 2.Laptops");
                 opc = sn.nextInt();
                 if(opc==1 ) {
                     return opc;
                 }else if(opc==2){
                     return opc;
                 }else{
                     System.out.println("tipo incorrecto");
                 }



            }catch (Exception e ){
                System.out.println("Ingrese Valor adecuado");
            }finally {
                sn.nextLine();
            }
        }
    }
    public static void ConsultarArticulo(){
        Scanner sn = new Scanner(System.in);

        System.out.println("ingrese el id que desea consultar");int id=sn.nextInt();
        for(ArticulosElectronicos Articulo:ListaDeArticulos){
            Articulo.MostrarInformacion();


        }
    }

    public static void ModificarArticulo(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese id del dispositivo que quiere modificar  precio: ");int id=sn.nextInt();
        for(int i = 0;i<ListaDeArticulos.size(); i++ ){
            if(ListaDeArticulos.get(i).getId() ==id){
                System.out.println("ingrese el nuevo precio; ");
                ListaDeArticulos.get(i).setPrecio(sn.nextDouble());
                System.out.println("Dispositivo modificado correctamente");
            }
        }


    }


}

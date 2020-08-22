/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescriturametodo.pkg2;

/**
 *
 * @author Erick Unda
 */
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Scanner;


class Vehiculo{
    private String nombrePropietario;
    private int numeroCedula;
    private int edadPropietario;
    private String marca;
    private String tecnologia;
    private int modelo;
    public Vehiculo(){
        nombrePropietario="";
        numeroCedula=0;
        edadPropietario=0;
        marca="";
        tecnologia="";
        modelo=0;
    }
    public Vehiculo(String nombrePropietario,int numeroCedula,int edadPropietario,String marca, String tecnologia, int modelo){
        this.nombrePropietario=nombrePropietario;
        this.numeroCedula=numeroCedula;
        this.edadPropietario=edadPropietario;
        this.marca=marca;
        this.tecnologia=tecnologia;
        this.modelo=modelo;
    }
    public String getNombrePropietario(){
        return nombrePropietario;
    }
    public int getNumeroCedula(){
        return numeroCedula;
    }
    public int getEdadPropietario(){
        return edadPropietario;
    }
    public String getMarca(){
        return marca;
    }
    public String getTecnologia(){
        return tecnologia;
    }
    public int getModelo(){
        return modelo;
    }
}
class Automovil extends  Vehiculo{
    private String matriculaAutomovil;
    public Automovil(){
        super();
        matriculaAutomovil="Desconocido";
    }
    public Automovil(String nombrePropietario,int numeroCedula,int edadPropietario, String marca, String tecnologia, int modelo){
        super(nombrePropietario,numeroCedula,edadPropietario,marca,tecnologia,modelo);
        matriculaAutomovil="Desconocido";
    }
    public void setMatriculaAutomovil(String matriculaAutomovil){
        this.matriculaAutomovil=matriculaAutomovil;
    }
    public String getMatriculaAutomovil(){
        return matriculaAutomovil;
    }
    public void mostrarDatos(){
        System.out.println("Datos del Automóvil:\nMARCA DEL AUTOMÓVIL: "+
                getMarca()+"\n"+getTecnologia()+
                "MATRICULA DEL AUTOMÓVIL: "+getMatriculaAutomovil());
    }
    public void mostrarDatos1(){
        System.out.println("\nNOMBRE DEL PROPIETARIO: "+
                getNombrePropietario()+"\nNÚMERO DE CÉDULA:"+getNumeroCedula()+
                "\nEDAD: "+getEdadPropietario());
    }
}
class AutomovilAutonomo extends Automovil{
    private Calendar fechaComienzoFabricacionAutonomia;
    public AutomovilAutonomo(Calendar fechaComienzoFabricacionAutonomia){
        super();
        fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
    }
    public AutomovilAutonomo(String nombrePropietario,int numeroCedula,int edadPropietario, String marca,String tecnologia, int modelo,
            Calendar fechaComienzoFabricacionAutonomia){
        super(nombrePropietario,numeroCedula,edadPropietario,marca,tecnologia,modelo);
        this.fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
    }
    public Calendar getFechaComienzoFabricacionAutonomia(){
        return fechaComienzoFabricacionAutonomia;
    }
    public void mostrarDatos(){
        System.out.println("Datos del Automóvil Autonomo:\n MARCA DEL AUTOMÓVIL: "+
                getMarca()+"\n"+getTecnologia()+
                "MATRICULA DEL AUTOMÓVIL: "+getMatriculaAutomovil()+"\nFECHA DE FABRICACIÓN: "
               +fechaComienzoFabricacionAutonomia.getTime().toString()+"\n");
    }
    public void mostrarDatos1(){
        System.out.println("\nNOMBRE DEL PROPIETARIO: "+
                getNombrePropietario()+"\nNÚMERO DE CÉDULA:"+getNumeroCedula()+
                "\nEDAD: "+getEdadPropietario());
    }

}


class ListadoAutomoviles{
    private ArrayList<Automovil>ListadoAutomoviles;
    //Constructor
    public ListadoAutomoviles(){
        ListadoAutomoviles=new ArrayList<Automovil>();
    }
    //Métodos
    public void addAutomovil(Automovil automovil){
        ListadoAutomoviles.add(automovil);
    }//Cierre método addAutomovil
    public void Listar(){
        System.out.println("\n\t\tDATOS DE LOS AUTOMÓVILES EXISTENTE EN EL LISTADO:\n");
        for(Automovil ObjetoTmp:ListadoAutomoviles){//Uso de for extendido
            ObjetoTmp.mostrarDatos();{
            }
        }
    }
}

class ListadoPropietarios{
    private ArrayList<Automovil>ListadoPropietarios;
    //Constructor
    public ListadoPropietarios(){
        ListadoPropietarios=new ArrayList<Automovil>();
    }
    //Métodos
    public void addAutomovil(Automovil automovil){
        ListadoPropietarios.add(automovil);
    }//Cierre método addAutomovil
    public void Listar(){
        System.out.println("\n\t\tDATOS DE LOS PROPIETARIOS EXISTENTE EN EL LISTADO:");
        for(Automovil ObjetoTmp:ListadoPropietarios){//Uso de for extendido
            ObjetoTmp.mostrarDatos1();{
            }
        }
    }
}

public class SobreEscrituraMetodo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner eleccion = new Scanner(System.in);
        int opcion;
        int opcion1;
        int opcion2;
        int regresarMenu;

    do {

    System.out.println("\t\t SE CONOCEN DOS LISTAS CON DATOS DE VEHÍCULOS Y DE PROPIETARIOS.");
    System.out.println("1.DATOS DEL AUTOMÓVIL");
    System.out.println("2.DATOS DEL PROPIETARIO");
    System.out.println("3.SALIR\n");
    System.out.print("Ingrese la opción deseada: ");
    System.out.println();
    opcion = eleccion.nextInt();

        switch(opcion){

            case 1:


    System.out.println("\t\tSE CONOCE LOS DATOS DE UN AUTOMÓVIL DE LA MARCA FORD Y UN AUTOMÓVIL AUTÓNOMO DE LA MARCA NISSAN.");
    System.out.println("1.FORD");
    System.out.println("2.NISSAN\n");
    System.out.print("Ingrese la opción deseada: ");
    System.out.println();
        opcion1 = eleccion.nextInt();
        switch(opcion1){

        case 1:
       Automovil automovil1=new Automovil("",0,0,"Ford","TECNOLOGÍA: Canadiense\n",2018);
       automovil1.setMatriculaAutomovil("Ontario ABZM-264-20\n");
       ListadoAutomoviles listado1=new ListadoAutomoviles();
       listado1.addAutomovil(automovil1);

       listado1.Listar();

       break;

       case 2:

       Calendar fecha1=Calendar.getInstance();
       fecha1.set(2019,10,22);//Los meses van de 0 a 11, luego 10 representa noviembre
       AutomovilAutonomo autonomo1=new AutomovilAutonomo("",0,0,"Nissan","TECNOLOGÍA: EUROPEA\n",
       2020,fecha1);

       ListadoAutomoviles listado2=new ListadoAutomoviles();
       listado2.addAutomovil(autonomo1);

       listado2.Listar();

       break;
        }
        System.out.println("Ingrese cualquier número para regresar al menú de opciones.");
        regresarMenu = eleccion.nextInt();

        break;

            case 2:
            System.out.println("\t\tSE CONOCE LOS DATOS DE DOS PROPIETARIOS DE VEHÍCULOS.");
    System.out.println("1.PROPIETARIO DEL VEHÍCULO FORD");
    System.out.println("2.PROPIETARIO DEL VEHÍCULO NISSAN\n");
    System.out.print("Ingrese la opción deseada: ");
    System.out.println();
        opcion2 = eleccion.nextInt();
        switch(opcion2){

        case 1:
       System.out.println("\nDatos del propietario del vehículo Ford:");
       Automovil automovil2=new Automovil("ERICK UNDA",1725323877,22,"","",0);
       automovil2.setMatriculaAutomovil("Ontario ABZM-264-20\n");

       ListadoPropietarios listado3=new ListadoPropietarios();
       listado3.addAutomovil(automovil2);

       listado3.Listar();

    break;

       case 2:
       System.out.println("\nDatos del propietario del vehículo Nissan:");
       Automovil autonomo2=new Automovil("ALEX BELTRAN",1804432035,20,"","",0);


       ListadoPropietarios listado4=new ListadoPropietarios();
       listado4.addAutomovil(autonomo2);

       listado4.Listar();

    break;
    }

        System.out.println("\nIngrese cualquier número para regresar al menú de opciones.");
        regresarMenu = eleccion.nextInt();

    case 3:
        System.out.println("\n\n");
    break;

    default:
        System.out.println("\nLa opción no es válida, el programa se cerrará.\n\n");
        break;
    }
} while(opcion<=2);
    }

}

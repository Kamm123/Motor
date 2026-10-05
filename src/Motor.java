public class Motor {
    public String nombre;
    public double potencia;

    double velocidad;
    boolean encendido;

    //Metodos
    public void encender(){
        encendido = true;
        System.out.println("Encendiendo motor...");
        System.out.println("Motor Encendido correctamente.");
        System.out.println();
    }

    public void mostrarInformacion(){
        System.out.println("----Informacion general");
        System.out.println("Nombre: "+nombre);
        System.out.println("Potencia: "+potencia+" HP");
        System.out.println("Velocidad: "+velocidad+" km/h");
        System.out.println("Estado: "+(encendido? "Encendido" : "Apagado"));
        System.out.println();
    }

    void apagar(){
        encendido = false;
        System.out.println("Apagando motor...");
        System.out.println("Motor apagado correctamente.");
        System.out.println();

    }

    void mostrarEstado(){
        System.out.println("Estado del vehiculo");
        System.out.println("Estado: "+(encendido? "Encendido" : "Apagado"));
        System.out.println();
    }
}

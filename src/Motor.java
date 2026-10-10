public class Motor {
    private String nombre;
    private double potencia;

    private double velocidad;
    private boolean encendido;

    // set()
    public void setNombre(String nombre){
        if(null == nombre || nombre.isBlank()){
            System.out.println("El nombre no puede ser nulo ni estar vacio");
        } else {
            this.nombre = nombre;
        }
    }

    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    public void setPotencia(double potencia){
        this.potencia = potencia;
    }

    public void setEncendido(boolean encendido){
        this.encendido = encendido;
    }

    // get()
    public String getNombre(){
        return  nombre;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public double getPotencia(){
        return potencia;
    }

    public boolean isEncendido(){
        return encendido;
    }

    //Metodos
    public void encender(){
        this.encendido = true;
        System.out.println("Encendiendo motor...");
        System.out.println("Motor Encendido correctamente.");
        System.out.println();
    }

    void apagar(){
        this.encendido = false;
        System.out.println("Apagando motor...");
        System.out.println("Motor apagado correctamente.");
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

    void mostrarEstado(){
        System.out.println("Estado del vehiculo");
        System.out.println("Estado: "+(encendido? "Encendido" : "Apagado"));
        System.out.println();
    }
}

